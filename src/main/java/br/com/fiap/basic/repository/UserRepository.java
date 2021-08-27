package br.com.fiap.basic.repository;

import br.com.fiap.basic.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
