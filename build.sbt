name := "spark-streaming-kinesis-elasticsearch"

organization := "com.oomatomo"

version := "0.0.1"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "1.5.0",
    "org.apache.spark" %% "spark-streaming" % "1.5.0",
    "org.apache.spark" %% "spark-streaming-kinesis-asl" % "1.5.0",
    "org.apache.spark" %% "spark-streaming-twitter" % "1.5.0",
    "org.specs2" %% "specs2" % "2.4" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

initialCommands := "import com.oomatomo.sparkstreamingkinesiselasticsearch._"

fork := true
