package org.dfc.api.rest.apps.decalls;

import junit.framework.Assert;

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
		request.setName("Word Count launched from DFC gateway");
		request.setOutputDir("/dfc1/home/testde2/analyses");
		request.getConfig()
				.put("089a61a0-23d9-4021-9354-a8498ef3ff19_13914010-89cd-406d-99c3-9c4ff8b023c3",
						"/dfc1/home/testde2/boo/test.doc");
		AnalysisResponse response = connector.launchAnalysis(request);
		Assert.assertNotNull("null response", response);

	}

	@Test
	public void testLaunchAnalysisHydro() throws Exception {
		DfcRestConfiguration conf = new DfcRestConfiguration();
		conf.setAppsBaseUrl("dfc-de-svcs.edc.renci.org:5007");
		DeAnalysisConnector connector = new DeAnalysisConnector();
		connector.setDfcRestConfiguration(conf);
		AnalysisRequest request = new AnalysisRequest();
		request.setAppId("7d7e10a6-bd84-11e6-bbcf-005056a2d298");
		request.setName("VIC Flow launched as Hydroshare service");
		request.setOutputDir("/dfc1/home/testde2/analyses");
		request.getConfig()
				.put("7d7e55ac-bd84-11e6-bbcf-005056a2d298_7d7f059c-bd84-11e6-bbcf-005056a2d298",
						"/dfc1/home/testde2/hydro");
		AnalysisResponse response = connector.launchAnalysis(request);
		Assert.assertNotNull("null response", response);

	}
}
