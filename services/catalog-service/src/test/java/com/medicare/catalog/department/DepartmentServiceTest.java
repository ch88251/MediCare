package com.medicare.catalog.department;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceTest {

  @Mock DepartmentRepository departmentRepository;

  @InjectMocks DepartmentService departmentService;

  @Test
  void findBySlug_unknownSlug_throwsResourceNotFound() {
    when(departmentRepository.findBySlug("unknown")).thenReturn(Optional.empty());
    assertThrows(ResourceNotFoundException.class, () -> departmentService.findBySlug("unknown"));
  }
}
