package com.medicare.catalog.department;

import java.util.List;

/**
 * Represents department summary data returned by the API.
 *
 * @param name the department name
 * @param slug the department slug
 * @param tagline the department tagline
 * @param description the department description
 * @param imageUrl the path to the image associated with the department
 * @param features a list of features associated with the department
 */
public record DepartmentSummaryDto(
    String name,
    String slug,
    String tagline,
    String description,
    String imageUrl,
    List<String> features) {}
