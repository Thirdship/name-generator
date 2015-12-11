name := "name-generator"

version := "0.1.0"

organization := "com.thirdship"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test"
)

publishMavenStyle := true

publishTo := {
	val nexus = "http://maven.thirdship.com/"
	if (version.value.trim.endsWith("SNAPSHOT"))
		Some("snapshots" at nexus + "content/repositories/snapshots")
	else
		Some("releases"  at nexus + "content/repositories/releases")
}