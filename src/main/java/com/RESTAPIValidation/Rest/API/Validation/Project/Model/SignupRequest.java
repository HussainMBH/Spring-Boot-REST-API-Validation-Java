package com.RESTAPIValidation.Rest.API.Validation.Project.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {

    @NotBlank(message = "The username is required")
    @Size(min = 3, max = 20, message = "The username must be from 3 to 20 characters")
    private String username;

    @NotEmpty(message = "The email is required")
    @Email(message = "The email is not valid")
    private String email;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "The age must be equal or greater than 18")
    private int age;

    @NotNull(message = "The graduation date is required")
    @Past(message = "The graduation date must be in the past")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date graduationDate;

    @NotBlank(message = "The password is required")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$", message = "Password must contain at least one lowercase letter, one uppercase letter, one number, and be at least 8 characters long")
    private String password;
    @NotBlank(message = "The confirm password is required")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$", message = "Password must contain at least one lowercase letter, one uppercase letter, one number, and be at least 8 characters long")
    private String confirmPassword;

    @Valid
    @NotNull(message = "The address is required")
    private Address address;
}
