pipeline {
   agent any
   pre {

   }
   environment {
      VERSION = readMavenPom().getVersion().split('.')
//      RELEASE_VERSION = "${VERSION[0]}.${VERSION[1]}.(${VERSION[2].toInteger() + 1})"
   }
   stages {
//      stage('Build') {
//         steps {
//            withMaven(maven: '3', jdk: '1.8') {
//               withSonarQubeEnv('Default') {
//                  sh 'mvn package sonar:sonar'
//               }
//            }
//         }
//      }
//      stage('Quality Gate') {
//         steps {
//            timeout(time: 1, unit: 'HOURS') {
//               waitForQualityGate abortPipeline: true
//            }
//         }
//      }
      stage('Release') {
         steps {
            print "$VERSION"
//            sh "mvn clean versions:set -DnewVersion=${releaseVersion}"
         }
      }
//      stage('Deploy') {
//         steps {
//            sh 'echo App deployed!'
//         }
//      }
   }
//   post {
//      success {
//        cleanWs(skipWhenFailed: true)
//      }
//   }
}
