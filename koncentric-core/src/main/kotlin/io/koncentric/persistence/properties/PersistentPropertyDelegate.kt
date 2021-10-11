/*
 * Copyright 2021 Koncentric, https://koncentric.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.koncentric.persistence.properties

import kotlin.reflect.KProperty
import kotlin.reflect.jvm.jvmErasure

/**
 * Utility to create a [PersistentPropertyDelegate] over an [IPersistentProperties] instance
 */
inline fun <reified T: Any> persistentDelegate(props: IPersistentProperties) = PersistentPropertyDelegate<T>(props)

/**
 * A kotlin friendly delegate for a property
 */
class PersistentPropertyDelegate<out T>(
    private val props: IPersistentProperties
) {

    @Suppress("UNCHECKED_CAST")
    operator fun getValue(obj: Any, property: KProperty<*>): T {
        return props.get(property, property.returnType.jvmErasure) as T
    }
}