/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.highlighting;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Annotation;
import de.lynorics.eclipse.jangaroo.aS3.util.AS3Switch;

public class AS3HighlightingCalculator implements ISemanticHighlightingCalculator {

    @Override
    public void provideHighlightingFor( XtextResource resource, IHighlightedPositionAcceptor acceptor ) {
        if( resource == null ) {
            return;
        }

        HighlightingSwitch switcher = new HighlightingSwitch( acceptor );

        Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
        while(iter.hasNext()) {
            EObject current = iter.next();
            switcher.doSwitch( current );
        }
    }

    private class HighlightingSwitch extends AS3Switch<Void> {

        private final IHighlightedPositionAcceptor acceptor;

        public HighlightingSwitch( IHighlightedPositionAcceptor acceptor ) {
            this.acceptor = acceptor;
        }

        public Void caseAnnotation( Annotation object ) {
            INode node = getFirstFeatureNode( object, AS3Package.eINSTANCE.getAnnotation_Name() );
            highlightNode( node, AS3HighlightingConfiguration.ANNOTATION_ID );
            return null;
        }

        private void highlightNode( INode node, String id ) {
            if( node == null ) {
                return;
            }
            if( node instanceof ILeafNode ) {
                acceptor.addPosition( node.getOffset(), node.getLength(), id );
            } else {
                for( ILeafNode leaf : node.getLeafNodes() ) {
                    if( !leaf.isHidden() ) {
                        acceptor.addPosition( leaf.getOffset(), leaf.getLength(), id );
                    }
                }
            }
        }
    }

    public INode getFirstFeatureNode( EObject semantic, EStructuralFeature feature ) {
        if( feature == null ) {
            return NodeModelUtils.findActualNodeFor( semantic );
        }
        List<INode> nodes = NodeModelUtils.findNodesForFeature( semantic, feature );
        if( !nodes.isEmpty() ) {
            return nodes.get( 0 );
        }
        return null;
    }    

}
