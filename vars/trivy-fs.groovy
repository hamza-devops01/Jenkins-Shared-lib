df call(){
  sh "trivy fs . -o result.json"
}
