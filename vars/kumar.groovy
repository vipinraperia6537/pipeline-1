#!/usr/bin/env groovy
def jobmvn(command){
    sh "mvn ${command}"
}
def clonegit(){
  git branch:"$branch", url:"$url"
}
