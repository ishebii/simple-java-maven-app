pipeline {
  agent {
    label 'local'  // Force Jenkins to use the Maven-installed agent
  }
  stages {
    stage('Build') {
      steps {
        sh '/opt/maven/bin/mvn -B -DskipTests clean package'
      }
    }
  }
}
