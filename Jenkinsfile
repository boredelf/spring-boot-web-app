pipeline {
   agent any
   stages {
      stage('Release') {
         input {
            message 'Select a tag to build'
            parameters {
               gitParameter(
                  name: 'TAG',
                  type: 'Tag',
                  sortMode: DESCENDING_SMART
               )
            }
         }
         steps {
            sh "echo '${TAG}'"
         }
      }
   }
}
