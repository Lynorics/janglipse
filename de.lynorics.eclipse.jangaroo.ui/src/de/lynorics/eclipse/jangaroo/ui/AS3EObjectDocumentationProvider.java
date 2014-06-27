/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui;
 
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
 
public class AS3EObjectDocumentationProvider implements IEObjectDocumentationProvider {
 
    @Override
    public String getDocumentation(EObject o) {
        if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Class) {
            return "This is a nice Greeting with nice <b>markup</b> in the <i>documentation</i>";
        }
        return null;
    }
 
}