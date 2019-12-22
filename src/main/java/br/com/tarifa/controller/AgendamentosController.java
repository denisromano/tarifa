package br.com.tarifa.controller;

import br.com.tarifa.controller.request.CriarAgendamentosRequest;
import br.com.tarifa.controller.response.CriarAgendamentosResponse;
import br.com.tarifa.entity.Agendamentos;
import br.com.tarifa.repository.AgendamentosRepository;
import br.com.tarifa.service.AgendamentosServiceImpl;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/agendamentos")
@JsonDeserialize(using = LocalDateTimeDeserializer.class)
public class AgendamentosController {

    @Autowired
    private AgendamentosRepository agendamentosRepository;
    @Autowired
    private AgendamentosServiceImpl agendamentosServiceImpl;

    @PostMapping(path = "/agendar")
    public CriarAgendamentosResponse agendamento(@RequestBody CriarAgendamentosRequest criarAgendamentosRequest){

        CriarAgendamentosResponse criarAgendamentosResponse;
        criarAgendamentosResponse = agendamentosServiceImpl.agendarTransferencia(criarAgendamentosRequest);

        return criarAgendamentosResponse;
    }


    @GetMapping("{usuario}")
    public List<Agendamentos> list(@PathVariable String usuario){
        return agendamentosRepository.findByUsuario(usuario);
    }
}
