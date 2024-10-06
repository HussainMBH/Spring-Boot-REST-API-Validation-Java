package com.RESTAPIValidation.Rest.API.Validation.Project.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @NotBlank(message = "[Address] The city is required")
    private String city;

    @NotBlank(message = "[Address] The street name is required")
    private String street;
}
