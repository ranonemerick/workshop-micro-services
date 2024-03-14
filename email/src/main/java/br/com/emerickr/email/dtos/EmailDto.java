package br.com.emerickr.email.dtos;

import java.util.UUID;

public record EmailDto(UUID userID,
                       String emailTo,
                       String subject,
                       String text) {
}
