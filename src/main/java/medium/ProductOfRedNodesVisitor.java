package medium;

public class ProductOfRedNodesVisitor extends TreeVis{
    private int result = 1;
//    private final int M = 1000000007;

    public int getResult() {
        //implement this
        return result;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getColor().equals(Color.RED)){
            result = (result * node.getValue());
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor().equals(Color.RED)){
            result = (result * leaf.getValue());
        }
    }
}
