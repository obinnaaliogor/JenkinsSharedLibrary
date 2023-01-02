
def call(String mavenGoal){

if ("${mavenGoal}" == "validate"){
sh "echo 'Validating the project structure'"
sh "mvn validate"
}

else if ("${mavenGoal}" == "compile"){
sh "echo 'Compiling of the Java classes into bytecode'"
sh "mvn compile"
}

else if ("${mavenGoal}" == "test"){
sh "echo 'Running Junit Testing'"
sh "mvn test"
}


else if ("${mavenGoal}" == "package"){
sh "echo 'Creating an Artifacts in the target Directory'"
sh "mvn clean package"
}

else if ("${mavenGoal}" == "clean"){
sh "echo 'Cleaning Artifacts from the Maven Local Repo'"
sh "mvn clean"
}

}
