/**
 * 
 */
package org.mobicents.protocols.ss7.tcap.tc.dialog.events;

import org.mobicents.protocols.ss7.tcap.api.ComponentPrimitiveFactory;
import org.mobicents.protocols.ss7.tcap.api.DialogPrimitiveFactory;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.Dialog;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCBeginIndication;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCBeginRequest;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCContinueIndication;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCContinueRequest;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCEndIndication;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCEndRequest;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCPAbortIndication;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCUniIndication;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCUniRequest;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCUserAbortIndication;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCUserAbortRequest;
import org.mobicents.protocols.ss7.tcap.asn.ApplicationContextName;
import org.mobicents.protocols.ss7.tcap.asn.TcapFactory;
import org.mobicents.protocols.ss7.tcap.asn.UserInformation;
import org.mobicents.protocols.ss7.tcap.tc.component.ComponentPrimitiveFactoryImpl;

/**
 * @author baranowb
 * @author amit bhayani
 * 
 */
public class DialogPrimitiveFactoryImpl implements DialogPrimitiveFactory {

	private ComponentPrimitiveFactoryImpl componentPrimitiveFactory;

	public DialogPrimitiveFactoryImpl(ComponentPrimitiveFactory componentPrimitiveFactory) {
		this.componentPrimitiveFactory = (ComponentPrimitiveFactoryImpl) componentPrimitiveFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.DialogPrimitiveFactory
	 * #createBegin(org.mobicents.protocols.ss7.tcap.api.tc.dialog.Dialog)
	 */
	public TCBeginRequest createBegin(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCBeginRequestImpl tcbr = new TCBeginRequestImpl();
		tcbr.setDialog(d);
		tcbr.setDestinationAddress(d.getRemoteAddress());
		tcbr.setOriginatingAddress(d.getLocalAddress());
		return tcbr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.DialogPrimitiveFactory
	 * #createContinue(org.mobicents.protocols.ss7.tcap.api.tc.dialog.Dialog)
	 */
	public TCContinueRequest createContinue(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCContinueRequestImpl tccr = new TCContinueRequestImpl();
		tccr.setDialog(d);
		tccr.setOriginatingAddress(d.getLocalAddress());

		return tccr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.DialogPrimitiveFactory
	 * #createEnd(org.mobicents.protocols.ss7.tcap.api.tc.dialog.Dialog)
	 */
	public TCEndRequest createEnd(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCEndRequestImpl tcer = new TCEndRequestImpl();
		tcer.setDialog(d);
		// FIXME: add dialog portion fill
		return tcer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.DialogPrimitiveFactory#createUAbort
	 * (org.mobicents.protocols.ss7.tcap.api.tc.dialog.Dialog)
	 */
	public TCUserAbortRequest createUAbort(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCUserAbortRequestImpl tcer = new TCUserAbortRequestImpl();
		tcer.setDialog(d);
		// FIXME: add dialog portion fill
		return tcer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.DialogPrimitiveFactory
	 * #createUni(org.mobicents.protocols.ss7.tcap.api.tc.dialog.Dialog)
	 */
	public TCUniRequest createUni(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCUniRequestImpl tcur = new TCUniRequestImpl();
		tcur.setDialog(d);
		tcur.setDestinationAddress(d.getRemoteAddress());
		tcur.setOriginatingAddress(d.getLocalAddress());
		return tcur;
	}

	public TCBeginIndication createBeginIndication(Dialog d) {

		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCBeginIndicationImpl tcbi = new TCBeginIndicationImpl();
		tcbi.setDialog(d);
		return tcbi;
	}

	public TCContinueIndication createContinueIndication(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCContinueIndicationImpl tcbi = new TCContinueIndicationImpl();
		tcbi.setDialog(d);

		return tcbi;
	}

	public TCEndIndication createEndIndication(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCEndIndicationImpl tcbi = new TCEndIndicationImpl();
		tcbi.setDialog(d);
		return tcbi;
	}

	public TCUserAbortIndication createUAbortIndication(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCUserAbortIndicationImpl tcbi = new TCUserAbortIndicationImpl();
		tcbi.setDialog(d);
		return tcbi;
	}

	public TCPAbortIndication createPAbortIndication(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCPAbortIndicationImpl tcbi = new TCPAbortIndicationImpl();
		tcbi.setDialog(d);
		return tcbi;
	}

	public TCUniIndication createUniIndication(Dialog d) {
		if (d == null) {
			throw new NullPointerException("Dialog is null");
		}
		TCUniIndicationImpl tcbi = new TCUniIndicationImpl();
		tcbi.setDialog(d);
		return tcbi;
	}

	// Aditionals for APDU

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.DialogPrimitiveFactory
	 * #createApplicationContextName()
	 */
	public ApplicationContextName createApplicationContextName(long[] oid) {
		return TcapFactory.createApplicationContextName(oid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.DialogPrimitiveFactory
	 * #createUserInformation()
	 */
	public UserInformation createUserInformation() {
		return TcapFactory.createUserInformation();
	}

}