@Library('pipeline_library@lib') _
properties([gitLabConnection(gitLabConnection: '', jobCredentialId: 'github'), parameters([string('Url'), string('branch')])])

pipeline {
    agent any
    stages {
        stage('Git'){
            steps {
                script{
                //config = readProperties file: 'Configuration'
                //echo "$config.git_url"
                //echo "$config.git_branch"
                kumar.clonegit()
                }
            }
        }
        stage('Code stability'){
            steps {
                script{
                kumar('compile')
                }
            }
        }
        stage('Code Quality'){
            steps {
                script{
                   kumar('checkstyle:checkstyle')
                }
            }
        }
         stage('Code Coverage'){
            steps {
                script{
                   kumar('cobertura:cobertura')
                }
            }   
        }
        stage('Code Coverage Report'){
            steps {
                script{
                cobertura coberturaReportFile: '**target/site/cobertura/coverage.xml'
                }
            }
        }
    }
    post { 
        always { 
            cleanWs()
        }
        failure {
            mail to: 'shitunjay.kumar@mygurukulam.org',
            subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
            body: "Something is wrong with ${env.BUILD_URL}"
        }
        success {
            mail to: 'shitunjay.kumar@mygurukulam.org',
            subject: "Pipeline successful: ${currentBuild.fullDisplayName}",
            body: "This build is successful with ${env.BUILD_URL}"
        }
    }
}
