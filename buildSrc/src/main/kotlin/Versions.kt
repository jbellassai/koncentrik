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

object JVM {
    const val target: String = "11"
}

object Versions {
    object Kotlin {
        const val version = "1.5.31"
        const val coroutinesVersion = "1.5.2"
        const val dokkaVersion = "1.5.30"
    }

    object Common {
        const val vavrVersion = "1.0.0-alpha-3"
        const val r2dbcPostgresqlVersion = "1.0.7.RELEASE"
    }

    object Test {
        const val kotestRunnerVersion = "4.6.3"
        const val mockkVersion = "1.12.0"
        const val embeddedPostgresVersion = "11.13.0"
        const val zonkyVersion = "1.3.1"
        const val slf4jSimpleVersion = "1.7.32"
        const val flywayVersion = "7.15.0"
    }
}