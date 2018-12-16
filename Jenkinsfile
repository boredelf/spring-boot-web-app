pipeline {
   agent any
   stages {
      stage('Build') {
         steps {
            withMaven(maven: '3', jdk: '1.8') {
               sh 'mvn package'
            }
            cleanWs
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
                  sh "mvn -B release:prepare"
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
      always { cleanWs(skipWhenFailed: true) }
   }
}
