package br.com.fiap.basic.dto;

import br.com.fiap.basic.entity.DimensoesEntity;
import br.com.fiap.basic.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DimensoesDTO {

    private Long id;
    private float largura;
    private float comprimento;
    private float altura;
    private float area;

    public DimensoesDTO(DimensoesEntity dimensoesEntity){
        this.id = dimensoesEntity.getId();
        this.largura = dimensoesEntity.getLargura();
        this.comprimento = dimensoesEntity.getComprimento();
        this.altura = dimensoesEntity.getAltura();
        this.area = dimensoesEntity.getArea();


    }

}
