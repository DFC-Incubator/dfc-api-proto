/**
 * 
 */
package org.dfc.api.rest.apps;

import org.dfc.api.rest.apps.config.DfcRestConfiguration;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.rest.commands.ServiceFunctionFactory;
import org.irods.jargon.rest.configuration.RestConfiguration;

/**
 * @author Mike Conway - DFC
 *
 */
public class AbstractDfcServiceFunctionFactory implements
		ServiceFunctionFactory {

	private RestConfiguration restConfiguration;
	private DfcRestConfiguration dfcRestConfiguration;
	private IRODSAccessObjectFactory irodsAccessObjectFactory;

	@Override
	public RestConfiguration getRestConfiguration() {
		return restConfiguration;
	}

	@Override
	public void setRestConfiguration(RestConfiguration restConfiguration) {
		this.restConfiguration = restConfiguration;
	}

	@Override
	public IRODSAccessObjectFactory getIrodsAccessObjectFactory() {
		return irodsAccessObjectFactory;
	}

	@Override
	public void setIrodsAccessObjectFactory(
			IRODSAccessObjectFactory irodsAccessObjectFactory) {
		this.irodsAccessObjectFactory = irodsAccessObjectFactory;

	}

	/**
	 * @return the dfcRestConfiguration
	 */
	public DfcRestConfiguration getDfcRestConfiguration() {
		return dfcRestConfiguration;
	}

	/**
	 * @param dfcRestConfiguration
	 *            the dfcRestConfiguration to set
	 */
	public void setDfcRestConfiguration(
			DfcRestConfiguration dfcRestConfiguration) {
		this.dfcRestConfiguration = dfcRestConfiguration;
	}
}
