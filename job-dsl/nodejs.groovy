job('NodeJS example') {
    scm {
        git('https://github.com/zohaibjahandad/jenkins-course.git') {  node -> // is hudson.plugins.git.GitSCM

        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
