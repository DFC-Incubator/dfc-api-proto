/**
 * 
 */
package org.dfc.api.rest.apps.config;

import org.irods.jargon.rest.configuration.RestConfiguration;

/**
 * Extended configuration for dfc rest services
 * 
 * @author Mike Conway - DFC
 *
 */
public class DfcRestConfiguration extends RestConfiguration {

	/**
	 * Base url where apps container is listening
	 */
	private String appsBaseUrl = "";

	public String getAppsBaseUrl() {
		return appsBaseUrl;
	}

	public void setAppsBaseUrl(String appsBaseUrl) {
		this.appsBaseUrl = appsBaseUrl;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		StringBuilder builder = new StringBuilder();
		builder.append("DfcRestConfiguration [");
		if (appsBaseUrl != null) {
			builder.append("appsBaseUrl=").append(appsBaseUrl).append(", ");
		}
		if (getIrodsHost() != null) {
			builder.append("getIrodsHost()=").append(getIrodsHost())
					.append(", ");
		}
		builder.append("getIrodsPort()=").append(getIrodsPort()).append(", ");
		if (getIrodsZone() != null) {
			builder.append("getIrodsZone()=").append(getIrodsZone())
					.append(", ");
		}
		if (getDefaultStorageResource() != null) {
			builder.append("getDefaultStorageResource()=")
					.append(getDefaultStorageResource()).append(", ");
		}
		if (getRealm() != null) {
			builder.append("getRealm()=").append(getRealm()).append(", ");
		}
		if (getWebInterfaceURL() != null) {
			builder.append("getWebInterfaceURL()=")
					.append(getWebInterfaceURL()).append(", ");
		}
		builder.append("isAllowCors()=").append(isAllowCors()).append(", ");
		if (getCorsOrigins() != null) {
			builder.append("getCorsOrigins()=")
					.append(getCorsOrigins().subList(0,
							Math.min(getCorsOrigins().size(), maxLen)))
					.append(", ");
		}
		if (getCorsMethods() != null) {
			builder.append("getCorsMethods()=")
					.append(getCorsMethods().subList(0,
							Math.min(getCorsMethods().size(), maxLen)))
					.append(", ");
		}
		builder.append("isCorsAllowCredentials()=")
				.append(isCorsAllowCredentials()).append(", ");
		if (super.toString() != null) {
			builder.append("toString()=").append(super.toString()).append(", ");
		}
		if (getAuthType() != null) {
			builder.append("getAuthType()=").append(getAuthType()).append(", ");
		}
		if (getCorsAllowedHeaders() != null) {
			builder.append("getCorsAllowedHeaders()=")
					.append(getCorsAllowedHeaders().subList(0,
							Math.min(getCorsAllowedHeaders().size(), maxLen)))
					.append(", ");
		}
		builder.append("isUtilizePackingStreams()=")
				.append(isUtilizePackingStreams()).append(", ");
		if (getClass() != null) {
			builder.append("getClass()=").append(getClass()).append(", ");
		}
		builder.append("hashCode()=").append(hashCode()).append("]");
		return builder.toString();
	}

}
