package alunos.ado.alunos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    private AlunosRepository alunosRepository;

    @GetMapping
    public List<Alunos> getAllAlunos() {
        return alunosRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public Alunos getAlunoById(@PathVariable Integer id) {
        return alunosRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado : id = " + id));
    }

    @GetMapping("/ra/{ra}")
    public Alunos getAlunoByRA(@PathVariable Long ra) {
        return alunosRepository.findByRA(ra)
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado com o RA: " + ra));
    }

    @PostMapping
    public Alunos createAluno(@RequestBody Alunos aluno) {
        return alunosRepository.save(aluno);
    }

    @PutMapping("/ra/{ra}")
    public Alunos updateAlunoByRA(@PathVariable Long ra, @RequestBody Alunos alunoDetails) {
        Alunos aluno = alunosRepository.findByRA(ra)
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado com o RA: " + ra));
        aluno.setNome(alunoDetails.getNome());
        aluno.setCEP(alunoDetails.getCEP());
        aluno.setNumero(alunoDetails.getNumero());
        aluno.setComplemento(alunoDetails.getComplemento());
        aluno.setNotaADO1(alunoDetails.getNotaADO1());
        aluno.setNotaPI(alunoDetails.getNotaPI());
        return alunosRepository.save(aluno);
    }

    @PutMapping("/id/{id}")
    public Alunos updateAluno(@PathVariable Integer id, @RequestBody Alunos alunoDetails) {
        Alunos aluno = alunosRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado : id = " + id));
        aluno.setNome(alunoDetails.getNome());
        aluno.setRA(alunoDetails.getRA());
        aluno.setCEP(alunoDetails.getCEP());
        aluno.setNumero(alunoDetails.getNumero());
        aluno.setComplemento(alunoDetails.getComplemento());
        aluno.setNotaADO1(alunoDetails.getNotaADO1());
        aluno.setNotaPI(alunoDetails.getNotaPI());
        return alunosRepository.save(aluno);
    }

    @DeleteMapping("/ra/{ra}")
    public void deleteAlunoByRA(@PathVariable Long ra) {
        Alunos aluno = alunosRepository.findByRA(ra)
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado com o RA: " + ra));
        alunosRepository.delete(aluno);
    }

    @DeleteMapping("/id/{id}")
    public void deleteAlunoByID(@PathVariable int id) {
        Alunos aluno = alunosRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado com o id: " + id));
        alunosRepository.delete(aluno);
    }

    

}
