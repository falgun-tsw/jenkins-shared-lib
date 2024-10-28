def call(String dockerHubCred, String image_name, String tag) {
  echo "pushing to docker hub"
  withCredentials([usernamePassword(credentialsId: '${dockerHubCred}', usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
  echo "logging in docker"
  sh 'docker login -u $dockerHubUser -p $dockerHubPass'
  echo "tagging image"
  sh 'docker tag ${image_name} $dockerHubUser/${image_name}:${tag}'
  echo "pushing to docker"
  sh 'docker push $dockerHubUser/${image_name}:${tag}'
}
