package org;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    // 1. Proper static logger declaration
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        // 2. Simple test log
        LOGGER.info("Starting application");

        // 3. Parameterized logging
        String username = "admin";
        int attempts = 3;
        LOGGER.info("User: {}, Attempts: {}", username, attempts);

        // 4. Error logging
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            LOGGER.error("Math error occurred", e);
        }
    }
}