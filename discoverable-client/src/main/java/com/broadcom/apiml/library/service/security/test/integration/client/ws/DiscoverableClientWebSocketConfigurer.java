/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package com.broadcom.apiml.library.service.security.test.integration.client.ws;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Component
public class DiscoverableClientWebSocketConfigurer implements WebSocketConfigurer {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(DiscoverableClientWebSocketConfigurer.class);

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        String webSocketPath = "/ws/uppercase";
        log.info("Registering WebSocket handler to " + webSocketPath);
        registry.addHandler(new WebSocketServerHandler(), webSocketPath);
    }
}