name := """drl-parsing"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq (
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "org.drools" % "drools-core" % "6.1.0.Final",
  "org.drools" % "drools-compiler" % "6.1.0.Final",
  "org.kie" % "kie-api" % "6.1.0.Final",
  "org.kie" % "kie-internal" % "6.1.0.Final"
)
