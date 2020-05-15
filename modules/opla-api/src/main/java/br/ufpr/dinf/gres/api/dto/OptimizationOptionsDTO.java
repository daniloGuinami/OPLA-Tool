package br.ufpr.dinf.gres.api.dto;

import br.ufpr.dinf.gres.api.gateway.OptimizationAlgorithms;
import br.ufpr.dinf.gres.architecture.builders.ArchitectureBuilders;
import br.ufpr.dinf.gres.core.jmetal4.metrics.ObjectiveFunctions;
import br.ufpr.dinf.gres.core.jmetal4.operators.FeatureMutationOperators;

import java.util.Arrays;
import java.util.List;

public class OptimizationOptionsDTO {
    public List<OptimizationAlgorithms> algorithms = Arrays.asList(OptimizationAlgorithms.values());
    public List<ObjectiveFunctions> objectiveFunctions = Arrays.asList(ObjectiveFunctions.values());
    public List<FeatureMutationOperators> featureMutationOperators = Arrays.asList(FeatureMutationOperators.values());
    public List<ArchitectureBuilders> architectureBuilders = Arrays.asList(ArchitectureBuilders.values());
}