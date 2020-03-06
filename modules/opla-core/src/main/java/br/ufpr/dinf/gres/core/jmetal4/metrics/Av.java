package br.ufpr.dinf.gres.core.jmetal4.metrics;

import br.ufpr.dinf.gres.architecture.representation.Architecture;
import br.ufpr.dinf.gres.architecture.representation.Element;
import br.ufpr.dinf.gres.architecture.representation.Package;
import br.ufpr.dinf.gres.core.jmetal4.results.ExecutionResults;
import br.ufpr.dinf.gres.core.jmetal4.results.ExperimentResults;

public class Av extends Metrics {

    private double av;
    private int results;
    private int a;


    public Av(String idSolution, ExecutionResults executionResults, ExperimentResults experiement) {
        super.setExecutionResults(executionResults);
        super.setExperiement(experiement);
        super.setIdSolution(idSolution);
    }

	private Architecture architecture;


	private int cantComponetvariable(Architecture architecture){

		//private int tcompvariable;
		int cantvcomponet = 0;

		for(Package pacote : this.architecture.getAllPackages()){

			int variablecomp = 0;

			for(Element elemento : pacote.getElements()){

				if(elemento.getVariationPoint() != null){
					variablecomp = 1;
				}
			}

			if (variablecomp == 1){
				cantvcomponet++;
			}
		}

		return cantvcomponet;
	}


	public Av(Architecture architecture){
		this.architecture = architecture;
		int compvariable = cantComponetvariable(this.architecture);

		for(Package pacote : this.architecture.getAllPackages()){

			int compcomposto = 0;

			for(Element elemento : pacote.getElements()){

				if(elemento.getTypeElement().equals("package")){

					compcomposto++;

				}
			}

			if(compcomposto != 0){
				this.a = compcomposto;
			}else{
				this.a = compvariable;
			}
		}

		this.results = compvariable + this.a;
	}



	public int getResults() {
		return results;
	}

    public double getAv() {
        return av;
    }

    public void setAv(double av) {
        this.av = av;
    }


}