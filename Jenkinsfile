pipeline {
   agent any

   stages {
      stage('Release') {
         steps {
            input(message: 'Select tag to build.',
               parameters: [choice(name: 'TAG', description: 'Tag to build.',
                  choices: sh(returnStdout: true, script: env.GIT_LIST_TAGS))
               ])
            sh "git checkout -q tags/${TAG} && cat Jenkinsfile"
         }
      }
   }

   post { always { cleanWs() } }
}
