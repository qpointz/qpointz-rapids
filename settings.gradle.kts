/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/8.0.2/userguide/multi_project_builds.html
 * This project uses @Incubating APIs which are subject to change.
 */

rootProject.name = "rapids"

include (":rapids-core")
include (":rapids-jdbc-driver")
include (":rapids-jdbc-driver")
//include (":rapids-server")
include (":rapids-srv-worker")

include (":etc:msynth")
project(":etc:msynth").projectDir = file("etc/msynth")


dependencyResolutionManagement {

    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            version("lombok", "1.18.26")
            library("lombok", "org.projectlombok", "lombok").versionRef("lombok")


            version("calcite", "1.34.0")
            library("calcite-core", "org.apache.calcite", "calcite-core").versionRef("calcite")
            library("calcite-testkit", "org.apache.calcite", "calcite-testkit").versionRef("calcite")
            library("calcite-file", "org.apache.calcite", "calcite-file").versionRef("calcite")
            library("calcite-csv", "org.apache.calcite", "calcite-csv").versionRef("calcite")


            version("avatica", "1.22.0")
            library("avatica-core", "org.apache.calcite.avatica", "avatica-core").versionRef("avatica")
            library("avatica-server", "org.apache.calcite.avatica", "avatica-server").versionRef("avatica")

            version("rest-assured", "5.3.0")
            library("rest-assured", "io.rest-assured", "rest-assured").versionRef("rest-assured")

            val quarkus = version("quarkus", "2.16.6.Final")
            library("quarkus-bom", "io.quarkus.platform", "quarkus-bom").versionRef(quarkus)
            library("quarkus-arc", "io.quarkus", "quarkus-arc").versionRef(quarkus)
            library("quarkus-resteasy-reactive", "io.quarkus", "quarkus-resteasy-reactive").versionRef(quarkus)
            library("quarkus-resteasy-reactive-jackson", "io.quarkus", "quarkus-resteasy-reactive-jackson").versionRef(quarkus)

            library("quarkus-junit5", "io.quarkus", "quarkus-junit5").versionRef(quarkus)
            library("quarkus-config-yaml", "io.quarkus", "quarkus-config-yaml").versionRef(quarkus)
            library("quarkus-vertx", "io.quarkus", "quarkus-vertx").versionRef(quarkus)
            library("quarkus-container-image-docker", "io.quarkus", "quarkus-container-image-docker").versionRef(quarkus)


            val apacheArrowFlight = version("arrow", "11.0.0")
            library("arrow-format", "org.apache.arrow", "arrow-format").versionRef(apacheArrowFlight)
            library("arrow-jdbc", "org.apache.arrow", "arrow-jdbc").versionRef(apacheArrowFlight)
            library("arrow-vector", "org.apache.arrow", "arrow-vector").versionRef(apacheArrowFlight)
            library("arrow-flight-core", "org.apache.arrow", "flight-core").versionRef(apacheArrowFlight)
            library("arrow-flight-grpc", "org.apache.arrow", "flight-grpc").versionRef(apacheArrowFlight)
            library("arrow-flight-sql", "org.apache.arrow", "flight-sql").versionRef(apacheArrowFlight)

            val apacheMinaFtpServer = version("minaftpserver", "1.2.0")
            library("apache-mina-ftpserver-core", "org.apache.ftpserver", "ftpserver-core").versionRef(apacheMinaFtpServer)
            library("apache-mina-ftpserver-ftplet-api", "org.apache.ftpserver", "ftplet-api").versionRef(apacheMinaFtpServer)
            library("apache-mina-ftpserver", "org.apache.ftpserver", "ftpserver").versionRef(apacheMinaFtpServer)

            val apacheParuet = version("apacheParquet", "1.13.0")
            library("parquet-avro","org.apache.parquet", "parquet-avro").versionRef(apacheParuet)
            library("parquet-common","org.apache.parquet", "parquet-common").versionRef(apacheParuet)
            library("parquet-column","org.apache.parquet", "parquet-column").versionRef(apacheParuet)
            library("parquet-hadoop","org.apache.parquet", "parquet-hadoop").versionRef(apacheParuet)

            val apacheHadoop = version("apacheHadoop", "3.3.2")
            library("hadoop-common","org.apache.hadoop", "hadoop-common" ).versionRef(apacheHadoop)
            library("hadoop-client","org.apache.hadoop", "hadoop-client" ).versionRef(apacheHadoop)

            val apacheAvro = version("apacheAvro", "1.11.1")
            library("avro", "org.apache.avro", "avro").versionRef(apacheAvro)
            library("avro-mapred", "org.apache.avro", "avro-mapred").versionRef(apacheAvro)

            /*val graphQl = version("graphql", "20.2")
            library("graphql-java", "com.graphql-java", "graphql-java").versionRef(graphQl)*/

            val junit = version("junit", "5.9.2")
            library("junit-jupiter-api", "org.junit.jupiter", "junit-jupiter-api").versionRef(junit)
            library("junit-jupiter-engine", "org.junit.jupiter", "junit-jupiter-engine").versionRef(junit)
            library("junit-vintage-engine", "org.junit.vintage", "junit-vintage-engine").versionRef(junit)

            library("azure-storage-file-datalake", "com.azure", "azure-storage-file-datalake").version("12.15.0")
            library("azure-storage-blob-nio", "com.azure", "azure-storage-blob-nio").version("12.0.0-beta.19")

            val vertx = version("vertx", "4.4.1")
            library("vertx-core", "io.vertx", "vertx-core").versionRef(vertx)

            val smallrye = version("smallrye", "3.2.1")
            library("smallrye-config", "io.smallrye.config", "smallrye-config").versionRef(smallrye)
            library("smallrye-config-source-yaml", "io.smallrye.config", "smallrye-config-source-yaml").versionRef(smallrye)

            val microprofile = version("microprofile", "3.0.2")
            library("microprofile-config-api", "org.eclipse.microprofile.config", "microprofile-config-api").versionRef(microprofile)

            library("slf4j-api", "org.slf4j", "slf4j-api").version("2.0.7")
            library("logback-classic", "ch.qos.logback", "logback-classic").version("1.4.6")
            bundle("logging", listOf("slf4j-api", "logback-classic"))

            val spring = version("spring", "6.0.8")
            library("spring-context", "org.springframework","spring-context").versionRef(spring)

            val postgre = version("postgre", "42.6.0")
            library("postgresql", "org.postgresql","postgresql").versionRef(postgre)

            val sdl = version("sdl","2.10.23")
            library("sdl-odata-service","com.sdl", "odata_service").versionRef(sdl)
            library("sdl-odata-common","com.sdl", "odata_common").versionRef(sdl)
            library("sdl-odata-api","com.sdl", "odata_api").versionRef(sdl) //- Framework APIs
            library("sdl-odata-processor","com.sdl", "odata_parser").versionRef(sdl) //- OData URI parser
            library("sdl-odata-renderer","com.sdl", "odata_renderer").versionRef(sdl) //- Renderers for Atom and JSON output
            library("sdl-odata-edm","com.sdl", "odata_edm").versionRef(sdl) //- The OData EDM metadata (Entity Data Model)
            //odata_assembly - Assembly structure for standalone distribution
            //odata_checkstyle - Checkstyle configuration
            //odata_client - OData Java Client library
            //odata_common - Common packages and utilities
            //odata_controller - Spring Boot REST controller
            //odata_parser
            //odata_processor - Handlers for processing requests
            //odata_service - The core OData service and Akka based processing engine
            //odata_test - Test components
            //odata_war - OData WAR distribution artifact
            //odata_webservice - Spring Boot based OData HTTP webservice container

            val olingo = version("olingo", "4.9.0")
            library("olingo-odata-server-core", "org.apache.olingo", "odata-server-core").versionRef(olingo)
            library("olingo-odata-server-api", "org.apache.olingo", "odata-server-api").versionRef(olingo)
            library("olingo-odata-commons-api", "org.apache.olingo", "odata-commons-api").versionRef(olingo)
            library("olingo-odata-commons-core", "org.apache.olingo", "odata-commons-core").versionRef(olingo)


            val jetty = version("jetty","9.4.44.v20210927")
            //library("jetty-http", "org.eclipse.jetty","jetty-http").versionRef(jetty)
            library("jetty-server", "org.eclipse.jetty","jetty-server").versionRef(jetty)
            library("jetty-servlet", "org.eclipse.jetty","jetty-servlet").versionRef(jetty)


            //bundle("quarkus-base-impl", listOf("quarkus-arc", "quarkus-config-yaml"))
            //bundle("quarkus-base-test", listOf("quarkus-junit5"))
        }
    }
}

pluginManagement {
    val quarkusPluginVersion: String by settings
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        id("io.quarkus") version quarkusPluginVersion
    }
}
