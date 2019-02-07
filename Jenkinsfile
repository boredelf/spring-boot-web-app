pipeline {
   agent any

   // ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n")

   stages {
      stage('Release') {
         steps {
            script {
               TAGS = ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n")
               INPUT = input(
                  message: 'Select tag to build.',
                  parameters: [choice(name: 'TAG', description: 'Tag to build.', choices: TAGS)]
               )
            }
            sh "echo '${INPUT.TAG}'"
         }
      }
   }

   post {
      always {
         cleanWs()
      }
   }
}
