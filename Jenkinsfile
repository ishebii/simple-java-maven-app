pipeline {
  agent {
    label 'local'   // This matches the label in your screenshot
  }
  stages {
    stage('Build') {
      steps {
        sh '/opt/maven/bin/mvn -B -DskipTests clean package'
      }
    }
  }
}
