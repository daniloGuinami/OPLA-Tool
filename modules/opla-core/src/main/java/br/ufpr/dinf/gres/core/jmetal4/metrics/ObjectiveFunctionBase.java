package br.ufpr.dinf.gres.core.jmetal4.metrics;

import br.ufpr.dinf.gres.architecture.representation.Architecture;

public class ObjectiveFunctionBase {
    private Double results;
    private Architecture architecture;

    public ObjectiveFunctionBase(Architecture architecture) {
        this.architecture = architecture;
    }

    public Double getResults() {
        return results;
    }

    public void setResults(Double results) {
        this.results = results;
    }

    public void addToResults(double value) {
        this.results += value;
    }

    public void divideToResults(double value) {
        this.results /= value;
    }

    public Architecture getArchitecture() {
        return architecture;
    }

    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture;
    }

    public void setResults(int results) {
        this.results = (double) results;
    }
}