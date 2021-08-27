package br.com.fiap.basic.repository;

import br.com.fiap.basic.entity.CaracteristicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaracteristicasRepository extends JpaRepository<CaracteristicasEntity, Long> {
}
