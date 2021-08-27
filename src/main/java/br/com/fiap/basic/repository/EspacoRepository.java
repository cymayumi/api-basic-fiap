package br.com.fiap.basic.repository;

import br.com.fiap.basic.entity.EspacoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EspacoRepository extends JpaRepository<EspacoEntity, Long> {

    List<EspacoEntity> findByEnderecoBairroAndDimensoesArea(String bairro, Float area);

    List<EspacoEntity> findByDimensoesArea(Float area);

    List<EspacoEntity> findByEnderecoBairro(String bairro);
}
