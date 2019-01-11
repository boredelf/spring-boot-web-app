pipeline {
   agent any
   environment {
      VERSION = readMavenPom().getVersion().split("\\.")
      RELEASE_VERSION = "${VERSION[0]}.${VERSION[1]}.${VERSION[2].toInteger() + 1}"
   }
   stages {
      stage('Release') {
         steps {
            sh "mvn clean versions:set -DnewVersion=${RELEASE_VERSION} scm:tag"
         }
      }
   }
   post {
      always {
        cleanWs(skipWhenFailed: true)
      }
   }
}
