job('Jenkins example') {
    scm {
        git('git://github.com/wardviaene/docker-demo.git') {
        branches('master', '**/features*')
        scriptPath('Jenkinsfile')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}
