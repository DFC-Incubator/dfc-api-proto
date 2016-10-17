package org.dfc.api.rest.apps.decalls;

import org.dfc.api.rest.apps.AnalysisRequest;
import org.dfc.api.rest.apps.AnalysisResponse;
import org.dfc.api.rest.apps.config.DfcRestConfiguration;
import org.junit.Test;

public class DeAnalysisConnectorTest {

	@Test
	public void testLaunchAnalysis() throws Exception {
		DfcRestConfiguration conf = new DfcRestConfiguration();
		conf.setAppsBaseUrl("dfc-de-svcs.edc.renci.org:5007");
		DeAnalysisConnector connector = new DeAnalysisConnector();
		connector.setDfcRestConfiguration(conf);
		AnalysisRequest request = new AnalysisRequest();
		request.setAppId("67d15627-22c5-42bd-8daf-9af5deecceab");
		AnalysisResponse response = connector.launchAnalysis(request);

	}

}
