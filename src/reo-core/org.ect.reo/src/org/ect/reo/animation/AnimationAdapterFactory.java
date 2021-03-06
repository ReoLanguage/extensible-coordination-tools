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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.ect.reo.Nameable;
import org.ect.reo.colouring.Colourable;
import org.ect.reo.colouring.Colouring;
import org.ect.reo.colouring.ColouringTable;



/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ect.reo.animation.AnimationPackage
 * @generated
 */
public class AnimationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnimationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnimationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationSwitch<Adapter> modelSwitch =
		new AnimationSwitch<Adapter>() {
			@Override
			public Adapter caseAnimatable(Animatable object) {
				return createAnimatableAdapter();
			}
			@Override
			public Adapter caseAnimation(Animation object) {
				return createAnimationAdapter();
			}
			@Override
			public Adapter caseAnimationTable(AnimationTable object) {
				return createAnimationTableAdapter();
			}
			@Override
			public Adapter caseAnimationStep(AnimationStep object) {
				return createAnimationStepAdapter();
			}
			@Override
			public Adapter caseCreateStep(CreateStep object) {
				return createCreateStepAdapter();
			}
			@Override
			public Adapter caseSendStep(SendStep object) {
				return createSendStepAdapter();
			}
			@Override
			public Adapter caseReceiveStep(ReceiveStep object) {
				return createReceiveStepAdapter();
			}
			@Override
			public Adapter caseReplicateStep(ReplicateStep object) {
				return createReplicateStepAdapter();
			}
			@Override
			public Adapter caseDestroyStep(DestroyStep object) {
				return createDestroyStepAdapter();
			}
			@Override
			public Adapter caseColourable(Colourable object) {
				return createColourableAdapter();
			}
			@Override
			public Adapter caseColouring(Colouring object) {
				return createColouringAdapter();
			}
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseColouringTable(ColouringTable object) {
				return createColouringTableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.Animatable <em>Animatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.Animatable
	 * @generated
	 */
	public Adapter createAnimatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.Animation
	 * @generated
	 */
	public Adapter createAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.AnimationStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.AnimationStep
	 * @generated
	 */
	public Adapter createAnimationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.CreateStep <em>Create Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.CreateStep
	 * @generated
	 */
	public Adapter createCreateStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.SendStep <em>Send Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.SendStep
	 * @generated
	 */
	public Adapter createSendStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.ReceiveStep <em>Receive Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.ReceiveStep
	 * @generated
	 */
	public Adapter createReceiveStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.ReplicateStep <em>Replicate Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.ReplicateStep
	 * @generated
	 */
	public Adapter createReplicateStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.DestroyStep <em>Destroy Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.DestroyStep
	 * @generated
	 */
	public Adapter createDestroyStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.animation.AnimationTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.animation.AnimationTable
	 * @generated
	 */
	public Adapter createAnimationTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.colouring.Colourable <em>Colourable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.colouring.Colourable
	 * @generated
	 */
	public Adapter createColourableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.colouring.Colouring <em>Colouring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.colouring.Colouring
	 * @generated
	 */
	public Adapter createColouringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ect.reo.colouring.ColouringTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ect.reo.colouring.ColouringTable
	 * @generated
	 */
	public Adapter createColouringTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnimationAdapterFactory
