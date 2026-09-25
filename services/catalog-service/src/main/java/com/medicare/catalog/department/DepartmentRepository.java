package com.medicare.catalog.department;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

/** Provides data access operations for {@link Department} entities. */
public interface DepartmentRepository extends JpaRepository<Department, Long> {

  /**
   * Finds a department with the provided slug.
   *
   * @param slug the slug associated with the department
   * @return an {@link Optional} containing the matching department, or an empty {@code Optional} if
   *     no department is found
   */
  @EntityGraph(attributePaths = "features")
  Optional<Department> findBySlug(String slug);

  /**
   * Finds all departments
   *
   * @return a {@link List} of all departments and orders them in ascending order
   */
  @EntityGraph(attributePaths = "features")
  List<Department> findAllByOrderByIdAsc();
}
