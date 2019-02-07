pipeline {
   agent any

   environment {
      TAGS = sh(returnStdout: true, script: env.GIT_LIST_TAGS).split("\n")
   }

   stages {
      stage('Release') {
//         input {
//            message 'Select tag to build.'
//            parameters { choice(name: 'TAG', description: 'Tag to build.', choices: env.TAGS) }
//         }
         steps {
            print "${TAGS}"
//            sh "git checkout -q tags/${TAG} && cat Jenkinsfile"
         }
      }
   }

   post { always { cleanWs() } }
}
