/*
 * Copyright 2000-2014 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.idea.declarator7;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.PlatformPatterns;

/**
 * Provides various helper methods for connectors. Meant for internal use.
 *
 * @author Vaadin Ltd
 */
public class VaadinDeclaratorCompletionContributor extends CompletionContributor {
    public VaadinDeclaratorCompletionContributor() {
        extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement(XmlTokenType.XML_TAG_CHARACTERS).withLanguage(VaadinDeclaratorLanguage.INSTANCE),
                PlatformPatterns.psiElement(),
                new VaadinDeclaratorCompletionProvider()
        );
    }


}
