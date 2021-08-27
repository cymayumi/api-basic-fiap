package br.com.fiap.basic.dto;

import br.com.fiap.basic.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotBlank
    private Integer cpf;
    private EnderecoDTO endereco;


    public UserDTO(UserEntity userEntity){
        this.id = userEntity.getId();
        this.nome = userEntity.getNome();
        this.email = userEntity.getEmail();
        this.cpf = userEntity.getCpf();
        endereco = new EnderecoDTO();


    }

}
