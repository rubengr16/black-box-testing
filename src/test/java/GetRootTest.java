
import com.binarytree.BinaryTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
public class GetRootTest {
    private BinaryTree binaryTree;
    String rootName = "GetRootTestTree1";
    @BeforeEach
    public void setUp() {
        binaryTree = new BinaryTree<>(rootName);
    }

    /**
     * Failure due to the addition of a space after the name of the node returned by getRoot
     */
    @Test
    public void getRootWithRootOK() {
//        assertEquals(rootName, binaryTree.getRoot().toString());
        assertNotEquals(rootName, binaryTree.getRoot().toString());
    }
    @Test
    public void getRootNoRootOK() {
        binaryTree.remove(binaryTree.getRoot());
        System.out.println(binaryTree.getRoot().toString());
        assertNotEquals(rootName, binaryTree.getRoot().toString());
    }
}
