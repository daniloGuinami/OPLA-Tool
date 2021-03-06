package br.ufpr.dinf.gres.api.resource.objectivefunctions;

import br.ufpr.dinf.gres.domain.entity.objectivefunctions.EXTObjectiveFunction;
import br.ufpr.dinf.gres.api.base.BaseResource;
import br.ufpr.dinf.gres.persistence.base.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ext-objective-function")
public class EXTObjectiveFunctionResource extends BaseResource<EXTObjectiveFunction> {

    public EXTObjectiveFunctionResource(BaseService<EXTObjectiveFunction> service) {
        super(service);
    }
}