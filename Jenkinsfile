pipeline {
    agent any

    stages {
        stage('Mongodb-compile') {
            steps {
                echo 'Validating & compiling'
                sh 'mvn validate compile'
            }
        }
        stage('Mongodb-Test') {
            steps {
                echo 'unit testing'
                sh 'mvn install -DskipTests'
            }
        }

        stage('Mongodb-Deploy-to-Appserver') {
            steps {
                sshPublisher(publishers: [sshPublisherDesc(configName: 'dev server', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: './apache-tomcat-7.0.107/webapps/', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: 'target/*.jar')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
                
            }
        }

  }
  }
