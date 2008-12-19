/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id$ */

package org.apache.fop.render.afp.extensions;

/**
 * This is the pass-through value object for the AFP extension.
 */
public class AFPPageSetup extends AFPExtensionAttachment {

    /**
     * Default constructor.
     *
     * @param elementName the name of the setup code object, may be null
     */
    public AFPPageSetup(String elementName) {
        super(elementName);
    }

    private static final long serialVersionUID = -549941295384013190L;

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return "AFPPageSetup(element-name=" + getElementName()
            + " name=" + getName() + " value=" + getValue() + ")";
    }
}
