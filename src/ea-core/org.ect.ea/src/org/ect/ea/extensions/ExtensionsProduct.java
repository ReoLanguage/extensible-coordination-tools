/*******************************************************************************
 * <copyright>
 * This file is part of the Extensible Coordination Tools (ECT).
 * Copyright (c) 2013 ECT developers. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 *******************************************************************************/
package org.ect.ea.extensions;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.ect.ea.EA;
import org.ect.ea.IExtensionDefinition;
import org.ect.ea.IExtensionProvider;
import org.ect.ea.IExtensionRegistry;

/**
 * Helper class for computing the product of two extensions.
 * @generated NOT
 * @author Christian Krause
 */
public class ExtensionsProduct {	
	
	// The extension registry.
	private static IExtensionRegistry REGISTRY = EA.getExtensionRegistry();
	
	/**
	 * Compute the product of two extensions.
	 * @param e1 First extension.
	 * @param e2 Second extension.
	 * @return List of product extensions.
	 */
	public static List<IExtension> compute(IExtension e1, IExtension e2) {
		
		// Get the extension definition and the provider.
		IExtensionDefinition definition = REGISTRY.findExtensionDefinition(e1.getId());
		IExtensionProvider provider = definition.getProvider();
		
		// Compute the product extensions.
		EList<IExtension> product = provider.computeProductExtensions(e1, e2);
		
		if (product==null) {
			EA.logError("Extension provider '" + definition.getId() + "' returned null as product extension.");
			product = new BasicEList<IExtension>();
		}
		
		// Make sure the extension id is correct.
		for (int i=0; i<product.size(); i++) {
			product.get(i).setId(e1.getId());
		}
		
		return product;
		
	}
	
}


