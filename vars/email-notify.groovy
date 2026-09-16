def call(String jobName, String buildNumber, boolean isSuccess) {
    def statusIcon  = isSuccess ? '✅ SUCCESS' : '❌ FAILED'
    def statusText  = isSuccess ? 'Build Successful!' : 'Build Failed!'
    
    emailext(
        from: 'hamzasajjad3141@gmail.com',
        to: 'hamzasajjad3141@gmail.com',
        subject: "${statusIcon}: ${jobName} #${buildNumber}",
        body: "${statusText}\n\nConsole log attached hai.",
        attachmentsPattern: '**/result.json',
        mimeType: 'text/plain'
    )
}
