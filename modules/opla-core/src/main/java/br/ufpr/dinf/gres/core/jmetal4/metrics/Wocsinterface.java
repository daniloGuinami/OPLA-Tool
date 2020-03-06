package br.ufpr.dinf.gres.core.jmetal4.metrics;

import br.ufpr.dinf.gres.architecture.representation.Architecture;
import br.ufpr.dinf.gres.architecture.representation.Interface;
import br.ufpr.dinf.gres.architecture.representation.Method;
import br.ufpr.dinf.gres.architecture.representation.Package;
import br.ufpr.dinf.gres.core.jmetal4.results.ExecutionResults;
import br.ufpr.dinf.gres.core.jmetal4.results.ExperimentResults;

public class Wocsinterface extends Metrics {

    private double wocsinterface;
    private float results;

    public Wocsinterface(Architecture architecture) {

        this.results = 0;
        float valorwocsi = 0;
        float tcomplexidade = 0;
        float numclass = architecture.getAllInterfaces().size();

        for (Package pacote : architecture.getAllPackages()) {

            for (Interface interfa : pacote.getAllInterfaces()) {
                int cantparame = 0;
                int complexidade = 0;

                for (Method metodo : interfa.getOperations()) {

                    cantparame = metodo.getParameters().size() + 1;
                    complexidade += cantparame;
                }

                tcomplexidade = complexidade;

            }

        }
        valorwocsi = tcomplexidade / numclass;
        this.results = valorwocsi;

    }

    public float getResults() {

        return results;
    }

    public Wocsinterface(String idSolution, ExecutionResults executionResults, ExperimentResults experiement) {
        super.setExecutionResults(executionResults);
        super.setExperiement(experiement);
        super.setIdSolution(idSolution);
    }

    public double getWocsInterface() {
        return wocsinterface;
    }

    public void setWocsInterface(double wocsinterface) {
        this.wocsinterface = wocsinterface;
    }


}