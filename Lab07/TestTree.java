//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
public class TestTree {
	public static void main(String[] args) {
		
		//Creating 3 different trees
		
		//Tree
		BST<String> tree = new BST<String>();
		tree.insert("D");
		tree.insert("B");
		tree.insert("A");
		tree.insert("C");
		tree.insert("F");
		tree.insert("H");
		
		//Tree2
		BST<String> tree2 = new BST<String>();
		tree2.insert("D");
		tree2.insert("B");
		tree2.insert("A");
		tree2.insert("C");
		tree2.insert("F");
		tree2.insert("H");
		tree2.insert("E");
		
		//Tree3
		BST<String> tree3 = new BST<String>();
		tree3.insert("R");
		tree3.insert("O");
		tree3.insert("J");
		tree3.insert("K");
		tree3.insert("P");
		tree3.insert("U");
		tree3.insert("S");
		tree3.insert("X");
		tree3.insert("T");
		tree3.insert("H");
		tree3.insert("I");
		//-*-
		
		//Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//Style + label
		System.out.println("		  *- Get Path Method -*");
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//getPath method testing
		System.out.println("{ Tree }");
		System.out.println("Path for V: " + tree.getPath("V"));
		System.out.println("Path for H: " + tree.getPath("H"));
		System.out.println("Path for A: " + tree.getPath("A"));
		System.out.println("Path for C: " + tree.getPath("C"));
		System.out.println("Path for B: " + tree.getPath("B"));
		System.out.println("Path for D: " + tree.getPath("D"));
		System.out.println("\n------> Another tree test\n");
		System.out.println("{ Tree3 }");
		System.out.println("Path for I: " + tree3.getPath("I"));
		//-*-
		
		//Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//Style + label
		System.out.println("	    *- Get Right Leaf Count Method -*");

		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//getRightLeafCount method testing
		System.out.println("Tree >> " + tree.getRightLeafCount());
		System.out.println("Tree2 >> " + tree2.getRightLeafCount());
		System.out.println("Tree3 >> " + tree3.getRightLeafCount());
		//-*-
		
		//Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//Style + label
		System.out.println("	    	*- Range Counter Method -*");

		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//rangeCounter method testing
		System.out.println("{ Tree } The elements less than 'D' & greater than 'A': " + tree.rangeCounter("A", "D"));
		System.out.println("{ Tree } The elements less than 'H' & greater than 'A': " + tree.rangeCounter("A", "H"));
		System.out.println("{ Tree } The elements less than 'A' & greater than 'H': " + tree.rangeCounter("H", "A"));
		System.out.println("\n------> Another tree test\n");
		System.out.println("{ Tree2 } The elements less than 'D' & greater than 'A': " + tree2.rangeCounter("A", "D"));
		System.out.println("{ Tree2 } The elements less than 'H' & greater than 'A': " + tree2.rangeCounter("A", "H"));
		//-*-
		
		//Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		// Style, Printing the Tree
		System.out.println("Tree Shape:\n");

		System.out.println("         (D)");
		System.out.println("          |");
		System.out.println("     -----------");
		System.out.println("     |         |");
		System.out.println("    (B)       (F)");
		System.out.println("     |         |");
		System.out.println("  -------      ----");
		System.out.println("  |     |          |");
		System.out.println(" (A)   (C)        (H)");
		// -*-
		
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();

		// Style, Printing the Tree2
		System.out.println("Tree2 Shape:\n");

		System.out.println("         (D)");
		System.out.println("          |");
		System.out.println("     -----------");
		System.out.println("     |         |");
		System.out.println("    (B)       (F)");
		System.out.println("     |         |");
		System.out.println("  -------   -------");
		System.out.println("  |     |   |     |");
		System.out.println(" (A)   (C) (E)   (H)");
		// -*-
		
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();

		// Style, Printing the Tree3
		System.out.println("Tree3 Shape:\n");

		System.out.println("                     (R)");
		System.out.println("                      |");
		System.out.println("           -----------------------");
		System.out.println("           |                     |");
		System.out.println("          (O)                   (U)");
		System.out.println("           |                     |");
		System.out.println("        -------               -------");
		System.out.println("        |     |               |     |");
		System.out.println("       (J)   (P)             (S)   (X)");
		System.out.println("        |                     |");
		System.out.println("     -------                  ----");
		System.out.println("     |     |                     |");
		System.out.println("    (H)   (K)                   (T)");
		System.out.println("     |");
		System.out.println("     ----");
		System.out.println("        |");
		System.out.println("       (I)");
		// -*-

	}

}
