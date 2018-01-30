package com.team9.msd.Detector;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class is used for implementing SimilarityChecker by using Jaccards similarity algo
 * It measures similarity between finite sample sets, and is defined as the size of the
 * intersection divided by the size of the union of the sample sets
 */

public class JaccardSimilarityChecker implements SimilarityChecker {

    private ASTService ast1;
    private ASTService ast2;

    JaccardSimilarityChecker(ASTService ast1, ASTService ast2){
        this.ast1 = ast1;
        this.ast2 = ast2;
    }

    /***
     * Uses the Jaccard Similarity algorithm i.e the Intersection of two AST hashsets
     * divided by their Union
     * @return The similarity score of the two ASTs
     */
    @Override
    public double getSimilarity(){
        if(ast1 == null || ast2 == null)
            return 0.0;
        Set<Integer> setA = new HashSet<>(ast1.getHashCodeList());
        Set<Integer> setB = new HashSet<>(ast2.getHashCodeList());

        // Calculate the intersection of the two sets
        Set<Integer> intersection = setA.stream()
                .filter(setB::contains)
                .collect(Collectors.toSet());

        // Calculate the union of the two sets
        Set<Integer> union = Stream.concat(setA.stream(), setB.stream())
                .distinct().sorted()
                .collect(Collectors.toSet());

        return (1.0 * intersection.size() / union.size()) * 100;
    }
}