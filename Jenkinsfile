node {
   stage('Release') {
      sh 'ls -l'
      String[] version = readMavenPom().getVersion().split('.')
      print ${version}
      String releaseVersion = "${version[0]}.${version[1]}." + (version[2].toInteger() + 1)
      sh "mvn clean versions:set -DnewVersion=${releaseVersion}"
   }
}