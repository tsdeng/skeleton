name := "skeleton"

organization := "com.example"

version := "1.0"

scalaVersion := "2.9.3"

libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test"
)

EclipseKeys.withSource := true
