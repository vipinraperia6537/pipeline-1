@Library('pipeline_library@lib') _
pipeline {
    agent any

    stages {
        stage('git'){
            steps{
                git branch:'main', url:'https://shitunjay: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@github.com/shitunjay/pipeline.git'
            }
        }
        stage('code stability') {
            steps {
                script('compile')
                //echo "Hello"
            }
        }
    }
}
