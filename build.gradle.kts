plugins {
    // apply the java plugin to add support for Java
    java

    // apply the application plugin to add support for building an application
    application
}

group = "uk.ac.southampton.ecs"
version = "1.0"

repositories {
    flatDir {
        // list local directories that contain dependencies
        dirs("genius", "gurobi")
    }
}

dependencies {
    // Genius
    implementation("genius:genius:9.1.12")

    // Gurobi
    implementation("gurobi:gurobi:9.1.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

application {
    // define the main class for the application
    mainClass.set("genius.gui.MainPanel")
}

tasks {
    withType<JavaCompile> {
        // always run clean before compile
        dependsOn("clean")
    }

    named<JavaExec>("run") {
        workingDir = file("genius")
    }

    register<JavaExec>("runTournament") {
        group = "application"
        workingDir = file("genius")
        classpath = sourceSets["main"].runtimeClasspath
        main = "genius.cli.Runner"
        args("multilateraltournament.xml", "log/log1")
    }

    withType<Jar> {
        // include all main source code
        from(sourceSets["main"].allSource).into("/")
    }
}
