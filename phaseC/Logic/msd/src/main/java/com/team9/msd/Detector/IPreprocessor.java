package com.team9.msd.Detector;

import com.github.javaparser.ast.CompilationUnit;

/**
 * Interface for Preprocessor
 */
public interface IPreprocessor {

    /**
     * Removes all the comments from the given CompilationUnit
     */
    void removeComments(CompilationUnit cu);

    /**
     * Rename the method names in the given CompilationUnit
     * @param cu the compilationUnit of the Ast that needs renaming of methods
     */
    void renameMethods(CompilationUnit cu);


}