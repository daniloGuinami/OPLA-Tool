package br.ufpr.dinf.gres.core.jmetal4.metrics.objectivefunctions;

import br.ufpr.dinf.gres.architecture.representation.Architecture;
import br.ufpr.dinf.gres.core.jmetal4.metrics.ObjectiveFunctionImplementation;
import br.ufpr.dinf.gres.core.jmetal4.metrics.conventionalMetrics.MeanNumOpsByInterface;

public class TAM extends ObjectiveFunctionImplementation {

    public TAM(Architecture architecture) {
        super(architecture);
        double tamFitness = 0.0;
        MeanNumOpsByInterface NumOps = new MeanNumOpsByInterface(architecture);

        tamFitness = NumOps.getResults();
        this.setResults(tamFitness);
    }

}
