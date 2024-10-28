def call(String image_name, String tag, String dockerHubUser){
  docker build -t ${dockerHubUser}/${image_name}:${tag} .
}
