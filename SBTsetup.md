### SBT: 

> SBT is an open-source build tool for Scala and Java projects, similar to Apache’s >Maven. It is the interactive build tool for Scala, Java and many more. This shell >has a command prompt. 
> For example, you could type compile at the sbt shell: > compile. To compile >again, press up arrow and then enter. To run your program, type run . To leave sbt >shell, type exit or use Ctrl+D (Unix) or Ctrl+Z (Windows).
 
##### To setup Sbt using brew on Mac: 

- Open the terminal

- Type ~ brew search sbt 
> It will show you the whole list of sbt

- Two formula will be displayed in the terminal sbt and sbt@0.13 
> To install the older version, you can select sbt@0.13 and for newer and updated version, you should choose sbt

- Type ~ brew info sbt 
> It will show you the detail informations

> Meanwhile, you may need to install Java OpenJDK on macOS; for that
- a) Open a browser, write adoptopenjdk.net and choose a version (OpenJDK 11 LTS, Hotspot as a JVM). After downloading the package file, extract it and install it 

- b) Open the terminal, type java -version (To see OpenJDK version)

- c) type java -version (To see javac version)

- d) Search for OpenJDK on a browser, click on ‘install’ and click on ‘jdk.java.net/13’ or as required and choose macOS version x64 

- e)A package file will be downloaded. Then extract it and check the java -version by typing it again. 

- Type ~ brew install sbt (Downloading process will continue)

- Type ~ sbt sbtVersion (To check sbt version)