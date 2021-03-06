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
package org.ect.convert.umlsd2reo.sdmodel;

/**
 * UMLSD to REO 
 * Project for Coordination and Component Composition Course
 * 2008 Leiden University
 * 
 * A class that represent the beginning of a coregion.
 * 
 * @author Eccher Alessandro
 *
 */
public class SDCoregionStart extends SDAction {
	
	SDParticipant participant;
	
	protected SDCoregionStart(SDParticipant participant){
		this.participant=participant;
	}
	
	public boolean isRelatedTo(SDParticipant participant) {
		return this.participant.equals(participant);
	}
}
