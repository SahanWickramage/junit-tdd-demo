package io.github.sahawick.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UrlValidatorTest {

    private final UrlValidator validator = new UrlValidator();

    @Test
    public void shouldReturnTrueForValidHttpUrl() {
        String url = "http://example.com";
        assertTrue(validator.isValid(url));
    }

    @Test
    public void shouldReturnTrueForValidHttpsUrl() {
        String url = "https://example.com";
        assertTrue(validator.isValid(url));
    }

    @Test
    public void shouldReturnFalseForUrlWithoutProtocol() {
        String url = "example.com";
        assertFalse(validator.isValid(url));
    }

    @Test
    public void shouldReturnFalseForMalformedUrl() {
        String url = "htp:/example";
        assertFalse(validator.isValid(url));
    }

    @Test
    public void shouldThrowExceptionForEmptyUrl() {
        try {
            String url = "";
            validator.isValid(url);
        } catch (IllegalArgumentException e) {
            assertEquals("URL cannot be empty", e.getMessage());
        }
    }

    @Test
    public void shouldReturnFalseForPrivateIpUrl() {
        String url = "http://192.168.0.1";
        assertFalse(validator.isValid(url));
    }

    @Test
    public void shouldReturnFalseForLocalhost() {
        String url = "http://localhost";
        assertFalse(validator.isValid(url));
    }
}
