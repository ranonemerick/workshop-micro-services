package br.com.emerickr.user.producers;

import br.com.emerickr.user.dtos.EmailDTO;
import br.com.emerickr.user.models.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value(value = "${broker.queue.email.name}")
    private String routingKey;

    public void publishMessageEmail(UserModel userModel) {
        var emailDTO = new EmailDTO();
        emailDTO.setUserId(userModel.getUserID());
        emailDTO.setEmailTo(userModel.getEmail());
        emailDTO.setSubject("Cadastro realizado com sucesso!");
        emailDTO.setText(userModel.getName() + "Seja bem vindo(a)! \n Agradecemos o seu cadastro!");
        rabbitTemplate.convertAndSend("", routingKey, emailDTO);
    }

}
