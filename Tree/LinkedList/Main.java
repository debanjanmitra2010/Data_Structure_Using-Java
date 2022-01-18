public class Main {
    public static void main(String[] args) {
        BasicTreeNode  drinks = new BasicTreeNode("Drinks");
        BasicTreeNode hot = new BasicTreeNode("Hot");
        BasicTreeNode cold = new BasicTreeNode("Cold");
        BasicTreeNode tea = new BasicTreeNode("Tea");
        BasicTreeNode coffee = new BasicTreeNode("Coffee");
        BasicTreeNode wine = new BasicTreeNode("Wine");
        BasicTreeNode bear = new BasicTreeNode("Bear");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(bear);
        System.out.println(drinks.print(0));
    }
}
