////  PAES_Settings.java 
////
////  Authors:
////       Antonio J. Nebro <antonio@lcc.uma.es>
////       Juan J. Durillo <durillo@lcc.uma.es>
////
////  Copyright (c) 2011 Antonio J. Nebro, Juan J. Durillo
////
////  This program is free software: you can redistribute it and/or modify
////  it under the terms of the GNU Lesser General Public License as published by
////  the Free Software Foundation, either version 3 of the License, or
////  (at your option) any later version.
////
////  This program is distributed in the hope that it will be useful,
////  but WITHOUT ANY WARRANTY; without even the implied warranty of
////  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
////  GNU Lesser General Public License for more details.
//// 
////  You should have received a copy of the GNU Lesser General Public License
////  along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//package br.ufpr.dinf.gres.core.jmetal4.experiments.settings;
//
//import java.util.HashMap;
//
//import br.ufpr.dinf.gres.core.jmetal4.core.core.Algorithm;
//import br.ufpr.dinf.gres.core.jmetal4.experiments.Settings;
//import br.ufpr.dinf.gres.core.jmetal4.metaheuristics.paes.PAES;
//import br.ufpr.dinf.gres.core.jmetal4.operators.mutation.Mutation;
//import br.ufpr.dinf.gres.core.jmetal4.operators.mutation.MutationFactory;
//import br.ufpr.dinf.gres.core.jmetal4.core.problems.ProblemFactory;
//import br.ufpr.dinf.gres.core.jmetal4.qualityIndicator.QualityIndicator;
//import domain.util.JMException;
//
///**
// * Settings class of algorithm PAES
// */
//public class PAES_Settings extends Settings{
//
//	public int maxEvaluations_ ;
//	public int archiveSize_    ;
//	public int biSections_     ;
//	public double mutationProbability_ ;
//	public double distributionIndex_   ;
//
//	/**
//	 * Constructor
//	 */
//	public PAES_Settings(String problem) {
//		super(problem) ;
//		
//    Object [] problemParams = {"Real"};
//    try {
//	    problem_ = (new ProblemFactory()).getProblem(problemName_, problemParams);
//    } catch (JMException e) {
//	    e.printStackTrace();
//    }      
//  	// Default settings
//  	maxEvaluations_ = 25000 ;
//  	archiveSize_    = 100   ;
//  	biSections_     = 5     ;
//  	mutationProbability_ = 1.0/problem_.getNumberOfVariables() ;
//  	distributionIndex_   = 20.0 ;
//	} // PAES_Settings
//
//	/**
//	 * Configure the MOCell algorithm with default parameter settings
//	 * @return an algorithm object
//	 * @throws domain.util.JMException
//	 */
//	public Algorithm configure() throws JMException {
//		Algorithm algorithm ;
//		Mutation  mutation   ;
//
//		QualityIndicator indicators ;
//
//    HashMap  parameters ; // Operator parameters
//
//		// Creating the problem
//		algorithm = new PAES(problem_) ;
//
//		// Algorithm parameters
//		algorithm.setInputParameter("maxEvaluations", maxEvaluations_);
//		algorithm.setInputParameter("biSections", biSections_);
//		algorithm.setInputParameter("archiveSize",archiveSize_ );
//
//    // Mutation (Real variables)
//    parameters = new HashMap() ;
//    parameters.put("probability", mutationProbability_) ;
//    parameters.put("distributionIndex", distributionIndex_) ;
//    mutation = MutationFactory.getMutationOperator("PolynomialMutation", parameters);                    
//    
//    // Mutation (BinaryReal variables)
//    //mutation = MutationFactory.getMutationOperator("BitFlipMutation");                    
//    //mutation.setParameter("probability",0.1);
//    
//    // Add the operators to the algorithm
//    algorithm.addOperator("mutation", mutation);
//
//		// Creating the indicator object
//    if ((paretoFrontFile_!=null) && (!paretoFrontFile_.equals(""))) {
//			indicators = new QualityIndicator(problem_, paretoFrontFile_);
//			algorithm.setInputParameter("indicators", indicators) ;  
//		} // if
//		return algorithm ;
//	} // configure
//} // PAES_Settings
