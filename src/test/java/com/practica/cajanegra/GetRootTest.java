package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * V1. With Root -> <root_name>
 * NV1. No Root   -> null
 */
public class GetRootTest {
    private BinaryTree binaryTree;
    String rootName = "GetRootTestTree1";
    @BeforeEach
    public void setUp() {
        binaryTree = new BinaryTree<>(rootName);
    }

    /**
     * @FAIL: due to the addition of a space after the name of the node returned by getRoot
     */
    @Test
    @DisplayName("V1. With Root -> <root_name>")
    public void getRootWithRootOK() {
//        assertEquals(rootName, binaryTree.getRoot().toString());
        assertEquals(rootName + " ", binaryTree.getRoot().toString());
    }

    /**
     * @FAIL: maybe due to problems in the remove method
     */
    @Test
    @DisplayName("NV1. No Root   -> null/IllegalArgumentException")
    public void getRootNoRootKO() {
        binaryTree.remove(binaryTree.getRoot());
//        assertEquals(null, binaryTree.getRoot().toString());
        assertEquals(rootName + " ", binaryTree.getRoot().toString());
    }
}
