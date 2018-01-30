package com.team9.msd.Detector;

import com.team9.msd.Visitor.ASTVisitorService;
import org.eclipse.jdt.core.dom.ASTNode;
import java.util.*;

/**
 * This class is used for implementing SimilarityChecker by using longest common subsequence
 * It finds the number of longest common nodes of the two given ASTs.
 */
public class LCSSimilarityChecker implements SimilarityChecker {

    private ASTNode ast1;
    private ASTNode ast2;

    private Map<ASTNode, List<ASTNode>> similarNodeMap = new HashMap<>();

    LCSSimilarityChecker(ASTNode ast1, ASTNode ast2){
        this.ast1 = ast1;
        this.ast2 = ast2;
    }

    /**
     * This method is called by the classes that will be want to get the
     * LCS Similarity
     * @return The similarity score of the two ASTs using the LCS algorithm
     */
    @Override
    public double getSimilarity() {

        if (ast1 == null || ast2 == null)
            return 0.0;

        List<ASTNode> subtree1 = ASTVisitorService.getListOfNodes(ast1);
        List<ASTNode> subtree2 = ASTVisitorService.getListOfNodes(ast2);

        double totalScore = 0;
        int i = 0;

        /***
         * Checks if the two ASTNode are of type METHOD_DECLARATION. Only if
         * both of them are, then it will compare the two.
         * Worst case: O(m*n) comparisons
         */
        for (ASTNode nodeA : subtree1) {
            for (ASTNode nodeB : subtree2) {
                if (nodeA.getNodeType() == ASTNode.METHOD_DECLARATION
                        && nodeB.getNodeType() == ASTNode.METHOD_DECLARATION) {
                    double score = compareMethods(nodeA, nodeB);
                    i++;
                    totalScore += score;
                }
            }
        }

        /***
         *  if no two nodes were method declarations then it will return 0
         */
        if (i == 0)
            return 0.0;
        return totalScore / i;
    }

    /**
     * Helper function for getSimilarity() that compares the two ASTNode passed it to it
     * @param node1, it is the first ASTNode
     * @param node2, it is the second ASTNode
     * @return double result, which is the similarity score between the
     *         two input ASTNode
     */
    private double compareMethods (ASTNode node1, ASTNode node2) {

        List<ASTNode> subtree1 = ASTVisitorService.getListOfNodes(node1);
        List<ASTNode> subtree2 = ASTVisitorService.getListOfNodes(node2);

        Map<ASTNode, ASTNode> temp = new HashMap<>();

        int m = subtree1.size();
        int n = subtree2.size();

        // Initializes an empty array with 0's in its first row and column
        int[][] tracker = new int[m][n];
        for(int i = 0; i < m; i++){
            tracker[i][0] = 0;
        }
        for(int i = 0; i < n; i++){
            tracker[0][i] = 0;
        }

        // Calls the helper method which computes the array values using Dynamic programming
        tracker = makeLCSmatrix(m, n, tracker, subtree1, subtree2);

        // Calls the helper method that maps the similar nodes
        temp = makeMapForSimilarNodes(m, n, tracker, temp, subtree1, subtree2);

        double result = 0;

        Map<ASTNode, ASTNode> alignment = new HashMap<>();

        // Calls the helper method that aligns the similar nodes
        for (ASTNode no : subtree1) {
            result = storeAlignment(temp, no, alignment, node1, result);
        }

        result = (result * 100.0) / Math.max(m , n);
        return result;

    }

