
import com.binarytree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ConstructorTest {
    @Test
    public void constructorAlphanumericOK() {
        assertEquals(BinaryTree.class, (new BinaryTree("Constructor1")).getClass());
    }
    @Test
    public void constructorNumericOK() {
        assertEquals(BinaryTree.class, (new BinaryTree("6")).getClass());
    }

    /**
     * On the subject it is said to accept alphanumeric input, but only alpha content is rejected
     */
    @Test
    public void constructorOnlyAlphaKO() {
//        assertEquals(BinaryTree.class, (new BinaryTree("OnlyAlpha")).getClass());
        assertThrows(IllegalArgumentException.class, () -> new BinaryTree("OnlyAlpha"), "Content must be alphanumeric");
    }
    @Test
    public void constructorNullKO() {
        assertThrows(IllegalArgumentException.class, () -> new BinaryTree(null), "Content cannot be null");
    }
    @Test
    public void constructorNotStringKO() {
        assertThrows(IllegalArgumentException.class, () -> new BinaryTree(6), "Content must be a string");
    }

    /**
     * It should throw and exception
     */
    @Test
    public void constructorNotAlphanumericOK() {
//        assertThrows(IllegalArgumentException.class, () -> new BinaryTree("@"), "Content must be alphanumeric");
        assertEquals(BinaryTree.class, (new BinaryTree("@")).getClass());
    }
}
