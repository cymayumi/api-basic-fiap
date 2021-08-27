package br.com.fiap.basic.dto;

import br.com.fiap.basic.entity.EnderecoEntity;
import br.com.fiap.basic.entity.EspacoEntity;
import br.com.fiap.basic.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EspacoDTO {

    private Long idEspaco;
    private EnderecoDTO endereco;
    private UserDTO usuario;
    private DimensoesDTO dimensoes;
    private CaracteristicasDTO caracteristicas;

    public EspacoDTO(EspacoEntity espacoEntity) {
        this.idEspaco = espacoEntity.getIdEspaco();
        this.endereco = new EnderecoDTO();
        this.usuario = new UserDTO();
        this.dimensoes = new DimensoesDTO();
        this.caracteristicas = new CaracteristicasDTO();
    }

    public EspacoEntity toEntity(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EspacoEntity.class);
    }

}
