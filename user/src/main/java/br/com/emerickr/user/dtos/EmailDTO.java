package br.com.emerickr.user.dtos;

import lombok.Data;

import java.util.UUID;
@Data
public class EmailDTO {

    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;

}
