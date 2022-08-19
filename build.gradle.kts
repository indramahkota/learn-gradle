import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "com.indramahkota.exploration"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

println("This is executed during the configuration phase.")

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.register("configured") {
    println("This is also executed during the configuration phase, because :configured is used in the build.")
}

tasks.register("testOne") {
    doLast {
        println("This is executed during the execution phase.")
    }
}

tasks.register("testBoth") {
    doFirst {
        println("This is executed first during the execution phase.")
    }
    doLast {
        println("This is executed last during the execution phase.")
    }
    println("This is executed during the configuration phase as well, because :testBoth is used in the build.")
}

allprojects {
    // Set a default value
    extra["hasTests"] = false

    afterEvaluate {
        if (extra["hasTests"] as Boolean) {
            println("Adding test task to $project")
            tasks.register("test") {
                doLast {
                    println("Running tests for $project")
                }
            }
        }
    }
}

gradle.afterProject {
    if (state.failure != null) {
        println("Evaluation of $project FAILED")
    } else {
        println("Evaluation of $project succeeded")
    }
}