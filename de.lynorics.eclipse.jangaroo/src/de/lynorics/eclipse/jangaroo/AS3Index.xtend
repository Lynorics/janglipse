/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo;

import com.google.inject.Inject
import de.lynorics.eclipse.jangaroo.aS3.AS3Package
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer.Manager
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

/**
 * Index helper
 */
class AS3Index {

	@Inject
	ResourceDescriptionsProvider rdp;
	
	@Inject
	Manager cm;
	
	def getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource);
		index.getResourceDescription(o.eResource.URI);
	}

	def getExportedEObjectDescriptions(EObject o) {
		o.resourceDescription.getExportedObjects
	}

	def getVisibleEObjectDescriptions(EObject o) {
		o.getVisibleContainers.map[
			container |
			container.getExportedObjects
		].flatten
	}
	
	def getVisibleEObjectDescriptions(EObject o, EClass type) {
		o.getVisibleContainers.map[
			container |
			container.getExportedObjectsByType(type)
		].flatten
	}
	
	def getVisibleClassesDesscriptions(EObject o) {
		o.getVisibleEObjectDescriptions(AS3Package::eINSTANCE.class_)
	}
	
	def getVisibleContainers(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource);
		val rd = index.getResourceDescription(o.eResource.URI);
		cm.getVisibleContainers(rd, index);
	}
}
