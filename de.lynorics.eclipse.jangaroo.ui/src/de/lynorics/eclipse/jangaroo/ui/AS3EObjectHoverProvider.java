package de.lynorics.eclipse.jangaroo.ui;
 
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
 
public class AS3EObjectHoverProvider extends DefaultEObjectHoverProvider {
 
    @Override
    protected String getFirstLine(EObject o) {
        if (o instanceof de.lynorics.eclipse.jangaroo.aS3.Class) {
            return "Damn good class: " + o.eClass().getName();
        }
        return super.getFirstLine(o);
    }
 
}