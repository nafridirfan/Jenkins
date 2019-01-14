pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
        echo "building.... "
        sh 'make'
        archiveArtifacts artifacts: '**/Users/irfan/Documents/Jenkins_Workspace/*.jar', fingerprint: true
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
