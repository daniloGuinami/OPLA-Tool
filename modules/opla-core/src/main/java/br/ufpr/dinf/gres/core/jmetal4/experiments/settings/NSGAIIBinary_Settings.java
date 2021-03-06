////  NSGAIIBinary_Settings.java 
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
//import br.ufpr.dinf.gres.core.jmetal4.core.core.Operator;
//import br.ufpr.dinf.gres.core.jmetal4.experiments.Settings;
//import br.ufpr.dinf.gres.core.jmetal4.metaheuristics.nsgaII.NSGAII;
//import br.ufpr.dinf.gres.core.jmetal4.operators.crossover.CrossoverFactory;
//import br.ufpr.dinf.gres.core.jmetal4.operators.mutation.MutationFactory;
//import br.ufpr.dinf.gres.core.jmetal4.operators.selection.SelectionFactory;
//import br.ufpr.dinf.gres.core.jmetal4.core.problems.ProblemFactory;
//import br.ufpr.dinf.gres.core.jmetal4.qualityIndicator.QualityIndicator;
//import domain.util.JMException;
//
///**
// * Settings class of algorithm NSGA-II (binary encoding)
// */
//public class NSGAIIBinary_Settings extends Settings {
//  
//  int populationSize_  ;
//  int maxEvaluations_  ;
//
//  double mutationProbability_  ;
//  double crossoverProbability_ ;  
//  
//  /**
//   * Constructor
//   */
//  public NSGAIIBinary_Settings(String problem) {
//    super(problem) ;
//    
//    Object [] problemParams = {"BinaryReal"};
//    try {
//	    problem_ = (new ProblemFactory()).getProblem(problemName_, problemParams);
//    } catch (JMException e) {
//	    e.printStackTrace();
//    }      
//    
//    // Default settings
//    populationSize_ = 100   ;
//    maxEvaluations_ = 25000 ;
//
//    mutationProbability_  = 1.0/problem_.getNumberOfBits();
//    crossoverProbability_ = 0.9 ; 
//  } // NSGAIIBinary_Settings
//  
//  /**
//   * Configure NSGAII with user-defined parameter settings
//   * @return A NSGAII algorithm object
//   * @throws domain.util.JMException
//   */
//  public Algorithm configure() throws JMException {
//    Algorithm algorithm ;
//    Operator  selection ;
//    Operator  crossover ;
//    Operator  mutation  ;
//    
//    QualityIndicator indicators ;
// 
//    HashMap  parameters ; // Operator parameters
//
//    // Creating the problem
//    algorithm = new NSGAII(problem_) ;
//    
//    // Algorithm parameters
//    algorithm.setInputParameter("populationSize", populationSize_);
//    algorithm.setInputParameter("maxEvaluations", maxEvaluations_);
//
//    
//    // Mutation and Crossover Binary codification
//    parameters = new HashMap() ;
//    parameters.put("probability", crossoverProbability_) ;
//    crossover = CrossoverFactory.getCrossoverOperator("SinglePointCrossover", parameters);                   
//
//    parameters = new HashMap() ;
//    parameters.put("probability", mutationProbability_) ;
//    mutation = MutationFactory.getMutationOperator("BitFlipMutation",parameters);    
//    
//    // Selection Operator 
//    parameters = null ;
//    selection = SelectionFactory.getSelectionOperator("BinaryTournament2", parameters) ;   
//    
//    // Add the operators to the algorithm
//    algorithm.addOperator("crossover",crossover);
//    algorithm.addOperator("mutation",mutation);
//    algorithm.addOperator("selection",selection);
//    
//   // Creating the indicator object
//    if ((paretoFrontFile_!=null) && (!paretoFrontFile_.equals(""))) {
//      indicators = new QualityIndicator(problem_, paretoFrontFile_);
//      algorithm.setInputParameter("indicators", indicators) ;  
//   } // if
//    return algorithm ;
//  } // configure
//} // NSGAIIBinary_Settings
