pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '/usr/bin/mvn -B -DskipTests clean package'
      }
    }
  }
}

