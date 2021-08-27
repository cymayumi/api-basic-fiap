package br.com.fiap.basic.controller;


import br.com.fiap.basic.dto.UserDTO;
import br.com.fiap.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/cadastro-user")
    public String addUser(@RequestBody @Valid UserDTO userDTO) {
        userService.save(userDTO);
        return "Usuário cadastrado com sucesso";
    }
}
