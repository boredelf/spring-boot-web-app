pipeline {
   agent any

   stages {
      stage('Release') {
         steps {
            script {
               TAGS = sh(returnStdout: true, script: ${env.GIT_LIST_TAGS})
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
