pipeline {
   agent any
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
            String[] version = readMavenPom().getVersion().split('.')
            String releaseVersion = "${version[0]}.${version[1]}." + (version[2].toInteger() + 1)
            sh "mvn clean versions:set -DnewVersion=${releaseVersion}"
         }
      }
//      stage('Deploy') {
//         steps {
//            sh 'echo App deployed!'
//         }
//      }
   }
   post {
      success {
         // cleanWs(skipWhenFailed: true)
      }
   }
}
