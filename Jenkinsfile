node {
   stage('Release') {
      String[] version = readMavenPom().getVersion().split('.')
      String releaseVersion = "${version[0]}.${version[1]}." + (version[2].toInteger() + 1)
      sh "mvn clean versions:set -DnewVersion=${releaseVersion}"
   }
}