@Library('pipeline_library@main') _
pipeline {
    agent any

    stages {
        stage('git'){
            steps{
                git branch:'main', url:'https://shitunjay:Shit9454..Sjeh@gitlab.com/shitunjay/pipeline_project.git'
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
