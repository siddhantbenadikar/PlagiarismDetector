package com.team9.msd.Detector;

/**
 * Interface for SimilarityCheckers
 */
public interface SimilarityChecker {

    /**
     * Returns the similarity score of the two ASTs
     */
    double getSimilarity();

}