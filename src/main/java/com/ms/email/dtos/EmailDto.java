package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
    
    @NotBlank(message = "Campo Obrigatório!")
    private String ownerRef;

    @NotBlank(message = "Campo Obrigatório!")
    @Email
    private String emailFrom;

    @NotBlank(message = "Campo Obrigatório!")
    @Email
    private String emailTo;

    @NotBlank(message = "Campo Obrigatório!")
    private String subject;

    @NotBlank(message = "Campo Obrigatório!")
    private String text;
}
