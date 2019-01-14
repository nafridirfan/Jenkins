pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
        echo "building.... "
        sh 'make'
      }
    }
    stage('Test'){
      steps{
        echo 'Testing.... '
      }
    }
    stage('Deploy'){
      steps{
        echo 'deploying.... '
      }
    }
  }
}
