/**
 *
 */
package org.dfc.api.rest.apps;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Eventually some sort of class hierarchy, for new an App in DE to be run
 *
 * @author Mike Conway (DFC)
 *
 */
@XmlRootElement
public class AnalysisRequest {

	/**
	 * Id of the app
	 */
	private String appId = "";

	/**
	 * A map from (str step-id \"_\" param-id) to param-value.
	 */
	private Map<String, String> config = new HashMap<String, String>();

	/**
	 * Name of the app
	 */
	private String name = "";

	/**
	 * iRODS output dir for analysis
	 */
	private String outputDir = "";

	/**
	 * Should a timestamp subdir be created under output dir
	 */
	private boolean createOutputSubdir = true;

	/**
	 * Should log files be archived
	 */
	private boolean archiveLogs = true;

	/**
	 * Should user be notified of job status
	 */
	private boolean notify = true;

	/**
	 * Whether to add debug info for the app
	 */
	private boolean debug = false;

	@XmlElement(name = "app_id")
	public String getAppId() {
		return appId;
	}

	public void setAppId(final String appId) {
		this.appId = appId;
	}

	@XmlElement(name = "config")
	public Map<String, String> getConfig() {
		return config;
	}

	public void setConfig(final Map<String, String> config) {
		this.config = config;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@XmlElement(name = "output_dir")
	public String getOutputDir() {
		return outputDir;
	}

	public void setOutputDir(final String outputDir) {
		this.outputDir = outputDir;
	}

	@XmlElement(name = "create_output_subdir")
	public boolean isCreateOutputSubdir() {
		return createOutputSubdir;
	}

	public void setCreateOutputSubdir(final boolean createOutputSubdir) {
		this.createOutputSubdir = createOutputSubdir;
	}

	@XmlElement(name = "archive_logs")
	public boolean isArchiveLogs() {
		return archiveLogs;
	}

	public void setArchiveLogs(final boolean archiveLogs) {
		this.archiveLogs = archiveLogs;
	}

	@XmlElement(name = "notify")
	public boolean isNotify() {
		return notify;
	}

	public void setNotify(final boolean notify) {
		this.notify = notify;
	}

	@XmlElement(name = "debug")
	public boolean isDebug() {
		return debug;
	}

	public void setDebug(final boolean debug) {
		this.debug = debug;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("App [");
		if (appId != null) {
			builder.append("appId=").append(appId).append(", ");
		}
		if (config != null) {
			builder.append("config=").append(config).append(", ");
		}
		if (name != null) {
			builder.append("name=").append(name).append(", ");
		}
		if (outputDir != null) {
			builder.append("outputDir=").append(outputDir).append(", ");
		}
		builder.append("createOutputSubdir=").append(createOutputSubdir)
				.append(", archiveLogs=").append(archiveLogs)
				.append(", notify=").append(notify).append(", ");
		builder.append("debug=").append(debug).append("]");
		return builder.toString();
	}

}
