package br.com.fiap.basic.entity;


import br.com.fiap.basic.dto.EspacoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EspacoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_espaco")
    private Long idEspaco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    private EnderecoEntity endereco;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_user", referencedColumnName = "id_usuario")
    private UserEntity usuario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dimensoes", referencedColumnName = "id_dimensoes")
    private DimensoesEntity dimensoes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_caracteristicas", referencedColumnName = "id_caracteristicas")
    private CaracteristicasEntity caracteristicas;

    @JoinColumn(name = "ds_espaco", referencedColumnName = "ds_espaco")
    private String dsEspaco;


    public EspacoDTO toDTO(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EspacoDTO.class);
    }


}
