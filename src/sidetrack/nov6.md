## Recap 

CI / CD 
jenkins
Github actions
Circle CI


github -----> maven build ----> sonar qube test  ----> deployed to DEV 
                                                            |
        deployed to Production   < -            deplpyed to UAT

Sudo yum install -y maven


Jenkins 

pipeline {
agent any

    stages {
        stage('Clone github project') {
            steps {
                git branch: 'master', url: 'https://github.com/Surinder07/spring-jpa-relationships.git'
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Compile') {
            steps {
                 sh 'mvn compile'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Sonar qube quality test') {
            steps {
                echo 'running sonar qube'
                
            }
        }
        stage('Build docker image') {
            steps {
                echo 'Docker'
            }
        }
        stage('Push image to ECR') {
            steps {
                echo 'ECR'
                 sleep 20
            }
        }
        stage('deploy to DEV') {
            steps {
                echo 'Deploy code to dev envirnment'
                 sleep 20
            }
        }
        stage('Deplpoy to Staging') {
            steps {
                echo 'Deploy code to staging envirnment'
                 sleep 10
            }
        }
        stage('Deplpoy to PRODUCTION') {
            steps {
                echo 'Deploy code to PRODUCTION envirnment'
                 sleep 30
            }
        }
    }
}


