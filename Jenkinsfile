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
  }
  }
