pipeline {
  agent { label 'local' }
  tools {
    maven 'Maven-3.9'
    jdk 'JDK-21'
  }
  options {
    skipDefaultCheckout()
  }
  stages {
    stage('Checkout') {
      steps {
        checkout scm
        echo "Building branch: ${env.GIT_BRANCH}"
      }
    }
    stage('Build') {
      when {
        expression { return env.GIT_BRANCH ==~ /origin\/(test|master)/ }
      }
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
      }
    }
    stage('Deliver') {
      steps {
        sh 'java -jar target/my-app-1.0-SNAPSHOT.jar > app.log &'
      }
    }
  }
}
