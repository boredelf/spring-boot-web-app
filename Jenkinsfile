pipeline {
   agent any

   stages {
      stage('Release') {
         steps {
            script {
               TAG = sh(returnStdout: true, script: 'git tag -l').trim()
            }
            sh "echo '${TAG}'"
         }
      }
   }

   post {
      always {
         cleanWs()
      }
   }
}
