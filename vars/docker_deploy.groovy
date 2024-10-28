def call(String image_name){
  sh "echo Deploying"
  sh "docker rm $(docker stop $(docker ps -a -q  --filter ancestor=${image_name} --format="{{.ID}}"))"
  sh "docker run -d -p 3000:3000 ${image_name}"
}
