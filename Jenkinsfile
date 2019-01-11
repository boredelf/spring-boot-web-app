pipeline {
   agent any
   environment {
      VERSION = readMavenPom().getVersion().split("\\.")
      RELEASE_VERSION = "${VERSION[0]}.${VERSION[1]}.${VERSION[2].toInteger() + 1}"
   }
   stages {
      stage('Release') {
         steps {
            sh "mvn versions:set -DnewVersion=${RELEASE_VERSION}"
            sh "mvn scm:checkin scm:tag -Dmessage='Release ${RELEASE_VERSION}.'"
         }
      }
   }
   post {
      always {
        cleanWs(skipWhenFailed: true)
      }
   }
}
