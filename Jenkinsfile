pipeline {
   agent any

   // ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n")

   parameters {
      choice(name: 'TAG', choices: [1, 2, 3])
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
