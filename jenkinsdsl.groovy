job('Jenkins example') {
    scm {
        git('https://github.com/nafridirfan/Jenkins.git') {
        branches('dev')
        scriptPath('Jenkinsfile')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}
