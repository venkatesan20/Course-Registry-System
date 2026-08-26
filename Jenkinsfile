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
                   for /f "tokens=5" %%a in ('C:\\Windows\\System32\\netstat.exe -aon ^| findstr :%APP_PORT% ^| findstr LISTENING') do (
                       taskkill /F /PID %%a
                   )

                   for /f %%f in ('dir /b target\\*.jar') do set JARFILE=%%f
                   echo Starting new application: %JARFILE%
                   start /B java -jar target\\%JARFILE%
               '''
               sleep(time: 15, unit: 'SECONDS')
           }
       }

       stage('Health Check') {
           steps {
               bat '''
                   C:\\Windows\\System32\\curl.exe -o NUL -s -w "%%{http_code}" http://localhost:%APP_PORT%/actuator/health > status.txt
                   set /p STATUS=<status.txt
                   echo App responded with HTTP status: %STATUS%
                   if "%STATUS%"=="000" (
                       echo App did not respond at all - deployment failed
                       exit /b 1
                   ) else (
                       echo App is up and responding
                   )
               '''
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