package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * V1. Only alpha         | No children   | true  -> BinaryTree
 * V2. Only alpha         | With Children | false -> BinaryTree
 * V2. Only numeric      -> BinaryTree
 * V3. Alphanumeric      -> BinaryTree
 * NV1. Only alpha        | Node = null   | true  -> IllegalArgumentException
 * NV2. Not String       -> IllegalArgumentException
 * NV3. Content = null   -> IllegalArgumentException
 *
 *  * V1. No children             -> 0
 *  * V2. With children from root -> 1
 *  * V3. With children from node -> 0
 *  * NV1. Node = null
 */
public class InsertTest {
    private BinaryTree binaryTree;
    @BeforeEach
    public void setUp() {
        binaryTree = new BinaryTree<>("InsertTestTree1");
    }
    @Test
    @DisplayName("V1. Only alpha         | No children   | true  -> BinaryTree")
    public void insertOnlyAlphaNoChildrenTrue() {

    }
}
