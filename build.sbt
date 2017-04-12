import scalariform.formatter.preferences._
import com.typesafe.sbt.SbtScalariform._
import ScalariformKeys._

lazy val nonEmptyString: Project = Project(
   "nonEmptyString",
   file("nonemptystring"),
   settings = commonSettings ++ Seq(
      version := "1.0.0-SNAPSHOT",
      wartremoverErrors ++= Warts.allBut(
         Wart.ImplicitConversion,
         Wart.Overloading)))

lazy val pomStuff = {
  <url>https://github.com/ClaireNeveu/NonEmptyString</url>
  <licenses>
    <license>
      <name>BSD 3-Clause</name>
      <url>https://raw.githubusercontent.com/ClaireNeveu/NonEmptyString/master/LICENSE</url>
    </license>
  </licenses>
  <scm>
    <connection>scm:git:github.com/ClaireNeveu/NonEmptyString.git</connection>
    <developerConnection>scm:git:git@github.com:ClaireNeveu/NonEmptyString.git</developerConnection>
    <url>git@github.com:ClaireNeveu/NonEmptyString</url>
  </scm>
  <developers>
    <developer>
      <name>Claire Neveu</name>
      <url>claireneveu.com</url>
    </developer>
  </developers>
}

lazy val commonSettings = Defaults.defaultSettings ++ scalariformSettings ++Seq(
   organization := "com.claireneveu",
   scalaVersion := "2.11.8",
   crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0"),
   scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-feature",
      "-language:higherKinds",
      "-language:postfixOps",
      "-language:implicitConversions"
   ),
   useGpg := true,
   pomExtra := pomStuff,
   ScalariformKeys.preferences := ScalariformKeys.preferences.value
      .setPreference(IndentSpaces, 3)
      .setPreference(SpaceBeforeColon, true)
      .setPreference(PreserveDanglingCloseParenthesis, true)
      .setPreference(RewriteArrowSymbols, true)
      .setPreference(DoubleIndentClassDeclaration, true)
      .setPreference(AlignParameters, true)
      .setPreference(AlignSingleLineCaseStatements, true)
)
