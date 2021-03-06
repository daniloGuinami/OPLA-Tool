package br.ufpr.dinf.gres.persistence.service;

import br.ufpr.dinf.gres.domain.entity.DistanceEuclidean;
import br.ufpr.dinf.gres.persistence.base.BaseService;
import br.ufpr.dinf.gres.persistence.repository.DistanceEuclideanRepository;
import org.springframework.stereotype.Service;

@Service
public class DistanceEuclideanService extends BaseService<DistanceEuclidean> {

    public DistanceEuclideanService(DistanceEuclideanRepository repository) {
        super(repository);
    }
}
