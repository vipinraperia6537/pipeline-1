#!/usr/bin/env groovy
def call(command){
    sh "mvn ${command}"
}
