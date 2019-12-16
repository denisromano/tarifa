package br.com.tarifa.controller;

import br.com.tarifa.entity.Agendamentos;
import br.com.tarifa.repository.AgendamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/agendamentos")
public class AgendamentosController {

    @Autowired
    private AgendamentosRepository agendamentosRepository;

    @PostMapping(path = "/agendar")
    public boolean agendamento(){


        return true;
    }


    @GetMapping
    public Iterable<Agendamentos> list(){
        return agendamentosRepository.findAll();
    }
}
