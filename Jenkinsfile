pipeline {
   agent any

   parameters {
      choice(name: 'TAG', choices: ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n"))
   }

   stages {
      stage('Release') {
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
