package br.com.fiap.basic.service;

import br.com.fiap.basic.dto.UserDTO;
import br.com.fiap.basic.entity.UserEntity;
import br.com.fiap.basic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void save(UserDTO user){
        UserEntity userEntity = new UserEntity(user);
        userRepository.save(userEntity);
    }
}
