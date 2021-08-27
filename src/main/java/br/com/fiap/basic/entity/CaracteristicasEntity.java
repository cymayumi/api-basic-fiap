package br.com.fiap.basic.entity;

import br.com.fiap.basic.dto.CaracteristicasDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaracteristicasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caracteristicas")
    private Long id;
    @Column(name = "ds_portao_manual")
    private boolean portaoManual;
    @Column(name = "ds_portao_automatico")
    private boolean portaoAutomatico;
    @Column(name = "ds_sem_cobertura")
    private boolean semCobertura;
    @Column(name = "ds_com_cobertura")
    private boolean comCobertura;



    public CaracteristicasEntity(CaracteristicasDTO caracteristicasDTO){
        this.id = caracteristicasDTO.getId();
        this.portaoAutomatico = caracteristicasDTO.isPortaoAutomatico();
        this.portaoManual = caracteristicasDTO.isPortaoManual();
        this.semCobertura = caracteristicasDTO.isSemCobertura();
        this.comCobertura = caracteristicasDTO.isComCobertura();

    }
}
