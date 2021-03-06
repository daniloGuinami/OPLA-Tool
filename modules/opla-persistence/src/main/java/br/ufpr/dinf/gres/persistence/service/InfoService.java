package br.ufpr.dinf.gres.persistence.service;

import br.ufpr.dinf.gres.domain.entity.Info;
import br.ufpr.dinf.gres.persistence.base.BaseService;
import br.ufpr.dinf.gres.persistence.repository.InfoRepository;
import org.springframework.stereotype.Service;

@Service
public class InfoService extends BaseService<Info> {

    public InfoService(InfoRepository repository) {
        super(repository);
    }
}
