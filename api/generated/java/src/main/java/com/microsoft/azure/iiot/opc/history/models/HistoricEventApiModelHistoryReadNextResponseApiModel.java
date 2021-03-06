/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.iiot.opc.history.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * History read continuation result.
 */
public class HistoricEventApiModelHistoryReadNextResponseApiModel {
    /**
     * History as json encoded extension object.
     */
    @JsonProperty(value = "history")
    private List<HistoricEventApiModel> history;

    /**
     * Continuation token if more results pending.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * The errorInfo property.
     */
    @JsonProperty(value = "errorInfo")
    private ServiceResultApiModel errorInfo;

    /**
     * Get history as json encoded extension object.
     *
     * @return the history value
     */
    public List<HistoricEventApiModel> history() {
        return this.history;
    }

    /**
     * Set history as json encoded extension object.
     *
     * @param history the history value to set
     * @return the HistoricEventApiModelHistoryReadNextResponseApiModel object itself.
     */
    public HistoricEventApiModelHistoryReadNextResponseApiModel withHistory(List<HistoricEventApiModel> history) {
        this.history = history;
        return this;
    }

    /**
     * Get continuation token if more results pending.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set continuation token if more results pending.
     *
     * @param continuationToken the continuationToken value to set
     * @return the HistoricEventApiModelHistoryReadNextResponseApiModel object itself.
     */
    public HistoricEventApiModelHistoryReadNextResponseApiModel withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the errorInfo value.
     *
     * @return the errorInfo value
     */
    public ServiceResultApiModel errorInfo() {
        return this.errorInfo;
    }

    /**
     * Set the errorInfo value.
     *
     * @param errorInfo the errorInfo value to set
     * @return the HistoricEventApiModelHistoryReadNextResponseApiModel object itself.
     */
    public HistoricEventApiModelHistoryReadNextResponseApiModel withErrorInfo(ServiceResultApiModel errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

}
