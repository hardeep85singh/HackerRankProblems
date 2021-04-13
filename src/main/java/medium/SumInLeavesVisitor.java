package medium;

public class SumInLeavesVisitor extends TreeVis{
    private int sum = 0;

    public int getResult() {
        //implement this
        return sum;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        sum = sum + leaf.getValue();
    }

}
