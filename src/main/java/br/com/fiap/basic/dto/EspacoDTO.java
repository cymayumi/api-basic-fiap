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
    private String dsEspaco;


    public EspacoEntity toEntity(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(this, EspacoEntity.class);
    }

}
