package br.com.fiap.basic.dto;

import br.com.fiap.basic.entity.EnderecoEntity;
import br.com.fiap.basic.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private Long id;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String endereco;
    @NotBlank
    private String numero;

    private String complemento;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotBlank
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
