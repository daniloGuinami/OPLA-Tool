package br.ufpr.dinf.gres.api.gateway;

import br.ufpr.dinf.gres.api.dto.OptimizationDto;
import br.ufpr.dinf.gres.core.jmetal4.experiments.base.BestOf12OPLABase;
import br.ufpr.dinf.gres.core.jmetal4.experiments.base.NSGAIIConfigs;
import org.springframework.stereotype.Component;

@Component
public class BestOf12Gateway implements IGateway {
    private final BestOf12OPLABase base;

    public BestOf12Gateway(BestOf12OPLABase base) {
        this.base = base;
    }

    public void execute(OptimizationDto optimizationDto) {
        GatewayUtils.addListener();
        NSGAIIConfigs configs = new NSGAIIConfigs();
        GatewayUtils.setConfigs(optimizationDto, configs);
        configs.setPopulationSize(optimizationDto.getPopulationSize());
        try {
            base.execute(configs);
        } catch (Exception e) {
            e.printStackTrace();
            GatewayUtils.log("ERROR");
        }
        GatewayUtils.log("Fin");
    }
}
