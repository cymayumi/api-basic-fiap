package br.com.fiap.basic.dto;

import br.com.fiap.basic.entity.EnderecoEntity;
import br.com.fiap.basic.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private Long id;

    private String logradouro;

    private String endereco;

    private String numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    private String pais;

    public EnderecoDTO(EnderecoEntity enderecoEntity){
        this.id = enderecoEntity.getId();
        this.logradouro = enderecoEntity.getLogradouro();
        this.endereco = enderecoEntity.getEndereco();
        this.numero = enderecoEntity.getNumero();
        this.complemento = enderecoEntity.getComplemento();
        this.bairro = enderecoEntity.getBairro();
        this.cidade = enderecoEntity.getCidade();
        this.estado = enderecoEntity.getEstado();
        this.pais = enderecoEntity.getPais();
    }
}
