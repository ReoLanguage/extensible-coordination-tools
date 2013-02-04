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
package org.ect.reo.animation;

import org.eclipse.emf.ecore.EClass;
import org.ect.reo.PrimitiveEnd;


/**
 * @see org.ect.reo.animation.AnimationPackage#getSendTokenStep()
 * @model kind="class"
 * @generated
 */
public class SendStep extends AnimationStep {

	/**
	 * @generated NOT
	 */
	public SendStep() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public SendStep(PrimitiveEnd end) {
		super(end);
	}

	/**
	 * @generated NOT
	 */
	public AnimationStep getCopy() {
		AnimationStep step = new SendStep();
		step.copyActiveEnds(this);
		return step; 
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		int hash = 5 + getActiveEnds().hashCode();
		return hash;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("send(");
		for (PrimitiveEnd end : getActiveEnds()) {
			result.append(end + ",");
		}
		result.append(")");
		return result.toString();
	}
	
	
	/* ---------------------------------------------------------------- *
	 * GENERATED CODE.                                                  *
	 * Do not edit below this line. If you need to edit, move it above  *
	 * this line and change the '@generated'-tag to '@generated NOT'.   *
	 * ---------------------------------------------------------------- */

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.SEND_STEP;
	}

}

