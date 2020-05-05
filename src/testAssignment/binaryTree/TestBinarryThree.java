package testAssignment.binaryTree;

/**
 * Задание 1. Двоичное дерево
 */
public class TestBinarryThree {

    public static void main(String[] args) {
        BinaryThree binaryThree = new BinaryThree();
        binaryThree.add(2);
        binaryThree.add(10);
        binaryThree.add(7);
        binaryThree.add(6);
        binaryThree.add(4);
        binaryThree.add(3);

        System.out.println(binaryThree.dfs());

    }
}
