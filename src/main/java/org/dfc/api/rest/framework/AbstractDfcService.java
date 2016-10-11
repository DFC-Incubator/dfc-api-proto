package org.dfc.api.rest.framework;

import javax.inject.Inject;

import org.dfc.api.rest.apps.config.DfcRestConfiguration;
import org.irods.jargon.rest.commands.AbstractIrodsService;

/**
 * Base class for a DFC iRODS service
 *
 * @author Mike Conway - DICE (www.irods.org)
 *
 */
public abstract class AbstractDfcService extends AbstractIrodsService {

	@Inject
	DfcRestConfiguration dfcRestConfiguration;

	/**
	 * @return the restConfiguration
	 */
	public DfcRestConfiguration getDfcRestConfiguration() {
		return dfcRestConfiguration;
	}

	/**
	 * @param restConfiguration
	 *            the restConfiguration to set
	 */
	public void setDfcRestConfiguration(
			final DfcRestConfiguration dfcRestConfiguration) {
		this.dfcRestConfiguration = dfcRestConfiguration;
	}

}