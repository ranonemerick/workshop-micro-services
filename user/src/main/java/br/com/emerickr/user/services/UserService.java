package br.com.emerickr.user.services;

import br.com.emerickr.user.models.UserModel;
import br.com.emerickr.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Transactional
    public UserModel save(UserModel userModel) {
        return repository.save(userModel);
    }

}
