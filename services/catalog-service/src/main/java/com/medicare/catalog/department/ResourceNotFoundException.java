package com.medicare.catalog.department;

/** Throws a RuntimeException when a requested resource cannot be found. */
public class ResourceNotFoundException extends RuntimeException {

  /**
   * Creates a new exception with the specified detail message.
   *
   * @param message the detail message describing the missing resource
   */
  public ResourceNotFoundException(String message) {
    super(message);
  }
}
