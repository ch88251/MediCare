package com.medicare.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** This is the main entry point of the application. */
@SpringBootApplication
public class CatalogServiceApplication {

  /** Run the spring boot application. */
  public static void main(String[] args) {
    SpringApplication.run(CatalogServiceApplication.class, args);
  }
}
