/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
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
package org.b3log.latke.ioc.provider;


import javax.enterprise.inject.spi.AnnotatedField;
import org.b3log.latke.ioc.LatkeBeanManager;


/**
 * Field provider.
 *
 * @param <T> the instance type to provide
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.9, Mar 30, 2010
 */
public final class FieldProvider<T> extends AbstractProvider<T> {

    /**
     * Constructs a field provider with the specified annotated element and bean manager.
     * 
     * @param beanManager the specified bean manager
     * @param annotatedField the specified annotated field
     */
    public FieldProvider(final LatkeBeanManager beanManager, final AnnotatedField<?> annotatedField) {
        super(beanManager, annotatedField);
    }

    @Override
    public String toString() {
        return "annotatedField[" + getAnnotated().toString() + "]";
    }
}