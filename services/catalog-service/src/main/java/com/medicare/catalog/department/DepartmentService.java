package com.medicare.catalog.department;

import org.springframework.stereotype.Service;

/** Provides operations for retrieving departments and their associated features. */
@Service
public class DepartmentService {

  private final DepartmentRepository repository;

  /**
   * Creates a new department service using the provided repository.
   *
   * @param repository the repository used to access department data
   */
  public DepartmentService(DepartmentRepository repository) {
    this.repository = repository;
  }

  /**
   * Finds a department with a given slug name
   *
   * @param name a slug name
   * @return Department if the department with the given slug exists
   */
  public Department findBySlug(String slug) {
    return repository
        .findBySlug(slug)
        .orElseThrow(() -> new ResourceNotFoundException("Department not found: " + slug));
  }
}
