job('Jenkins example') {

  def repo = 'https://github.com/nafridirfan/Jenkins.git'
    scm {
        git(repo) {
        sh 'git config user.email "irfan.daval@gmail.com"'
        sh 'git config user.name "nafridirfan"'
        branches('dev')
        scriptPath('Jenkinsfile')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}
