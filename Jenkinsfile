@Library('pipeline_library') _
pipeline {
    agent any

    stages {
        stage('git'){
            steps{
                git branch:'main', url:'https://shitunjay:Shit9454..Sjeh@github.com/shitunjay/pipeline.git'
            }
        }
        stage('code stability') {
            steps {
                pipeline('compile')
                //echo "Hello"
            }
        }
    }
}
