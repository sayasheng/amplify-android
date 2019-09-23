/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.amplifyframework.core.exception;

/**
 * Exceptions associated with configuring and inspecting Amplify Categories
 */
public class ConfigurationException extends AmplifyException {
    public static class AmplifyAlreadyConfiguredException extends ConfigurationException {
        public AmplifyAlreadyConfiguredException() { super("The client issued a subsequent call to `Amplify.configure` after the first had already succeeded."); }
        public AmplifyAlreadyConfiguredException(String message, Throwable t) { super(message, t); }
        public AmplifyAlreadyConfiguredException(String message) { super(message); }
        public AmplifyAlreadyConfiguredException(Throwable throwable) { super(throwable); }
    }

    public static class InvalidAmplifyConfigurationFileException extends ConfigurationException {
        public InvalidAmplifyConfigurationFileException() { super("The specified `amplifyconfiguration.json` file was not present or unreadable."); }
        public InvalidAmplifyConfigurationFileException(String message, Throwable t) { super(message, t); }
        public InvalidAmplifyConfigurationFileException(String message) { super(message); }
        public InvalidAmplifyConfigurationFileException(Throwable throwable) { super(throwable); }
    }

    public static class UnableToDecodeException extends ConfigurationException {
        public UnableToDecodeException() { super("Unable to decode `amplifyconfiguration.json` into a valid AmplifyConfiguration object"); }
        public UnableToDecodeException(String message, Throwable t) { super(message, t); }
        public UnableToDecodeException(String message) { super(message); }
        public UnableToDecodeException(Throwable throwable) { super(throwable); }
    }

    /**
     * Creates a new ConfigurationException with the specified message, and root
     * cause.
     *
     * @param message An error message describing why this exception was thrown.
     * @param t The underlying cause of this exception.
     */
    public ConfigurationException(final String message, final Throwable t) { super(message, t); }

    /**
     * Creates a new ConfigurationException with the specified message.
     *
     * @param message An error message describing why this exception was thrown.
     */
    public ConfigurationException(final String message) {
        super(message);
    }

    /**
     * Create an ConfigurationException with an exception cause.
     *
     * @param throwable the cause of the exception.
     */
    public ConfigurationException(final Throwable throwable) {
        super(throwable);
    }
}