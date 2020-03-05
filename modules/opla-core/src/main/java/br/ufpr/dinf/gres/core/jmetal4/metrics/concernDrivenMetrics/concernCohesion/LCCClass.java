package br.ufpr.dinf.gres.core.jmetal4.metrics.concernDrivenMetrics.concernCohesion;

import br.ufpr.dinf.gres.architecture.representation.Architecture;
import br.ufpr.dinf.gres.architecture.representation.Class;

import java.util.ArrayList;
import java.util.Collection;

public class LCCClass {

    private final Architecture architecture;
    private final Collection<LCCClassComponentResult> results = new ArrayList<>();

    public LCCClass(Architecture architecture) {
        this.architecture = architecture;
        for (Class cls : architecture.getAllClasses()) {
            getResults().add(new LCCClassComponentResult(cls));
        }
    }

    public Architecture getArchitecture() {
        return architecture;
    }

    public Collection<LCCClassComponentResult> getResults() {
        return results;
    }
}
