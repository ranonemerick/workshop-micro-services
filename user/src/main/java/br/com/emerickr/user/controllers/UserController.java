package br.com.emerickr.user.controllers;

import br.com.emerickr.user.dtos.UserDTO;
import br.com.emerickr.user.models.UserModel;
import br.com.emerickr.user.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserDTO userDTO) {
        var userModel = new UserModel();
        BeanUtils.copyProperties(userDTO, userModel);
        var user = service.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
