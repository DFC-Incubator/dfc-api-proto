/**
 *
 */
package org.dfc.api.rest.apps;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.irods.jargon.rest.commands.AbstractIrodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Gateway to DE analysis
 *
 * @author Mike Conway - DICE
 *
 */
@Named
@Path("/analysisGateway")
public class AnalysisGatewayService extends AbstractIrodsService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@POST
	@Path("{appId:.*}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public AnalysisResponse submitAnalysis(
			@HeaderParam("Authorization") final String authorization,
			@PathParam("appId") final String appId, final AnalysisRequest app) {

		log.info("submitAnalysis()");

		if (authorization == null || authorization.isEmpty()) {
			throw new IllegalArgumentException("null or empty authorization");
		}

		if (appId == null || appId.isEmpty()) {
			throw new IllegalArgumentException("null or empty appId");
		}

		return new AnalysisResponse();
	}

}
