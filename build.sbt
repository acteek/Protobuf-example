name := "protobuf-test"

version := "1.0"

scalaVersion := "2.11.7"

PB.targets in Compile := Seq(
  scalapb.gen(
    flatPackage = false,
    javaConversions = false,
    grpc = true,
    singleLineToString = true
    ) -> (sourceManaged in Compile).value
)


libraryDependencies ++= Seq(
  "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf",
  "io.grpc" % "grpc-netty" % com.trueaccord.scalapb.compiler.Version.grpcJavaVersion,
  "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % com.trueaccord.scalapb.compiler.Version.scalapbVersion,
  "com.typesafe" % "config" % "1.3.0",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0",
  "com.trueaccord.scalapb" %% "scalapb-json4s" % "0.3.2"
 )


        