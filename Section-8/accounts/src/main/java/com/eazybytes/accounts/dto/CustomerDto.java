package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name="Customer",
description="Schema to hold customer information")
public class CustomerDto {

    @NotEmpty(message="Name cannot be null or empty")
    @Size(min=5, max=30,message="The length of customer name should be between 5 and 30")
    @Schema(description="Name of the customer", example="EazyBytes")
    private String name;

    @NotEmpty(message="Email cannot be null or empty")
    @Email(message="Email address should be a valid value")
    @Schema(description="Email of the customer", example="tutor@eazyBytes")
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile Number must be 10 digits")
    @Schema(description="Mobile number of the customer", example="123456789")
    private String mobileNumber;

    @Schema(description="Account details of the customer")
    private AccountsDto accountsDto;
}
