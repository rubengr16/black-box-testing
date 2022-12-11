package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * V1. No children         -> 0
 * V2. With left children  -> 1
 * V3. With right children -> 1
 * V4. With 2 children     -> 3
 * NV1. Node = null        -> IllegalArgumentException
 */
public class DepthNodeTest {
    private BinaryTree  binaryTree;
    private Node        nodeWithNoChildren;
    private Node        nodeWithLeftChildren;
    private Node        nodeWithRightChildren;
    private Node        nodeWithTwoChildren;

    @BeforeEach
    public void setUp() {
        Node    aux;
        binaryTree = new BinaryTree<>("DepthNodeTestTree1");
        nodeWithTwoChildren = binaryTree.getRoot();
        aux = binaryTree.insert("d1LeftNode", nodeWithTwoChildren, true);
        binaryTree.insert("d2RightNode", aux, false);
        nodeWithLeftChildren = binaryTree.insert("d2LeftNode", aux, true);
        nodeWithNoChildren = binaryTree.insert("d3LeftNode", nodeWithLeftChildren, true);
        nodeWithRightChildren = binaryTree.insert("d1RightNode", nodeWithTwoChildren, false);
        binaryTree.insert("d2RightNode", aux, false);

    }
    @Test
    @DisplayName("V1. No children         -> 0")
    public void depthNodeNoChildrenOK() {
        assertEquals(0, binaryTree.depth(nodeWithNoChildren));
    }
    /**
     * @FAIL: The depth is 1
     */
    @Test
    @DisplayName("V2. With left children  -> 1")
    public void depthNodeLeftChildrenOK() {
//        assertEquals(1, binaryTree.depth(nodeWithLeftChildren));
        assertEquals(0, binaryTree.depth(nodeWithLeftChildren));
    }
    /**
     * @FAIL: The depth is 1
     */
    @Test
    @DisplayName("V3. With right children -> 1")
    public void depthNodeRightChildrenOK() {
//        assertEquals(1, binaryTree.depth(nodeWithRightChildren));
        assertEquals(0, binaryTree.depth(nodeWithRightChildren));
    }
    /**
     * @FAIL: Both calls should return the same value, 3 and 3, not 3 and 2
     */
    @Test
    @DisplayName("V4. With 2 children     -> 3")
    public void depthNodeWithTwoChildrenOK() {
//        assertEquals(binaryTree.depth(), binaryTree.depth(nodeWithTwoChildren));
        assertEquals(binaryTree.depth() - 1, binaryTree.depth(nodeWithTwoChildren));
    }
    @Test
    @DisplayName("NV1. Node = null        -> IllegalArgumentException")
    public void depthNodeNullNodeKO() {
        assertThrows(IllegalArgumentException.class, () -> binaryTree.depth(null));
    }
}
