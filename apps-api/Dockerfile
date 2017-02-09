#cloud browser docker file for single war deployment
FROM tomcat:9.0-jre8-alpine
COPY target/dfc-rest.war /usr/local/tomcat/webapps/dfc-rest.war
COPY /etc/irods-ext/dfc-api.properties /etc/irods-ext/dfc-api.properties

