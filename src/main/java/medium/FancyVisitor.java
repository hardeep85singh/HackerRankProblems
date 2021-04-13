package medium;

public class FancyVisitor extends TreeVis{
    private int evenDepthNonLeavesSum = 0;
    private int greenLeavesSum = 0;

    public int getResult() {
        //implement this
        return Math.abs(evenDepthNonLeavesSum - greenLeavesSum);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getDepth() % 2 == 0){
            evenDepthNonLeavesSum = evenDepthNonLeavesSum + node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor().equals(Color.GREEN)){
            greenLeavesSum = greenLeavesSum + leaf.getValue();
        }
    }
}
