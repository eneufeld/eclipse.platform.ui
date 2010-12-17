/**
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      IBM Corporation - initial API and implementation
 */
package org.eclipse.e4.ui.model.application.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getIconURI <em>Icon URI</em>}</li>
 *   <li>{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLocalLabel <em>Local Label</em>}</li>
 *   <li>{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLocalTooltip <em>Local Tooltip</em>}</li>
 *   <li>{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLocalImage <em>Local Image</em>}</li>
 * </ul>
 * </p>
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MUILabel {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Icon URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon URI</em>' attribute.
	 * @see #setIconURI(String)
	 * @model
	 * @generated
	 */
	String getIconURI();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getIconURI <em>Icon URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon URI</em>' attribute.
	 * @see #getIconURI()
	 * @generated
	 */
	void setIconURI(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @model
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Local Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Label</em>' attribute.
	 * @see #setLocalLabel(String)
	 * @model transient="true"
	 * @generated
	 */
	String getLocalLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLocalLabel <em>Local Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Label</em>' attribute.
	 * @see #getLocalLabel()
	 * @generated
	 */
	void setLocalLabel(String value);

	/**
	 * Returns the value of the '<em><b>Local Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Tooltip</em>' attribute.
	 * @see #setLocalTooltip(String)
	 * @model transient="true"
	 * @generated
	 */
	String getLocalTooltip();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLocalTooltip <em>Local Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Tooltip</em>' attribute.
	 * @see #getLocalTooltip()
	 * @generated
	 */
	void setLocalTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Local Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Image</em>' attribute.
	 * @see #setLocalImage(Object)
	 * @model transient="true"
	 * @generated
	 */
	Object getLocalImage();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.ui.MUILabel#getLocalImage <em>Local Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Image</em>' attribute.
	 * @see #getLocalImage()
	 * @generated
	 */
	void setLocalImage(Object value);

} // MUILabel
