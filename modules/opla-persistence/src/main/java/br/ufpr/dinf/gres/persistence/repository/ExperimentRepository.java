package br.ufpr.dinf.gres.persistence.repository;

import br.ufpr.dinf.gres.domain.entity.Experiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperimentRepository extends JpaRepository<Experiment, String> {
}
