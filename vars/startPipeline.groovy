def call(Map Params) {
	pipeline {
		agent any
		environment {
			DLE_CREDS = credentials('DavidLe')
		}
		stages {
			stage("init") {
				steps {
					sh 'echo this is initialization stage'
					echo Params.team_url
					echo DLE_CREDS_USR
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