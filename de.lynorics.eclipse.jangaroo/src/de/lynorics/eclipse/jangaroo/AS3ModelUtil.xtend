package de.lynorics.eclipse.jangaroo;

import static extension org.eclipse.xtext.EcoreUtil2.*;
import org.eclipse.emf.ecore.EObject
import de.lynorics.eclipse.jangaroo.aS3.Block

class AS3ModelUtil {

  def static containingBlock(EObject e) {
    e.getContainerOfType(typeof(Block));
  } 
 
}