/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package com.broadcom.apiml.library.service.security.service.gateway.services.routing;

/**
 * Class that implements it is using information about routed services.
 */
public interface RoutedServicesUser {
    /**
     * Adds routed services that are routed for a service ID.
     */
    public void addRoutedServices(String serviceId, RoutedServices routedServices);
}