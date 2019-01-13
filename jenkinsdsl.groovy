job('Jenkins example') {

  def repo = 'https://github.com/nafridirfan/Jenkins.git'
    scm {
        git(repo) {
            branches('dev')
            scriptPath('Jenkinsfile')

        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}
