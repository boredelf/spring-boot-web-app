pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withMaven(maven: '3', jdk: '1.8') {
                    sh "mvn -B release:prepare -DpreparationGoals='clean'"
                }
            }
        }
        stage('Release') {
            steps {
                sh 'echo Release'
            }
        }
    }
    post {
        always {
            cleanWs(skipWhenFailed: true)
        }
    }
}
