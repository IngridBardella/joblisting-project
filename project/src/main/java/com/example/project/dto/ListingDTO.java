package com.example.project.dto;

import com.example.project.entity.Category;
import com.example.project.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListingDTO {
    private Long id;

    @NotBlank
    private String jobTitle;

    @NotBlank
    private String jobDescription;

    @NotNull
    @Positive
    private Double salary;

    @NotNull
    private Category category;

    @NotNull
    private User user;
}
