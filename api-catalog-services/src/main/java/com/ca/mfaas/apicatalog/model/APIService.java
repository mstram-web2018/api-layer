/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package com.ca.mfaas.apicatalog.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(of = {"serviceId"})
public class APIService implements Serializable {

    private static final long serialVersionUID = 5119572678327579985L;

    @ApiModelProperty(notes = "The service id")
    private String serviceId;

    @ApiModelProperty(notes = "The API service name")
    private String title;

    @ApiModelProperty(notes = "The description of the API service")
    private String description;

    @ApiModelProperty(notes = "The status of the API service")
    private String status;

    @ApiModelProperty(notes = "The security status of the API service")
    private boolean secured;

    @ApiModelProperty(notes = "The service home page of the API service")
    private String homePageUrl;

    @ApiModelProperty(notes = "The API documentation for this service")
    private String apiDoc;

    public APIService(String serviceId) {
        this.serviceId = serviceId;
        this.status = "UP";
    }


    public APIService(String serviceId, String title, String description, boolean secured, String homePageUrl) {
        this.serviceId = serviceId;
        this.title = title;
        this.description = description;
        this.status = "UP";
        this.secured = secured;
        this.homePageUrl = homePageUrl;
        this.apiDoc = null;
    }

    public APIService(String serviceId, String title, String description, boolean secured, String homePageUrl, String apiDoc) {
        this.serviceId = serviceId;
        this.title = title;
        this.description = description;
        this.status = "UP";
        this.secured = secured;
        this.homePageUrl = homePageUrl;
        this.apiDoc = apiDoc;
    }
}
