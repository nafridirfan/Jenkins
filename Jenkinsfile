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
            echo "Running ${env.BUILD_ID} and ${env.BUILD_NUMBER} and ${env.JOB_NAME} on the Jenkins URL $(env.JENKINS_URL)
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
