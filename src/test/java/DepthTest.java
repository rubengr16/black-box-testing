
import com.binarytree.BinaryTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
public class DepthTest {
    private BinaryTree binaryTree;
    @BeforeEach
    public void setUp() {
        binaryTree = new BinaryTree<>("DepthTestTree1");
    }
    @Test
    public void depthNoDescendantsOK() {
        assertEquals(0, binaryTree.depth());
    }
    @Test
    public void depthWithDescendantsOK() {
        binaryTree.insert("Node1", binaryTree.getRoot(), true);
        assertEquals(1, binaryTree.depth());
    }
    @Test
    public void depthNoRootOK() {
        binaryTree.remove(binaryTree.getRoot());
        assertEquals(0, binaryTree.depth());
    }
}
