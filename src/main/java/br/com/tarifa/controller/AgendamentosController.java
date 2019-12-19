package br.com.tarifa.controller;

import br.com.tarifa.controller.request.CriarAgendamentosRequest;
import br.com.tarifa.controller.response.CriarAgendamentosResponse;
import br.com.tarifa.entity.Agendamentos;
import br.com.tarifa.repository.AgendamentosRepository;
import br.com.tarifa.service.AgendamentosService;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/agendamentos")
@JsonDeserialize(using = LocalDateTimeDeserializer.class)
public class AgendamentosController {

    @Autowired
    private AgendamentosRepository agendamentosRepository;
    @Autowired
    private AgendamentosService agendamentosService;

    @PostMapping(path = "/agendar")
    public CriarAgendamentosResponse agendamento(@RequestBody CriarAgendamentosRequest criarAgendamentosRequest){

        CriarAgendamentosResponse criarAgendamentosResponse = new CriarAgendamentosResponse();
        criarAgendamentosResponse = agendamentosService.agendarTransferencia(criarAgendamentosRequest);

        return criarAgendamentosResponse;
    }


    @GetMapping("{usuario}")
    public Iterable<Agendamentos> list(@PathVariable String usuario){
        return agendamentosRepository.findByUsuario(usuario);
    }
}
