/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.RDFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.LiteralImpl#getLexicalForm <em>Lexical Form</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.LiteralImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.LiteralImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends NodeImpl implements Literal {
	/**
	 * The default value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalForm()
	 * @generated
	 * @ordered
	 */
	protected static final String LEXICAL_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalForm()
	 * @generated
	 * @ordered
	 */
	protected String lexicalForm = LEXICAL_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected Datatype datatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLexicalForm() {
		return lexicalForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexicalForm(String newLexicalForm) {
		String oldLexicalForm = lexicalForm;
		lexicalForm = newLexicalForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.LITERAL__LEXICAL_FORM, oldLexicalForm, lexicalForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.LITERAL__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (Datatype)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.LITERAL__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Datatype newDatatype) {
		Datatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.LITERAL__DATATYPE, oldDatatype, datatype));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDFPackage.LITERAL__LEXICAL_FORM:
				return getLexicalForm();
			case RDFPackage.LITERAL__LANG:
				return getLang();
			case RDFPackage.LITERAL__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RDFPackage.LITERAL__LEXICAL_FORM:
				setLexicalForm((String)newValue);
				return;
			case RDFPackage.LITERAL__LANG:
				setLang((String)newValue);
				return;
			case RDFPackage.LITERAL__DATATYPE:
				setDatatype((Datatype)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RDFPackage.LITERAL__LEXICAL_FORM:
				setLexicalForm(LEXICAL_FORM_EDEFAULT);
				return;
			case RDFPackage.LITERAL__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case RDFPackage.LITERAL__DATATYPE:
				setDatatype((Datatype)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RDFPackage.LITERAL__LEXICAL_FORM:
				return LEXICAL_FORM_EDEFAULT == null ? lexicalForm != null : !LEXICAL_FORM_EDEFAULT.equals(lexicalForm);
			case RDFPackage.LITERAL__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case RDFPackage.LITERAL__DATATYPE:
				return datatype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lexicalForm: ");
		result.append(lexicalForm);
		result.append(", lang: ");
		result.append(lang);
		result.append(')');
		return result.toString();
	}

} //LiteralImpl
