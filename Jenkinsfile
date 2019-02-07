pipeline {
   agent any

   // ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n")

   stages {
      stage('Release') {
         steps {
            script {
               input(
                  message: 'Select tag to build.',
                  parameters: [
                     choice(
                        name: 'TAG',
                        description: 'Tag to build.',
                        choices: ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n"))
                  ]
               )
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
