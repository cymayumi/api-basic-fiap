package br.com.fiap.basic.entity;

import br.com.fiap.basic.dto.DimensoesDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DimensoesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dimensoes")
    private Long id;
    @Column(name = "nr_largura")
    private float largura;
    @Column(name = "nr_comprimento")
    private float comprimento;
    @Column(name = "nr_altura")
    private float altura;
    @Column(name = "vl_area")
    private float area;

    public DimensoesEntity(DimensoesDTO dimensoesDTO){
        this.id = dimensoesDTO.getId();
        this.largura = dimensoesDTO.getLargura();
        this.comprimento = dimensoesDTO.getComprimento();
        this.altura = dimensoesDTO.getAltura();
        this.area = dimensoesDTO.getArea();
    }
}
