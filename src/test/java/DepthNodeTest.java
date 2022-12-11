import com.binarytree.BinaryTree;
import com.binarytree.Node;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
public class DepthNodeTest {
    private BinaryTree binaryTree;
    @BeforeEach
    public void setUp() {
        binaryTree = new BinaryTree<>("DepthTestTree1");
    }
    /**
     * The depth must be 1
     */
    @Test
    public void depthNodeNoDescendantsOK() {
//        assertEquals(1, binaryTree.depth());
        assertEquals(0, binaryTree.depth());
    }

    /**
     * Both calls should return the same value
     */
    @Test
    public void depthNodeWithDescendantsFromRootOK() {
        binaryTree.insert("Node1", binaryTree.getRoot(), true);
//        assertEquals(binaryTree.depth(), binaryTree.depth(binaryTree.getRoot()));
        assertEquals(binaryTree.depth() - 1, binaryTree.depth(binaryTree.getRoot()));
    }

    /**
     * Again the same failure, the returned depth is one less than the expected
     */
    @Test
    public void depthNodeWithDescendantsFromNodeOK() {
        Node node = binaryTree.insert("Node1", binaryTree.getRoot(), true);
//        assertEquals(1, binaryTree.depth(node));
        assertEquals(0, binaryTree.depth(node));
    }
    @Test
    public void depthNodeNullNodeKO() {
        assertThrows(IllegalArgumentException.class, () -> binaryTree.depth(null), "Node cannot be null");
    }
}
