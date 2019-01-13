pipeline {
  agent any
  stages{
    stage('Build'){
      steps{
        echo 'build stage.... '
      }
    }
    stage('Test'){
      steps{
        echo 'Test stage.... '
      }
    }
    stage('Release'){
      steps{
        echo 'Release stage.... '
      }
    }
  }
}
