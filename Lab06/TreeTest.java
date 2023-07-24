
public class TreeTest {

	public static void main(String[] args) throws Exception {
		BST<Integer> tree = new BST<Integer>();
		
		tree.insert(8);
		tree.insert(4);
		tree.insert(2);
		tree.insert(9);
		tree.insert(7);

		
		System.out.println("The number of nodes = "+tree.count());
		
		System.out.println("is leaf = "+tree.isLeaf(8));
		System.out.println("is leaf = "+tree.isLeaf(1));
		System.out.println("is leaf = "+tree.isLeaf(7));
		
		System.out.println("The height is : "+tree.height());

	}

}
