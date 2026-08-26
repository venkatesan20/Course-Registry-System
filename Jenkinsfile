pipeline {
    agent any

    tools {
        jdk 'JDK-25'
        maven 'Maven-3.9.16'
    }

    environment {
        APP_PORT = '9000'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            steps {
                bat '''
                    echo Stopping any process on port %APP_PORT%...
                    for /f "tokens=5" %%a in ('netstat -aon ^| findstr :%APP_PORT% ^| findstr LISTENING') do (
                        taskkill /F /PID %%a
                    )
                    echo Starting new application...
                    start /B java -jar target\\*.jar --server.port=%APP_PORT%
                '''
                sleep(time: 15, unit: 'SECONDS')
            }
        }

        stage('Health Check') {
            steps {
                bat 'curl --fail http://localhost:%APP_PORT%/actuator/health || exit /b 1'
            }
        }
    }

    post {
        success {
            echo "Build, Test, and Deployment completed successfully on port ${APP_PORT}!"
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}