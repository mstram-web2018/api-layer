package com.broadcom.apiml.library.service.security.library.core;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class ApiMessageTest {

    @Test
    public void getCode() {
        UUID trackId = UUID.randomUUID();
        ApiMessage apiMessage = new ApiMessage(200, "good", "client.message", trackId);

        int code = apiMessage.getCode();

        assertEquals(200, code);
    }

    @Test
    public void getMessage() {
    }

    @Test
    public void getType() {
    }

    @Test
    public void getTrackId() {
    }
}