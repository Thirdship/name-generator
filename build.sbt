name := "names-generator"

version := "1.0"

organization := "com.thirdship"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test"
)

publishMavenStyle := true

publishTo <<= version { (v: String) =>
	val nexus = "https://oss.sonatype.org/"
	if (v.trim.endsWith("SNAPSHOT"))
		Some("snapshots" at nexus + "content/repositories/snapshots")
	else
		Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false }

//pomExtra := <url>http://jsuereth.com/scala-arm</url>
//	<licenses>
//		<license>
//			<name>MIT</name>
//			<url>http://opensource.org/licenses/MIT</url>
//			<distribution>repo</distribution>
//		</license>
//	</licenses>
//	<scm>
//		<url>git@github.com:jsuereth/scala-arm.git</url>
//		<connection>scm:git:git@github.com:jsuereth/scala-arm.git</connection>
//	</scm>
//	<developers>
//		<developer>
//			<id>jsuereth</id>
//			<name>Josh Suereth</name>
//			<url>http://jsuereth.com</url>
//		</developer>
//	</developers>