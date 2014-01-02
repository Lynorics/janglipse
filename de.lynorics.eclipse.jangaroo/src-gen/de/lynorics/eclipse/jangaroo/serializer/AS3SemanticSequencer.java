package de.lynorics.eclipse.jangaroo.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.ActionScript;
import de.lynorics.eclipse.jangaroo.aS3.Function;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.UNIT;
import de.lynorics.eclipse.jangaroo.aS3._String;
import de.lynorics.eclipse.jangaroo.aS3._int;
import de.lynorics.eclipse.jangaroo.aS3.number;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AS3SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AS3GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AS3Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AS3Package.ACTION_SCRIPT:
				if(context == grammarAccess.getActionScriptRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_ActionScript(context, (ActionScript) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.CLASS:
				if(context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Class(context, (de.lynorics.eclipse.jangaroo.aS3.Class) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FUNCTION:
				if(context == grammarAccess.getFunctionRule() ||
				   context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PACKAGE_DECLARATION:
				if(context == grammarAccess.getModelRule() ||
				   context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.UNIT:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUNITRule() ||
				   context == grammarAccess.getVariablesRule()) {
					sequence_UNIT(context, (UNIT) semanticObject); 
					return; 
				}
				else break;
			case AS3Package._STRING:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVariablesRule() ||
				   context == grammarAccess.get_StringRule()) {
					sequence__String(context, (_String) semanticObject); 
					return; 
				}
				else break;
			case AS3Package._INT:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVariablesRule() ||
				   context == grammarAccess.get_intRule()) {
					sequence__int(context, (_int) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NUMBER:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVariablesRule() ||
				   context == grammarAccess.getNumberRule()) {
					sequence_number(context, (number) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (imports+=Import* elements+=Type+)
	 */
	protected void sequence_ActionScript(EObject context, ActionScript semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superClass=[Class|ID]? properties+=Property*)
	 */
	protected void sequence_Class(EObject context, de.lynorics.eclipse.jangaroo.aS3.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.FUNCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.FUNCTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=PackageDeclaration
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURIPackageDeclarationParserRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName elemnts+=ActionScript)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Name=ID String='0x000000'?)
	 */
	protected void sequence_UNIT(EObject context, UNIT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Name=ID String=''?)
	 */
	protected void sequence__String(EObject context, _String semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Name=ID int='0'?)
	 */
	protected void sequence__int(EObject context, _int semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Name=ID double='0'?)
	 */
	protected void sequence_number(EObject context, number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
