import AssemblyKeys._

assemblySettings

organization  := "tud.robolab"

version       := "0.1"

scalaVersion  := "2.10.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javacOptions += "-g:none"

compileOrder in Test := CompileOrder.JavaThenScala

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/"
)

publishArtifact in (Test, packageBin) := true

libraryDependencies ++= Seq(
  "io.spray"            %   "spray-can"     % "1.1-M8",
  "io.spray"            %   "spray-routing" % "1.1-M8",
  "io.spray"            %   "spray-client"  % "1.1-M8",
  "io.spray"            %   "spray-util"    % "1.1-M8",
  "io.spray"            %%  "spray-json"    % "1.2.5",
  "io.spray"            %   "spray-testkit" % "1.1-M8",
  "com.typesafe.akka"   %%  "akka-actor"    % "2.1.4",
  "com.typesafe.akka"   %%  "akka-testkit"  % "2.1.4",
  "org.scalatest"       % "scalatest_2.10"  % "1.9.2",
  "org.jgrapht"         % "jgrapht-jdk1.5"  % "0.7.3"
)

seq(Revolver.settings: _*)

mainClass in assembly := Some("Main")

jarName in assembly := "RobolabSimTestLocal.jar"

test in assembly := {}
