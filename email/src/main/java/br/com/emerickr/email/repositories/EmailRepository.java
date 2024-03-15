package br.com.emerickr.email.repositories;

import br.com.emerickr.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
