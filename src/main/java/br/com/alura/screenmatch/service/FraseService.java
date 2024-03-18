package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.dto.FraseDTO;
import br.com.alura.screenmatch.model.Frase;
import br.com.alura.screenmatch.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}