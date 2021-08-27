package br.com.fiap.basic.entity;


import br.com.fiap.basic.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;
    @Column(name = "nome_usuario")
    private String nome;
    @Column(name = "ds_email")
    private String email;
    @Column(name = "nr_cpf")
    private Integer cpf;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    private EnderecoEntity endereco;


    public UserEntity(UserDTO userDTO){
        this.id = userDTO.getId();
        this.nome = userDTO.getNome();
        this.email = userDTO.getEmail();
        this.cpf = userDTO.getCpf();
        this.endereco = new EnderecoEntity(userDTO.getEndereco());

    }
}
