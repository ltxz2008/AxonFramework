/*
 * Copyright (c) 2011. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.saga.annotation;

/**
 * Enumeration containing the possible Creation Policies for Sagas.
 *
 * @author Allard Buijze
 * @since 0.7
 */
public enum SagaCreationPolicy {

    /**
     * Never create a new Saga instance, even if none exists.
     */
    NONE,

    /**
     * Only create a new Saga instance if none can be found.
     */
    IF_NONE_FOUND,

    /**
     * Always create a new Saga, even if one already exists.
     */
    ALWAYS
}
