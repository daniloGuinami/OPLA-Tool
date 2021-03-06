package br.ufpr.dinf.gres.api.resource.objectivefunctions;

import br.ufpr.dinf.gres.api.base.BaseResource;
import br.ufpr.dinf.gres.domain.entity.objectivefunctions.ACOMPObjectiveFunction;
import br.ufpr.dinf.gres.domain.entity.objectivefunctions.TAMObjectiveFunction;
import br.ufpr.dinf.gres.persistence.base.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tam-objective-function")
public class TAMObjectiveFunctionResource extends BaseResource<TAMObjectiveFunction> {

    public TAMObjectiveFunctionResource(BaseService<TAMObjectiveFunction> service) {
        super(service);
    }
}