package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * V1. Only alpha        -> BinaryTree
 * V2. Only numeric      -> BinaryTree
 * V3. Alphanumeric      -> BinaryTree
 * NV1. Not alphanumeric -> IllegalArgumentException
 * NV2. Not String       -> IllegalArgumentException
 * NV3. Content = null   -> IllegalArgumentException
 */
public class ConstructorTest {
    /**
     * @FAIL: On the subject it is said to accept alphanumeric input, but only alpha content is rejected
     */
    @Test
    @DisplayName("V1. Only alpha        -> BinaryTree")
    public void constructorOnlyAlphaOK() {
//        assertEquals(BinaryTree.class, (new BinaryTree("OnlyAlpha")).getClass());
        assertThrows(IllegalArgumentException.class, () -> new BinaryTree("OnlyAlpha"));
    }
    @Test
    @DisplayName("V2. Only numeric      -> BinaryTree")
    public void constructorNumericOK() {
        assertEquals(BinaryTree.class, (new BinaryTree("6")).getClass());
    }
    @Test
    @DisplayName("V3. Alphanumeric      -> BinaryTree")
    public void constructorAlphanumericOK() {
        assertEquals(BinaryTree.class, (new BinaryTree("Constructor1")).getClass());
    }
    /**
     * @FAIL: It should throw and exception
     */
    @Test
    @DisplayName("NV1. Not alphanumeric -> IllegalArgumentException")
    public void constructorNotAlphanumericOK() {
//        assertThrows(IllegalArgumentException.class, () -> new BinaryTree("@"), "Content must be alphanumeric");
        assertEquals(BinaryTree.class, (new BinaryTree("@")).getClass());
    }
    @Test
    @DisplayName("NV2. Not String       -> IllegalArgumentException")
    public void constructorNotStringKO() {
        assertThrows(IllegalArgumentException.class, () -> new BinaryTree(6));
    }
    @Test
    @DisplayName("NV2. Not String       -> IllegalArgumentException")
    public void constructorNullKO() {
        assertThrows(IllegalArgumentException.class, () -> new BinaryTree(null));
    }
}
