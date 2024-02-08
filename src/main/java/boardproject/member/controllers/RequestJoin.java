package boardproject.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record RequestJoin(
        @NotBlank @Email
        String email,
        @NotBlank
        String password,
        @NotBlank
        String confirmPassword,
        @NotBlank
        String name,
        @NotBlank
        String mobile,
        @AssertTrue
        boolean agree
) { }
