name := "play-datomisca-getting-started"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:reflectiveCalls", "-language:implicitConversions")

resolvers ++= Seq(
  Resolver.bintrayRepo("dwhjames", "maven"),
  "clojars" at "https://clojars.org/repo"
)

libraryDependencies ++= Seq(
  "com.datomic" % "datomic-free" % "0.9.5344",
  "com.github.dwhjames" %% "datomisca" % "0.7.0",
  "com.github.dwhjames" %% "datomisca-play-plugin" % "0.7.0"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(SbtWeb)
