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
    stage('Environment Variables'){
        steps{
            echo 'Displaying Environment Variables.... '
            echo env.BUILD_ID
            echo env.BUILD_NUMBER
            echo env.JOB_NAME
            echo env.JENKINS_URL
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
