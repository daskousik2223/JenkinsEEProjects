package com.iwm.advisor.facade;

/**
 * Home interface for Enterprise Bean: AdvisorIdentityFacade
 */
public interface AdvisorIdentityFacadeHome extends javax.ejb.EJBHome {

	/**
	 * Creates a default instance of Session Bean: AdvisorIdentityFacade
	 */
	public com.iwm.advisor.facade.AdvisorIdentityFacade create()
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;
}
