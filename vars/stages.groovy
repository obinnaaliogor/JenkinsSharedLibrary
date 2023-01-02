def call(String stagename){

if ("${stagename}" == "Build"){
sh "echo 'Running Junit testing'"
sh "echo 'Test must pass to create an Artifacts'"
sh "mvn clean package"

}
else if ("${stagename}" == "SonarQube Report"){
sh "echo 'Running Code Quality Review and Analysis'"
sh "mvn sonar:sonar"
}

else if ("${stagename}" == "Upload Into Nexus"){
sh "echo 'Uploading Artifacts into Artifactory'"
sh "mvn deploy"
}

}
