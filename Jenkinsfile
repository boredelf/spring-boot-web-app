pipeline {
   agent any

   stages {
      stage('Release') {
         environment {
            LERO = 'lero'
         }
         input {
            message 'Select tag to build.'
            parameters { choice(name: 'TAG', description: LERO, choices: [1,2]) }
         }
         steps {
            print "${TAG}"
//            sh "git checkout -q tags/${TAG} && cat Jenkinsfile"
         }
      }
   }

   post { always { cleanWs() } }
}
