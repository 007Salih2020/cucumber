
node() {
        def agent = 'Big-Old-52'
		def repoURL='https://github.com/007Salih2020/cucumber.git'

		stage("Prepare Workspace"){
			cleanWs()
			env.WORKSPACE_LOCAL=sh(returnStdout:true,script:'pwd').trim()
			echo"Workspace set to:"+env.WORKSPACE_LOCAL
		}
		stage('Checkout Self'){
		git branch:'cucumber',credentialsId:'',url:repoURL
		}
		stage('Cucumber Tests'){
			withMaven(maven:'maven363'){
				sh """
					cd ${env.WORKSPACE_LOCAL}
					mvn clean test
				"""
			}
		}
		stage('Expose report'){
			archive "**/cucumber.json"
			cucumber '**/cucumber.json'
		}

    stage('Import results to Xray') {

        def description ='[BUILD_URL|${env.BUILD_URL}]'
        def labels = '{"label1", "label2"}'
        def environment = "TEST"
        def testExecutionFieldId = 10202
        def testEnvironmentFieldName = "customfield_10125"
        def projectKey ="SPEL"
        def xrayConnectorId= 'cf8f2169-00d6-4f95-9ec3-7fd75314c344'



        step([$class: 'XrayImportBuilder', endpointName: '/cucumber/multipart', importFilePath: 'target\\cucumber.json', importInParallel: 'false', importInfo: '''environment = "TEST"
        testExecutionFieldId = 10202
        testEnvironmentFieldName =10125
        projectKey ="SPEL"
        xrayConnectorId= \'cf8f2169-00d6-4f95-9ec3-7fd75314c344\'
        labels
        description''', inputInfoSwitcher: 'fileContent', serverInstance: 'SERVER-cf8f2169-00d6-4f95-9ec3-7fd75314c344'])
    }
}
