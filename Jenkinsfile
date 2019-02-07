pipeline {
   agent any
   stages {
      stage('Release') {
//         input {
//            message 'Select a tag to build'
//            parameters {
//               gitParameter(
//                  name: 'TAG',
//                  type: 'Tag',
//                  sortMode: 'DESCENDING_SMART'
//               )
//            }
//         }
         script {
            TAG = sh(returnStdout: true, script: """
               echo lero
            """)
         }
         steps {
            sh "echo '${TAG}'"
         }
      }
   }
}
