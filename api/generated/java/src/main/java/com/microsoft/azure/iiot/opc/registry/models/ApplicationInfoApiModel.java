/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.iiot.opc.registry.models;

import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application info model.
 */
public class ApplicationInfoApiModel {
    /**
     * Unique application id.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /**
     * Possible values include: 'Server', 'Client', 'ClientAndServer',
     * 'DiscoveryServer'.
     */
    @JsonProperty(value = "applicationType")
    private ApplicationType applicationType;

    /**
     * Unique application uri.
     */
    @JsonProperty(value = "applicationUri")
    private String applicationUri;

    /**
     * Product uri.
     */
    @JsonProperty(value = "productUri")
    private String productUri;

    /**
     * Default name of application.
     */
    @JsonProperty(value = "applicationName")
    private String applicationName;

    /**
     * Locale of default name - defaults to "en".
     */
    @JsonProperty(value = "locale")
    private String locale;

    /**
     * Localized Names of application keyed on locale.
     */
    @JsonProperty(value = "localizedNames")
    private Map<String, String> localizedNames;

    /**
     * Application public cert.
     */
    @JsonProperty(value = "certificate")
    private byte[] certificate;

    /**
     * The capabilities advertised by the server.
     */
    @JsonProperty(value = "capabilities")
    private List<String> capabilities;

    /**
     * Discovery urls of the server.
     */
    @JsonProperty(value = "discoveryUrls")
    private List<String> discoveryUrls;

    /**
     * Discovery profile uri.
     */
    @JsonProperty(value = "discoveryProfileUri")
    private String discoveryProfileUri;

    /**
     * Gateway server uri.
     */
    @JsonProperty(value = "gatewayServerUri")
    private String gatewayServerUri;

    /**
     * Host addresses of server application or null.
     */
    @JsonProperty(value = "hostAddresses")
    private List<String> hostAddresses;

    /**
     * Site of the application.
     */
    @JsonProperty(value = "siteId")
    private String siteId;

    /**
     * Discoverer that registered the application.
     */
    @JsonProperty(value = "discovererId")
    private String discovererId;

    /**
     * Last time application was seen.
     */
    @JsonProperty(value = "notSeenSince")
    private DateTime notSeenSince;

    /**
     * The created property.
     */
    @JsonProperty(value = "created")
    private RegistryOperationApiModel created;

    /**
     * The updated property.
     */
    @JsonProperty(value = "updated")
    private RegistryOperationApiModel updated;

    /**
     * Get unique application id.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set unique application id.
     *
     * @param applicationId the applicationId value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get possible values include: 'Server', 'Client', 'ClientAndServer', 'DiscoveryServer'.
     *
     * @return the applicationType value
     */
    public ApplicationType applicationType() {
        return this.applicationType;
    }

    /**
     * Set possible values include: 'Server', 'Client', 'ClientAndServer', 'DiscoveryServer'.
     *
     * @param applicationType the applicationType value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationType(ApplicationType applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Get unique application uri.
     *
     * @return the applicationUri value
     */
    public String applicationUri() {
        return this.applicationUri;
    }

    /**
     * Set unique application uri.
     *
     * @param applicationUri the applicationUri value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationUri(String applicationUri) {
        this.applicationUri = applicationUri;
        return this;
    }

    /**
     * Get product uri.
     *
     * @return the productUri value
     */
    public String productUri() {
        return this.productUri;
    }

    /**
     * Set product uri.
     *
     * @param productUri the productUri value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withProductUri(String productUri) {
        this.productUri = productUri;
        return this;
    }

    /**
     * Get default name of application.
     *
     * @return the applicationName value
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * Set default name of application.
     *
     * @param applicationName the applicationName value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get locale of default name - defaults to "en".
     *
     * @return the locale value
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set locale of default name - defaults to "en".
     *
     * @param locale the locale value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get localized Names of application keyed on locale.
     *
     * @return the localizedNames value
     */
    public Map<String, String> localizedNames() {
        return this.localizedNames;
    }

    /**
     * Set localized Names of application keyed on locale.
     *
     * @param localizedNames the localizedNames value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withLocalizedNames(Map<String, String> localizedNames) {
        this.localizedNames = localizedNames;
        return this;
    }

    /**
     * Get application public cert.
     *
     * @return the certificate value
     */
    public byte[] certificate() {
        return this.certificate;
    }

    /**
     * Set application public cert.
     *
     * @param certificate the certificate value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withCertificate(byte[] certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the capabilities advertised by the server.
     *
     * @return the capabilities value
     */
    public List<String> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities advertised by the server.
     *
     * @param capabilities the capabilities value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get discovery urls of the server.
     *
     * @return the discoveryUrls value
     */
    public List<String> discoveryUrls() {
        return this.discoveryUrls;
    }

    /**
     * Set discovery urls of the server.
     *
     * @param discoveryUrls the discoveryUrls value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withDiscoveryUrls(List<String> discoveryUrls) {
        this.discoveryUrls = discoveryUrls;
        return this;
    }

    /**
     * Get discovery profile uri.
     *
     * @return the discoveryProfileUri value
     */
    public String discoveryProfileUri() {
        return this.discoveryProfileUri;
    }

    /**
     * Set discovery profile uri.
     *
     * @param discoveryProfileUri the discoveryProfileUri value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withDiscoveryProfileUri(String discoveryProfileUri) {
        this.discoveryProfileUri = discoveryProfileUri;
        return this;
    }

    /**
     * Get gateway server uri.
     *
     * @return the gatewayServerUri value
     */
    public String gatewayServerUri() {
        return this.gatewayServerUri;
    }

    /**
     * Set gateway server uri.
     *
     * @param gatewayServerUri the gatewayServerUri value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withGatewayServerUri(String gatewayServerUri) {
        this.gatewayServerUri = gatewayServerUri;
        return this;
    }

    /**
     * Get host addresses of server application or null.
     *
     * @return the hostAddresses value
     */
    public List<String> hostAddresses() {
        return this.hostAddresses;
    }

    /**
     * Set host addresses of server application or null.
     *
     * @param hostAddresses the hostAddresses value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withHostAddresses(List<String> hostAddresses) {
        this.hostAddresses = hostAddresses;
        return this;
    }

    /**
     * Get site of the application.
     *
     * @return the siteId value
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Set site of the application.
     *
     * @param siteId the siteId value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * Get discoverer that registered the application.
     *
     * @return the discovererId value
     */
    public String discovererId() {
        return this.discovererId;
    }

    /**
     * Set discoverer that registered the application.
     *
     * @param discovererId the discovererId value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withDiscovererId(String discovererId) {
        this.discovererId = discovererId;
        return this;
    }

    /**
     * Get last time application was seen.
     *
     * @return the notSeenSince value
     */
    public DateTime notSeenSince() {
        return this.notSeenSince;
    }

    /**
     * Set last time application was seen.
     *
     * @param notSeenSince the notSeenSince value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withNotSeenSince(DateTime notSeenSince) {
        this.notSeenSince = notSeenSince;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public RegistryOperationApiModel created() {
        return this.created;
    }

    /**
     * Set the created value.
     *
     * @param created the created value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withCreated(RegistryOperationApiModel created) {
        this.created = created;
        return this;
    }

    /**
     * Get the updated value.
     *
     * @return the updated value
     */
    public RegistryOperationApiModel updated() {
        return this.updated;
    }

    /**
     * Set the updated value.
     *
     * @param updated the updated value to set
     * @return the ApplicationInfoApiModel object itself.
     */
    public ApplicationInfoApiModel withUpdated(RegistryOperationApiModel updated) {
        this.updated = updated;
        return this;
    }

}
