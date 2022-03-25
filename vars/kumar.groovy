#!/usr/bin/env groovy
def jobmvn(command){
    sh "mvn ${command}"
}
def clone(){
    config = readProperties file: 'Configuration'
    git branch:${config.git_branch},url:${config.git_url}
}
