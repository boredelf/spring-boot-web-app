pipeline {
   agent any
   stages {
      stage('Build') {
         steps {
            withMaven(maven: '3', jdk: '1.8') {
               sh 'mvn package'
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
                  sh "mvn -B release:prepare"
               }
            }
         }
      }
   }
   post {
      always { cleanWs(skipWhenFailed: true) }
   }
}
