package alunos.ado.alunos;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<Alunos, Integer> {
    Optional<Alunos> findByRA(Long RA);
}
