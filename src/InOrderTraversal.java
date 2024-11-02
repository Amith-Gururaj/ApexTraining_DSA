public class InOrderTraversal {

    public static void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);
    }
}
