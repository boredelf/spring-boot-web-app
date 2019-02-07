pipeline {
   agent any

   stages {
      stage('Release') {
         steps {
            script {
               TAG = sh(returnStdout: true, script: """
               echo lero
            """)
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
