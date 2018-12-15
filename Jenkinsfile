pipeline {
   agent any

   def jdkVersion = '1.8'
   def mavenVersion = '3'

   stages {
      stage('Build') {
         steps {
            withMaven(maven: mavenVersion, jdk: jdkVersion) {
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
               withMaven(maven: mavenVersion, jdk: jdkVersion) {
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
