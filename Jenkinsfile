pipeline {
   agent any
   stages {
      stage('Build') {
         steps {
            withMaven(maven: '3', jdk: '1.8') {
               withSonarQubeEnv('Default') {
                  sh 'mvn package sonar:sonar'
               }
            }
         }
      }
      stage('Quality Gate') {
         steps {
            timeout(time: 1, unit: 'HOURS') {
               waitForQualityGate abortPipeline: true
            }
         }
      }
      stage('Release') {
         steps {
            input message: 'Publish new release?'
            withCredentials([
               usernamePassword(
                  credentialsId: 'github',
                  usernameVariable: 'githubUsername',
                  passwordVariable: 'githubPassword'
               )
            ]) {
               withMaven(maven: '3', jdk: '1.8') {
                  def releaseVersion = readMavenPom().getVersion().split('.').getAt(2).toInteger() + 1
                  sh "mvn clean versions:set -DnewVersion=${releaseVersion}"
               }
            }
         }
      }
      stage('Deploy') {
         steps {
            sh 'echo App deployed!'
         }
      }
   }
   post {
      success {
         // cleanWs(skipWhenFailed: true)
      }
   }
}
