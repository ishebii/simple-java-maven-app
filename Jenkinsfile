pipeline {
  agent { label 'local' }
  tools {
    maven 'Maven-3.9'
    jdk 'JDK-21'  // Added JDK 21 to match project requirements
  }
  stages {
    stage('Build') {
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
        sh 'java -jar target/my-app-1.0-SNAPSHOT.jar'
      }
    }
  }
}
