package br.com.fiap.basic.service;

import br.com.fiap.basic.dto.*;
import br.com.fiap.basic.entity.EspacoEntity;
import br.com.fiap.basic.repository.EspacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EspacoService {

    @Autowired
    private EspacoRepository espacoRepository;

    public List<EspacoDTO> buscarEspaco(String bairro, Float area) {
        List<EspacoEntity> listaBuscaEspaco;

        listaBuscaEspaco = espacoRepository.findAll();

//        if (area == null) {
//            listaBuscaEspaco = espacoRepository.findByEnderecoBairro(bairro);
//        } else if (bairro == null) {
//            listaBuscaEspaco = espacoRepository.findByDimensoesArea(area);
//        } else {
//            listaBuscaEspaco = espacoRepository.findByEnderecoBairroAndDimensoesArea(bairro, area);
//        }


        List<EspacoDTO> listaEspacoDTO = new ArrayList<>();

        for (EspacoEntity itemLista : listaBuscaEspaco) {
            listaEspacoDTO.add(itemLista.toDTO());
        }

        return listaEspacoDTO;
    }

    public EspacoDTO addEspaco(EspacoDTO espaco) {
        return this.espacoRepository.save(espaco.toEntity()).toDTO();

    }


}
