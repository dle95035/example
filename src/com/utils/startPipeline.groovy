def call() {
	pipeline {
		agent any
		stages {
			stage("init") {
				sh 'this is initialization stage'
			}
			stage("deploy") {
				deploy()
				sh 'deployed successfully!'
			}
		}
	}
}