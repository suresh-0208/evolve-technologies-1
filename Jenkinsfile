pipeline {
    agent any

    environment {
        IMAGE_NAME = 'evolve-technologies-web'
        REGISTRY = 'umamahesh571'
        DOCKER_IMAGE = "${REGISTRY}/${IMAGE_NAME}"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/umamahesh571/evolve-technologies-1.git'
            }
        }

        stage('Build WAR') {
            steps {
                script {
                    sh 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t ${DOCKER_IMAGE} .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    sh 'docker push ${DOCKER_IMAGE}'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    sh 'kubectl apply -f kubernetes/deployment.yaml'
                    sh 'kubectl apply -f kubernetes/service.yaml'
                }
            }
        }
    }
}
