job('Jenkins example') {

  def repo = 'https://github.com/nafridirfan/Jenkins.git'
    scm {
        git(repo) {
            gitConfigName('nafrid')
            gitConfigEmail('irfan.daval@gmail.com')
            branches('dev')
            scriptPath('Jenkinsfile')

        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}
