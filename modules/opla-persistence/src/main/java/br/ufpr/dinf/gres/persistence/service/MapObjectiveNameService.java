package br.ufpr.dinf.gres.persistence.service;

import br.ufpr.dinf.gres.domain.entity.MapObjectiveName;
import br.ufpr.dinf.gres.persistence.base.BaseService;
import br.ufpr.dinf.gres.persistence.repository.MapObjectiveNameRepository;
import org.springframework.stereotype.Service;

@Service
public class MapObjectiveNameService extends BaseService<MapObjectiveName> {

    public MapObjectiveNameService(MapObjectiveNameRepository repository) {
        super(repository);
    }
}
