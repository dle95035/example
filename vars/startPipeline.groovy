def call() {
	pipeline {
		agent any
		stages {
			stage("init") {
				steps {
					sh 'this is initialization stage'
				}
			}
			stage("deploy") {
				steps {
					deploy()
					sh 'deployed successfully!'
				}
			}
		}
	}
}