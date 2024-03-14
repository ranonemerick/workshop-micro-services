package br.com.emerickr.user.services;

import br.com.emerickr.user.models.UserModel;
import br.com.emerickr.user.producers.UserProducer;
import br.com.emerickr.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserProducer producer;

    @Transactional
    public UserModel save(UserModel userModel) {
        userModel = repository.save(userModel);
        producer.publishMessageEmail(userModel);
        return userModel;
    }

}
