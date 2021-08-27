package br.com.fiap.basic.dto;

import br.com.fiap.basic.entity.CaracteristicasEntity;
import br.com.fiap.basic.entity.EnderecoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaracteristicasDTO {

    private Long id;
    private boolean portaoManual;
    private boolean portaoAutomatico;
    private boolean semCobertura;
    private boolean comCobertura;

    private enum Tipo {QUARTO, GARAGEM, TERRENO, EDICULA}

    ;

    public CaracteristicasDTO(CaracteristicasEntity caracteristicasEntity) {
        this.id = caracteristicasEntity.getId();
        this.portaoManual = caracteristicasEntity.isPortaoManual();
        this.portaoAutomatico = caracteristicasEntity.isPortaoAutomatico();
        this.semCobertura = caracteristicasEntity.isSemCobertura();
        this.comCobertura = caracteristicasEntity.isComCobertura();
    }
}
