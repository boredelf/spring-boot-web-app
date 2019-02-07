pipeline {
   agent any

   // ((String) sh(returnStdout: true, script: 'git tag -l')).split("\n")

   stages {
      stage('Release') {
         steps {
            script {
               TAGS = sh(returnStdout: true, script: 'git tag -l')
               INPUT = input(
                  message: 'Select tag to build.',
                  parameters: [choice(name: 'TAG', description: 'Tag to build.', choices: TAGS)]
               )
            }
            sh "echo '${INPUT}'"
         }
      }
   }

   post {
      always {
         cleanWs()
      }
   }
}
