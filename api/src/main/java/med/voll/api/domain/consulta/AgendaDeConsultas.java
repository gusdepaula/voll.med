package med.voll.api.domain.consulta;

import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.Paciente;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaDeConsultas {
    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    public void agendar(DadosAgendamentoConsulta dados) {


        var paciente = pacienteRepository.findById(dados.idPaciente()).orElseThrow();
        var medico = medicoRepository.findById(dados.idMedico()).orElseThrow();
        var consulta = new Consulta(null, medico, paciente, dados.data(), null);

        consultaRepository.save(consulta);
    }
}
