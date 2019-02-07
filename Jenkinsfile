pipeline {
   agent any

   stages {
      stage('Release') {
         input {
            message 'Select tag to build.'
            parameters { choice(name: 'TAG', description: env.GIT_LIST_TAGS, choices: [1,2]) }
         }
         steps {
            print "${TAG}"
//            sh "git checkout -q tags/${TAG} && cat Jenkinsfile"
         }
      }
   }

   post { always { cleanWs() } }
}
