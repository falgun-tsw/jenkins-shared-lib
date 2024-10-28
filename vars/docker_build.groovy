def call(String image_name, String tag, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${image_name}:${tag} ."
}
