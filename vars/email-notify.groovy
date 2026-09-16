def call(){
emailext (
                from: 'hamzasajjad3141@gmail.com',
                to: 'hamzasajjad3141@gmail.com',
                subject: "✅ SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "Build Successful!\n\nConsole log attached hai.",
                attachmentsPattern: '**/result.json',
                mimeType: 'text/plain'
            )
        }
    }
    
    failure {
        script {
            emailext(
                from: 'hamzasajjad3141@gmail.com',
                to: 'hamzasajjad3141@gmail.com',
                subject: "❌ FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "Build Failed!\n\nConsole log attached hai.",
                attachmentsPattern: '**/result.json',
                mimeType: 'text/plain'
            )
        }
    }
}
