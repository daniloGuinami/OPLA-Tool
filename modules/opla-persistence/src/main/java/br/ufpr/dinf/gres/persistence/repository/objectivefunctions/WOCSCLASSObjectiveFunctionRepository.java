package br.ufpr.dinf.gres.persistence.repository.objectivefunctions;

import br.ufpr.dinf.gres.domain.entity.objectivefunctions.WOCSCLASSObjectiveFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WOCSCLASSObjectiveFunctionRepository extends JpaRepository<WOCSCLASSObjectiveFunction, String> {
}
