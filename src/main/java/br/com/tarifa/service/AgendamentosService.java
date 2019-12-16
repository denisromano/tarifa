package br.com.tarifa.service;

import br.com.tarifa.entity.Agendamentos;
import br.com.tarifa.repository.AgendamentosRepository;
import org.springframework.stereotype.Service;

@Service
public class AgendamentosService {

    private final AgendamentosRepository agendamentosRepository;

    public AgendamentosService(AgendamentosRepository agendamentosRepository) {
        this.agendamentosRepository = agendamentosRepository;
    }

    public void salvar(Agendamentos agendamentos) {
        agendamentosRepository.save(agendamentos);
    }


}
