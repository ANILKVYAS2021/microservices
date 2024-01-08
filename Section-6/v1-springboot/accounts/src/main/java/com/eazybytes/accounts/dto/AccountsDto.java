package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name="Accounts",
        description="Schema to hold account information")
public class AccountsDto {

    @NotEmpty(message="Account Number cannot be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")

    @Schema(description="Account Number of Eazy Bank Account")
    private Long accountNumber;

    @NotEmpty(message="Account Type cannot be null or empty")
    @Schema(description="Account Type of Eazy Bank Account", example="Savings")
    private String accountType;

    @NotEmpty(message="Branch Address cannot be null or empty")
    @Schema(description="Branch Address of Eazy Bank Account")
    private String branchAddress;
}
