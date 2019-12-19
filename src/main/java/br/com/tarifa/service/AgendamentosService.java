package br.com.tarifa.service;

import br.com.tarifa.controller.request.CriarAgendamentosRequest;
import br.com.tarifa.controller.response.CriarAgendamentosResponse;
import br.com.tarifa.entity.Agendamentos;
import br.com.tarifa.repository.AgendamentosRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class AgendamentosService implements AgendamentoServiceImpl{

    private final AgendamentosRepository agendamentosRepository;

    public AgendamentosService(AgendamentosRepository agendamentosRepository) {
        this.agendamentosRepository = agendamentosRepository;
    }

    public CriarAgendamentosResponse agendarTransferencia(CriarAgendamentosRequest agendamentosRequest){
        CriarAgendamentosResponse criarAgendamentosResponse = new CriarAgendamentosResponse();
        Long qtdDias = ChronoUnit.DAYS.between(LocalDate.now(),agendamentosRequest.getDtAgendamento());
        if( qtdDias < 0){
            criarAgendamentosResponse.setMessage("Data de transferencia deve ser maior ou igual a data atual.");
            return criarAgendamentosResponse;
        } else if( agendamentosRequest.getDtAgendamento().equals(LocalDate.now())){
            agendamentosRequest.setValor(3 + (agendamentosRequest.getValor() * 0.03));
        } else if(qtdDias <= 10){
            agendamentosRequest.setValor(12 * qtdDias);
        } else if(qtdDias >= 10 && qtdDias < 20){
            agendamentosRequest.setValor(agendamentosRequest.getValor() * 0.08);
        } else if(qtdDias >= 20 && qtdDias < 30){
            agendamentosRequest.setValor(agendamentosRequest.getValor() * 0.06);
        } else if(qtdDias >= 30 && qtdDias <= 40){
            agendamentosRequest.setValor(agendamentosRequest.getValor() * 0.04);
        } else if(qtdDias >= 40 && agendamentosRequest.getValor() > 100.000){
            agendamentosRequest.setValor(agendamentosRequest.getValor() * 0.02);
        } else {
            criarAgendamentosResponse.setMessage("Transferencia não efetuada");
            return  criarAgendamentosResponse;
        }
        Agendamentos agendamentos = new Agendamentos(agendamentosRequest);
        agendamentosRepository.save(agendamentos);

        if (agendamentos.getId() != null){
            criarAgendamentosResponse.setMessage("Transferencia efetuada.");
        }
        return criarAgendamentosResponse;
    }


    public void salvar(Agendamentos agendamentos) {
        agendamentosRepository.save(agendamentos);
    }


}
