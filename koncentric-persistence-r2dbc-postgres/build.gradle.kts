/*
 * Copyright 2021-2024 Koncentric, https://koncentric.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import Versions.Kotlin
import Versions.Test

plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib", Kotlin.version))
    implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", Kotlin.coroutinesVersion)
    implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-reactor", Kotlin.coroutinesVersion)
    implementation("org.postgresql", "r2dbc-postgresql", "1.0.7.RELEASE")
    implementation(project(":koncentric-core"))

    testImplementation("io.kotest", "kotest-runner-junit5", Test.kotestRunnerVersion)
    testImplementation("io.mockk", "mockk", Test.mockkVersion)
    testImplementation(enforcedPlatform("io.zonky.test.postgres:embedded-postgres-binaries-bom:${Test.embeddedPostgresVersion}"))
    testImplementation("com.opentable.components", "otj-pg-embedded", "1.1.0")
    testImplementation("org.slf4j", "slf4j-simple", Test.slf4jSimpleVersion)

    testImplementation(project(":test-domains:users-and-groups"))
}

//apply(from = "../publishing.gradle.kts")
