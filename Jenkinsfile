pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withMaven(maven: '3.5.4', jdk: '1.8') {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Release') {
            steps {
                sh 'echo Release'
            }
        }
    }
}