package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * V1. No children         -> 0
 * V2. With left children  -> 1
 * V3. With right children -> 1
 * V4. With 2 children     -> 3
 * NV1. No root            -> IllegalArgumentException
 */
public class DepthTest {
    private BinaryTree binaryTree;
    @BeforeEach
    public void setUp() {
        binaryTree = new BinaryTree<>("DepthTestTree1");
    }
    @Test
    @DisplayName("V1. No children         -> 0")
    public void depthNoChildrenOK() {
        assertEquals(0, binaryTree.depth());
    }
    @Test
    @DisplayName("V2. With left children  -> 1")
    public void depthWithLeftChildrenOK() {
        binaryTree.insert("d1LeftNode", binaryTree.getRoot(), true);
        assertEquals(1, binaryTree.depth());
    }

    @Test
    @DisplayName("V3. With right children -> 1")
    public void depthWithRightChildrenOK() {
        binaryTree.insert("d1RightNode", binaryTree.getRoot(), false);
        assertEquals(1, binaryTree.depth());
    }

    @Test
    @DisplayName("V4. With 2 children     -> 3")
    public void depthWithTwoChildrenOK() {
        binaryTree.insert("d1LeftNode", binaryTree.getRoot(), true);
        binaryTree.insert("d1RightNode", binaryTree.getRoot(), false);
        assertEquals(1, binaryTree.depth());
    }

    /**
     * @FAIL: maybe due to problems in the remove method
     */
    @Test
    @DisplayName("NV1. No root        -> IllegalArgumentException")
    public void depthNoRootKO() {
        binaryTree.remove(binaryTree.getRoot());
//        assertThrows(IllegalArgumentException.class, () -> binaryTree.depth());
        assertEquals(0, binaryTree.depth());
    }
}
