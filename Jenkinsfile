pipeline {
  agent { label 'local' }
  tools {
    maven 'Maven-3.9'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
  }
}
