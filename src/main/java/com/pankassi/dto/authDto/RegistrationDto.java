package com.pankassi.dto.authDto;

import jakarta.validation.constraints.*;

public record RegistrationDto(
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotBlank String userName,
        @Email String email,
        @NotBlank String password
) {

}