    /**
     * Helper method for compareMethods() that builds a cost matrix for implementing
     * the Longest common subsequence algorithm between two AST subtree1 and subtree2
     * using Dynamic programming
     * @param m size of subtree1
     * @param n size of subtree2
     * @param tracker an empty matrix which is initialized earlier
     * @param subtree1 the first subtree
     * @param subtree2 the second subtree
     * @return tracker[][], it stores the lengths of every possible subsequence betweeen
     *          the two given subtrees
     */
    private int[][] makeLCSmatrix(int m, int n, int[][] tracker, List<ASTNode> subtree1, List<ASTNode> subtree2) {

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                ASTNode node1 = subtree1.get(i - 1);
                ASTNode node2 = subtree2.get(j - 1);

                //Updates the tracker only if the two nodes are similar and the parents of the nodes are similar
                // This essentially is the LCS algorithm using Dynamic Programming at work
                if (node1.getNodeType() == node2.getNodeType() && (node1.getParent().getNodeType() == node2.getParent().getNodeType())
                        || node1.getNodeType() == ASTNode.BLOCK) {
                    tracker[i][j] = tracker[i - 1][j - 1] + 1;

                } else {
                    tracker[i][j] = Math.max(tracker[i][j - 1], tracker[i - 1][j]);
                }
            }
        }
        return tracker;
    }

    /**
     * Helper methods that maps the similar nodes together
     * @param m size of subtree1
     * @param n size of subtree2
     * @param tracker an empty matrix which is initialized earlier
     * @param map the map which stores the similar nodes as a key value pair
     * @param subtree1 the first subtree
     * @param subtree2 the second subtree
     * @return map, it stores the similar nodes as a key value pair
     */
    private Map<ASTNode, ASTNode> makeMapForSimilarNodes
            (int m, int n, int[][] tracker, Map<ASTNode, ASTNode> map, List<ASTNode> subtree1,
             List<ASTNode> subtree2) {
        int i = m - 1;
        int j = n - 1;
        while (i > 0 && j > 0) {
            ASTNode v3 = subtree1.get(i - 1);
            ASTNode v4 = subtree2.get(j - 1);
            // Checks if the nodes are similar, if they are it stores them in the map as a
            // key value pair
            if (v3.getNodeType() == v4.getNodeType() &&
                    (v3.getParent().getNodeType() == v4.getParent().getNodeType())
                    || v3.getNodeType() == ASTNode.BLOCK) {
                map.put(v3, v4);
                i--;
                j--;
            } else if (tracker[i][j - 1] > tracker[i - 1][j]) {
                j = j - 1;
            } else {
                i = i - 1;
            }
        }

        return map;
    }

    /**
     * Helper method for compareMethods that preserves the final alignment
     * between each of the nodes that are similar
     * @param map, it stores the similar nodes as a key value pair
     * @param v, an ASTNode of the subtree1
     * @param alignment, stores the final set of alignments
     * @param r1, it is the root of the AST which is only one method
     * @param result, it is the length of the longest common subtree
     * @return the length of the longest common subsequence
     */
    private double storeAlignment(Map<ASTNode, ASTNode> map, ASTNode v, Map<ASTNode,
            ASTNode> alignment, ASTNode r1, double result) {
        ASTNode w;
        if (map.containsKey(v)) {
            w = map.get(v);
            //If v is the root node containing method, then store the alignment
            if (v == r1) {
                alignment.put(v, w);
            } else {
                ASTNode p1 = v.getParent();
                ASTNode p2 = w.getParent();

                if (alignment.containsKey(p1)) {

                    //store v, w in alignment only if their parents are aligned
                    // this helps maintain structure of the code
                    if (alignment.get(p1).equals(p2)) {
                        alignment.put(v, w);
                    }
                    else if (v.getNodeType() == ASTNode.BLOCK) {
                        // checks for each child of v if w is its parent and put (v,w) in alignment if it is
                        for (ASTNode v1 : ASTVisitorService.getChildren(v)) {
                            if (map.containsKey(v1)) {
                                ASTNode w1 = map.get(v1);
                                if (w1.getParent() == w) {
                                    alignment.put(v, w);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            result = calculateResult(v, w, alignment, result);
        }

        return result;
    }

    /**
     * this helper methods calculates the longest common subsequence of the two ASTs
     * @param v it is the ASTNode belonging the subtree1
     * @param w it is the ASTNode belonging the subtree2
     * @param alignment stores the set of similar node pairs
     * @param result stores the length of the longest common subtree
     * @return length of the longest common subtree between two AST
     */
    private double calculateResult(ASTNode v, ASTNode w, Map<ASTNode, ASTNode> alignment, double result) {
        if (alignment.containsKey(v)) {
            List<ASTNode> listOfNodes;
            if (similarNodeMap.containsKey(v)) {
                listOfNodes = similarNodeMap.get(v);
            } else {
                listOfNodes = new ArrayList<>(100);
            }
            listOfNodes.add(w);
            similarNodeMap.put(v, listOfNodes);
            result = result + 1;
        }
        return result;
    }

    /**
     * Getter for the similarNodeMap which stores the final aligned pairs
     * @return map of similar nodes assigned as key value pair
     */
    public Map<ASTNode, List<ASTNode>> getSimilarNodeMap() {
        return similarNodeMap;
    }
}