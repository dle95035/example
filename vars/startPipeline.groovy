def call() {
	pipeline {
		agent any
		stages {
			stage("init") {
				steps {
					sh 'echo this is initialization stage'
				}
			}
			stage("deploy") {
				steps {
					deploy()
					sh 'echo deployed successfully!'
				}
			}
		}
	}
}