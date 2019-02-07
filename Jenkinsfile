pipeline {
   agent any
   stages {
      stage('Release') {
         script {
            TAG = sh(returnStdout: true, script: """
               echo lero
            """)
         }
         steps {
            sh "echo '${TAG}'"
         }
      }
   }
}
