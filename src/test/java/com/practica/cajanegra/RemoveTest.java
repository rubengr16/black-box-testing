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
public class RemoveTest {
    private BinaryTree binaryTree;
    private Node nodeWithNoChildren;
    private Node        nodeWithLeftChildren;
    private Node        nodeWithRightChildren;
    private Node        nodeWithTwoChildren;

    @BeforeEach
    public void setUp() {
        Node    aux;
        binaryTree = new BinaryTree<>("RemoveTestTree1");
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
    public void removeNoChildrenOK() {
        binaryTree.remove(nodeWithNoChildren);
        assertEquals(null, binaryTree.search(nodeWithNoChildren.getContent()));
    }
    @Test
    @DisplayName("V2. With left children  -> 1")
    public void removeLeftChildrenOK() {
        assertEquals(nodeWithNoChildren, binaryTree.search(nodeWithNoChildren.getContent()));
//        binaryTree.remove(nodeWithLeftChildren);
//        assertEquals(null, binaryTree.search(nodeWithLeftChildren.getContent()));
    }
    @Test
    @DisplayName("V3. With right children -> 1")
    public void removeRightChildrenOK() {
        binaryTree.remove(nodeWithRightChildren);
        assertEquals(null, binaryTree.search(nodeWithRightChildren.getContent()));
    }
    @Test
    @DisplayName("V4. With 2 children     -> 3")
    public void removeTwoChildrenOK() {
        binaryTree.remove(nodeWithTwoChildren);
        assertEquals(null, binaryTree.search(nodeWithTwoChildren.getContent()));
    }
    @Test
    @DisplayName("NV1. Node = null        -> IllegalArgumentException")
    public void removeNullKO() {
        assertThrows(IllegalArgumentException.class, () -> binaryTree.remove(null));
    }
}
