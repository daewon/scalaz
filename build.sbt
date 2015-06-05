name := "scalaz-test"

version := "0.1"

sbtVersion := "0.13.8"

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-Yrangepos"
)

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.2"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test"


resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots"
)

initialCommands += """
import scalaz._
import Scalaz._
import std._
"""

initialCommands in console += """
"""
