job('Jenkins example') {
    scm {
        git('https://github.com/nafridirfan/Jenkins.git') {
        branches('master', '**/features*')
        scriptPath('Jenkinsfile')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}
