package com.qatraining.library.config;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SwaggerConfigTest {
	
    @Test
    public void testMessageSource() {
    	SwaggerConfig sc = new SwaggerConfig();
        assertNotNull(sc.api());
    }

}
