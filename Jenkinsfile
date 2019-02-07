pipeline {
   agent any

   // ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n")

   stages {
      stage('Release') {
         parameters {
            choice(name: 'TAG', choices: ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n"))
         }
         steps {
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
