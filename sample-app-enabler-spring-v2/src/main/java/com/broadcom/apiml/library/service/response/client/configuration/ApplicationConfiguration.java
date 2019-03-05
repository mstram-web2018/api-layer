/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package com.broadcom.apiml.library.service.response.client.configuration;

import com.broadcom.apiml.library.service.response.util.MessageCreationService;
import com.broadcom.apiml.library.service.response.util.impl.MessageCreationServiceFileImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MessageCreationService errorService() {
        return new MessageCreationServiceFileImpl("/messages.yml");
    }
}