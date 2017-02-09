/**
 * 
 */
package org.dfc.api.rest.apps.decalls;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

import junit.framework.Assert;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.dfc.api.rest.apps.AnalysisRequest;
import org.dfc.api.rest.apps.AnalysisResponse;
import org.dfc.api.rest.apps.config.DfcRestConfiguration;
import org.irods.jargon.rest.exception.IrodsRestException;
import org.irods.jargon.rest.exception.IrodsRestRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Invoke analysis functions in DE proper
 * 
 * @author Mike Conway DICE
 *
 */
public class DeAnalysisConnector {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * Dependency on {@link DfcRestConfiguration} to be injected
	 */
	private DfcRestConfiguration dfcRestConfiguration;
	public static final String ANALYSIS_CONTEXT = "analysisGateway";

	public AnalysisResponse launchAnalysis(AnalysisRequest analysisRequest)
			throws IrodsRestException {
		log.info("launchAnalysis()");
		if (analysisRequest == null) {
			throw new IllegalArgumentException("null analysisRequest");
		}
		log.info("analysisRequest:{}", analysisRequest);
		CloseableHttpClient httpClient = HttpClients.createDefault();
		StringBuilder sb = new StringBuilder();
		sb.append(dfcRestConfiguration.getAppsBaseUrl());

		String jsonInString;
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonInString = mapper.writeValueAsString(analysisRequest);
		} catch (IOException e) {
			log.error("error parsing analysis request:{}", e);
			throw new IrodsRestException("error in data marshalling", e);
		}

		/*
		 * CredentialsProvider credentialsProvider = new
		 * BasicCredentialsProvider();
		 * credentialsProvider.setCredentials(AuthScope.ANY, new
		 * UsernamePasswordCredentials("username", "password"));
		 * CloseableHttpClient httpClient =
		 * HttpClientBuilder.create().setDefaultCredentialsProvider
		 * (credentialsProvider).build();
		 */

		URIBuilder uriBuilder = new URIBuilder();
		uriBuilder.setScheme("http").setHost("dfc-de-svcs.edc.renci.org")
				.setPort(5007).setPath("/analyses")
				.addParameter("user", "testde2")
				.addParameter("email", "testde2@renci.org");
		log.debug("uribuilder:{}", uriBuilder);

		HttpPost post;
		try {
			post = new HttpPost(uriBuilder.build());
		} catch (URISyntaxException e) {
			log.error("exception generating url:{}", e);
			throw new IrodsRestRuntimeException(e.getMessage());
		}

		post.addHeader("accept", "application/json");
		post.addHeader("Content-Type", "application/json");

		try {
			post.setEntity(new StringEntity(jsonInString));
		} catch (UnsupportedEncodingException e) {
			log.error("unsupported encoding:{}", e);
			throw new IrodsRestRuntimeException(e.getMessage());
		}

		HttpResponse response;
		try {
			response = httpClient.execute(post);
			log.debug("response:{}", response);
		} catch (IOException e) {
			log.error("ioexception calling rest:{}", e);
			throw new IrodsRestRuntimeException(e.getMessage());
		}
		HttpEntity entity = response.getEntity();
		log.debug("entity:{}", entity);
		Assert.assertEquals(200, response.getStatusLine().getStatusCode());
		try {
			String entityData = EntityUtils.toString(entity);
			AnalysisResponse actual = mapper.readValue(entityData,
					AnalysisResponse.class);
			log.info("analysisResponse:{}", actual);
			return actual;
		} catch (ParseException | IOException e) {
			log.error("exception parsing REST response:{}", e);
			throw new IrodsRestRuntimeException(e.getMessage());
		} finally {

		}

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
