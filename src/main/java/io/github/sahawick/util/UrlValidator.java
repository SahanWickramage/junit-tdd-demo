package io.github.sahawick.util;

import java.net.URI;
import java.net.URISyntaxException;

public class UrlValidator {

    public boolean isValid(String url) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL cannot be empty");
        }

        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();

            // Check for valid protocol and host
            if ((!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) || host == null) {
                return false;
            }

            // Block private IPs or localhost
            if (host.equalsIgnoreCase("localhost") || host.startsWith("192.168.") || host.startsWith("10.") || host.startsWith("127.")) {
                return false;
            }

            return true;

        } catch (URISyntaxException e) {
            return false; // Malformed URL
        }
    }
}

