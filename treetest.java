1) 
import java.util.*;

public class Main {

    // Tree node class
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        // Reading input until -1
        while (sc.hasNextInt()) {
            int val = sc.nextInt();
            if (val == -1) break;
            input.add(val);
        }

        // Build binary tree in level order
        TreeNode root = buildTree(input);

        // Lists to store traversal results
        List<Integer> inorderResult = new ArrayList<>();
        List<Integer> preorderResult = new ArrayList<>();
        List<Integer> postorderResult = new ArrayList<>();

        // Perform traversals
        inorder(root, inorderResult);
        preorder(root, preorderResult);
        postorder(root, postorderResult);

        // Output the results
        System.out.println(joinList(inorderResult));
        System.out.println(joinList(preorderResult));
        System.out.println(joinList(postorderResult));
    }

    // Build binary tree from list in level order
    public static TreeNode buildTree(List<Integer> values) {
        if (values.isEmpty()) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values.get(0));
        queue.offer(root);
        int i = 1;

        while (i < values.size()) {
            TreeNode current = queue.poll();

            if (i < values.size()) {
                current.left = new TreeNode(values.get(i++));
                queue.offer(current.left);
            }

            if (i < values.size()) {
                current.right = new TreeNode(values.get(i++));
                queue.offer(current.right);
            }
        }

        return root;
    }

    // Inorder Traversal (Left, Root, Right)
    public static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    // Preorder Traversal (Root, Left, Right)
    public static void preorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    // Postorder Traversal (Left, Right, Root)
    public static void postorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }

    // Helper to convert list to space-separated string
    public static String joinList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}
2) 
import java.util.*;

public class Main {

    // Tree node class
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        // Read input until -1
        while (sc.hasNextInt()) {
            int val = sc.nextInt();
            if (val == -1) break;
            input.add(val);
        }

        // Build tree in level order
        TreeNode root = buildTree(input);

        // Compute height
        int height = getHeight(root);

        // Output the height
        System.out.println(height+1);
    }

    // Build binary tree in level order
    public static TreeNode buildTree(List<Integer> values) {
        if (values.isEmpty()) return null;

        TreeNode root = new TreeNode(values.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.size()) {
            TreeNode current = queue.poll();

            if (i < values.size()) {
                current.left = new TreeNode(values.get(i++));
                queue.offer(current.left);
            }
            if (i < values.size()) {
                current.right = new TreeNode(values.get(i++));
                queue.offer(current.right);
            }
        }

        return root;
    }

    // Function to calculate height (number of edges)
    public static int getHeight(TreeNode root) {
        if (root == null) return -1; // base case: height of empty tree is -1
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
3) 
import java.util.*;

public class Main {

    // Tree node class
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        // Read input values until -1
        while (sc.hasNextInt()) {
            int val = sc.nextInt();
            if (val == -1) break;
            input.add(val);
        }

        // Build tree
        TreeNode root = buildTree(input);

        // Count nodes
        int count = countNodes(root);

        // Output the result
        System.out.println(count);
    }

    // Build binary tree using level order
    public static TreeNode buildTree(List<Integer> values) {
        if (values.isEmpty()) return null;

        TreeNode root = new TreeNode(values.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.size()) {
            TreeNode current = queue.poll();

            if (i < values.size()) {
                TreeNode left = new TreeNode(values.get(i++));
                current.left = left;
                queue.offer(left);
            }

            if (i < values.size()) {
                TreeNode right = new TreeNode(values.get(i++));
                current.right = right;
                queue.offer(right);
            }
        }

        return root;
    }

    // Recursive method to count nodes
    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
4) 
import java.util.*;

public class Main {

    // Tree node definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        // Read input until end
        while (sc.hasNextInt()) {
            input.add(sc.nextInt());
        }

        // Build the tree (with -1 as nulls)
        TreeNode root = buildTreeWithNulls(input);

        // Count the leaf nodes
        int leafCount = countLeafNodes(root);

        // Print result
        System.out.println(leafCount);
    }

    // Build binary tree from level-order list with -1 as nulls
    public static TreeNode buildTreeWithNulls(List<Integer> values) {
        if (values.isEmpty() || values.get(0) == -1) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values.get(0));
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.size()) {
            TreeNode current = queue.poll();

            // Left child
            if (i < values.size()) {
                int leftVal = values.get(i++);
                if (leftVal != -1) {
                    current.left = new TreeNode(leftVal);
                    queue.offer(current.left);
                }
            }

            // Right child
            if (i < values.size()) {
                int rightVal = values.get(i++);
                if (rightVal != -1) {
                    current.right = new TreeNode(rightVal);
                    queue.offer(current.right);
                }
            }
        }

        return root;
    }

    // Recursively count leaf nodes
    public static int countLeafNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
}
5) 
import java.util.*;

public class Main {

    static class TreeNode {
        String val;
        TreeNode left, right;

        TreeNode(String val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, TreeNode> nodes = new HashMap<>();
        Set<String> children = new HashSet<>();
        String[][] entries = new String[n][3];

        // First, read and store all input
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            entries[i] = parts;
            nodes.putIfAbsent(parts[0], new TreeNode(parts[0]));

            if (!parts[1].equals("null")) {
                children.add(parts[1]);
                nodes.putIfAbsent(parts[1], new TreeNode(parts[1]));
            }
            if (!parts[2].equals("null")) {
                children.add(parts[2]);
                nodes.putIfAbsent(parts[2], new TreeNode(parts[2]));
            }
        }

        // Find root (the one not in children)
        String rootVal = null;
        for (String[] entry : entries) {
            if (!children.contains(entry[0])) {
                rootVal = entry[0];
                break;
            }
        }

        TreeNode root = nodes.get(rootVal);

        // Link children
        for (String[] entry : entries) {
            TreeNode parent = nodes.get(entry[0]);
            parent.left = entry[1].equals("null") ? null : nodes.get(entry[1]);
            parent.right = entry[2].equals("null") ? null : nodes.get(entry[2]);
        }

        // Collect and print leaf nodes
        List<String> leaves = new ArrayList<>();
        collectLeaves(root, leaves);
        System.out.println(String.join(" ", leaves));
    }

    public static void collectLeaves(TreeNode node, List<String> leaves) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }
}
