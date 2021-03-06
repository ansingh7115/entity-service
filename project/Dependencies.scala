import sbt._

object Dependencies {
  val catsV           = "1.4.0"
  val catsEffectV     = "1.0.0"
  val jacksonV        = "2.9.5"
  val googleV         = "1.23.0"
  val scalaLoggingV   = "3.9.0"
  val scalaTestV      = "3.0.5"
  val slickV          = "3.2.3"
  val postgresDriverV = "42.2.4"
  val socketFactoryV  = "1.0.10"
  val dbcpV           = "2.5.0"
  val sttpV           = "1.3.1"
  val circeV          = "0.10.0"
  val javaxServletV   = "3.1.0"
  val jerseyV         = "2.26"

  val workbenchUtilV    = "0.3-0e9d080"
  val workbenchModelV   = "0.11-2ce3359"
  val workbenchGoogleV  = "0.16-c5b80d2"
  val workbenchMetricsV = "0.3-c5b80d2"

  val samV =  "1.0-5cdffb4"

  val excludeAkkaActor =        ExclusionRule(organization = "com.typesafe.akka", name = "akka-actor_2.12")
  val excludeGuavaJDK5 =        ExclusionRule(organization = "com.google.guava", name = "guava-jdk5")
  val excludeWorkbenchUtil =    ExclusionRule(organization = "org.broadinstitute.dsde.workbench", name = "workbench-util_2.12")
  val excludeWorkbenchModel =   ExclusionRule(organization = "org.broadinstitute.dsde.workbench", name = "workbench-model_2.12")
  val excludeWorkbenchMetrics = ExclusionRule(organization = "org.broadinstitute.dsde.workbench", name = "workbench-metrics_2.12")

  val jacksonAnnotations: ModuleID = "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonV
  val jacksonDatabind: ModuleID =    "com.fasterxml.jackson.core" % "jackson-databind"    % jacksonV
  val jacksonCore: ModuleID =        "com.fasterxml.jackson.core" % "jackson-core"        % jacksonV
  val jacksonScalaModule: ModuleID = "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.6"

  val ravenLogback: ModuleID =   "com.getsentry.raven"        %  "raven-logback"   % "8.0.3"
  val scalaLogging: ModuleID =   "com.typesafe.scala-logging" %% "scala-logging"   % scalaLoggingV
  val ficus: ModuleID =          "com.iheart"                 %% "ficus"           % "1.4.3"
  val cats: ModuleID =           "org.typelevel"              %% "cats-core"       % catsV
  val catsEffect: ModuleID =     "org.typelevel"              %% "cats-effect"     % catsEffectV
  val enumeratum: ModuleID =     "com.beachape"               %% "enumeratum"      % "1.5.13"

  val javaxServlet: ModuleID = "javax.servlet" % "javax.servlet-api" % javaxServletV % "provided"
  val jerseyServer: ModuleID = "org.glassfish.jersey.core" % "jersey-server" % jerseyV
  val glassFish: ModuleID = "org.glassfish.jersey.containers" % "jersey-container-servlet" % jerseyV
  val glassFishInject: ModuleID = "org.glassfish.jersey.inject" % "jersey-hk2" % jerseyV

  val googleEndpointsFramework = "com.google.endpoints" % "endpoints-framework" % "2.1.1"
  val googleEndpointsManagementControl = "com.google.endpoints" % "endpoints-management-control-appengine" % "1.0.8"
  val googleEndpointsAuth = "com.google.endpoints" % "endpoints-framework-auth" % "1.0.8"
  val googleLogging = "com.google.cloud" % "google-cloud-logging" % "1.35.0"

  val googleAppEngine = "com.google.appengine" % "appengine-api-1.0-sdk" % "1.9.64"

  val googleOAuth2: ModuleID = "com.google.auth" % "google-auth-library-oauth2-http" % "0.9.1"
  val googleSourceRepositories: ModuleID = "com.google.apis" % "google-api-services-sourcerepo" % s"v1-rev21-$googleV" excludeAll(excludeGuavaJDK5)


  val scalaTest: ModuleID =  "org.scalatest"   %% "scalatest"       % scalaTestV % "test"
  val mockito: ModuleID =    "org.mockito"     % "mockito-core"     % "2.20.1"   % "test"
  val mockServer: ModuleID = "org.mock-server" % "mockserver-netty" % "5.4.1"    % "test"

  // Exclude workbench-libs transitive dependencies so we can control the library versions individually.
  // workbench-google pulls in workbench-{util, model, metrics} and workbench-metrics pulls in workbench-util.
  val workbenchUtil: ModuleID =      "org.broadinstitute.dsde.workbench" %% "workbench-util"    % workbenchUtilV
  val workbenchModel: ModuleID =     "org.broadinstitute.dsde.workbench" %% "workbench-model"   % workbenchModelV
  val workbenchGoogle: ModuleID =    "org.broadinstitute.dsde.workbench" %% "workbench-google"  % workbenchGoogleV excludeAll(excludeWorkbenchUtil, excludeWorkbenchModel, excludeWorkbenchMetrics)
  val workbenchGoogleTests: ModuleID = "org.broadinstitute.dsde.workbench" %% "workbench-google" % workbenchGoogleV % "test" classifier "tests" excludeAll(excludeWorkbenchUtil, excludeWorkbenchModel)
  val workbenchMetrics: ModuleID =   "org.broadinstitute.dsde.workbench" %% "workbench-metrics" % workbenchMetricsV excludeAll(excludeWorkbenchUtil)

  val sam: ModuleID = "org.broadinstitute.dsde.sam-client" %% "sam" % samV

  val slickPg: ModuleID = "com.github.tminglei" %% "slick-pg" % "0.16.3"
  val slickPgCirce: ModuleID = "com.github.tminglei" %% "slick-pg_circe-json" % "0.16.3"
  val slick: ModuleID =     "com.typesafe.slick" %% "slick" % slickV
  val dbcp2: ModuleID = "org.apache.commons" % "commons-dbcp2" % dbcpV

  val postgresDriver: ModuleID = "org.postgresql" % "postgresql" % postgresDriverV
  val socketFactory: ModuleID = "com.google.cloud.sql" % "postgres-socket-factory" % socketFactoryV

  val sttp: ModuleID =      "com.softwaremill.sttp" %% "core"                           % sttpV
  val sttpCats: ModuleID =  "com.softwaremill.sttp" %% "async-http-client-backend-cats" % sttpV

  val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % circeV)

  val json4sNative = "org.json4s" %% "json4s-native" % "3.6.1" % "test"

  val rootDependencies = circe ++ Seq(
    // proactively pull in latest versions of Jackson libs, instead of relying on the versions
    // specified as transitive dependencies, due to OWASP DependencyCheck warnings for earlier versions.
    jacksonAnnotations,
    jacksonDatabind,
    jacksonCore,
    jacksonScalaModule,
    json4sNative,

    ravenLogback,
    scalaLogging,
    ficus,
    cats,
    catsEffect,
    enumeratum,

    javaxServlet,
    jerseyServer,
    glassFish,
    glassFishInject,
    sttp,
    sttpCats,

    googleEndpointsFramework,
    googleEndpointsManagementControl,
    googleEndpointsAuth,
    googleLogging,

    googleAppEngine,

    googleOAuth2,
    googleSourceRepositories,

    scalaTest,
    mockito,
    mockServer,

    slick,
    slickPg,
    slickPgCirce,
    postgresDriver,
    socketFactory,
    dbcp2,

    workbenchUtil,
    workbenchModel,
    workbenchGoogle,
    workbenchGoogleTests,
    workbenchMetrics,
    sam
  )
}