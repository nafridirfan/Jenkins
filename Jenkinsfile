pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
        echo "building.... "
      }
    }
    stage('Test'){
      steps{
        echo 'Testing.... '
        }
    }
    stage('Deploy'){
      when{
        expression{
            currentBuild.result == null || currentBuild.result == 'FAILURE'
        }
      }
      steps{
        echo 'deploying.... '
        echo currentBuild.result
      }
    }
  }
}
