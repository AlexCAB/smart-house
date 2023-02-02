/**********************************************
  o-o                 o      o  o
 |                    |      |  |
  o-o  o-O-o  oo o-o -o-     O--O o-o o  o o-o
     | | | | | | |    |      |  | | | |  |  \
 o--o  o o o o-o-o    o      o  o o-o o--o o-o

author: CAB
website: github.com/alexcab
created: 2023-02-02
**********************************************/


lazy val root = project
  .in(file("."))
  .settings(
    name := "SmartHouseBackend",
    organization := "com.cab",
    version := "0.1.0-SNAPSHOT",
    scalacOptions ++= List("-encoding", "utf8", "-deprecation", "-feature", "-unchecked"),
    javacOptions ++= Seq("-source", "jvm-17", "-target", "jvm-17"),

    scalaVersion := "3.2.2",

    libraryDependencies ++= Seq(
	    "com.typesafe.akka" %% "akka-stream"         % "2.8.0-M4",

      "org.scalatest"     %% "scalatest"           % "3.2.15"   % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.8.0-M4" % Test,
	  )
  )
