pipeline {
  agent { label 'local' }
  tools {
    maven 'Maven-3.9'
    jdk 'JDK-17'  // Added JDK 17 to fix Java version issue
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
    }
    stage('Verify') {
      steps {
        sh 'java -version'
        sh 'mvn --version'
      }
    }
  }
}
