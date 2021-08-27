package br.com.fiap.basic.entity;

import br.com.fiap.basic.dto.EnderecoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;
    @Column(name = "ds_logradouro")
    private String logradouro;
    @Column(name = "ds_endereco")
    private String endereco;
    @Column(name = "nr_numero")
    private String numero;
    @Column(name = "ds_complemento")
    private String complemento;
    @Column(name = "ds_bairro")
    private String bairro;
    @Column(name = "ds_cidade")
    private String cidade;
    @Column(name = "ds_estado")
    private String estado;
    @Column(name = "ds_pais")
    private String pais;

    public EnderecoEntity(EnderecoDTO enderecoDTO){
        this.id = enderecoDTO.getId();
        this.logradouro = enderecoDTO.getLogradouro();
        this.endereco = enderecoDTO.getEndereco();
        this.numero = enderecoDTO.getNumero();
        this.complemento = enderecoDTO.getComplemento();
        this.bairro = enderecoDTO.getBairro();
        this.cidade = enderecoDTO.getCidade();
        this.estado = enderecoDTO.getEstado();
        this.pais = enderecoDTO.getPais();
    }
}
