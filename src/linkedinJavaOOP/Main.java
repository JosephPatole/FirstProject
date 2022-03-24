package linkedinJavaOOP;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Tree myFavOAKTree = new Tree(120, 12, TreeType.Mango);
		
		Tree myFavMappleTree = new Tree(90, 30, TreeType.Maple);
		
		myFavOAKTree.accounceTallTree();
		myFavMappleTree.accounceTallTree();
		System.out.println(myFavOAKTree.getHieghtFt());
		
		System.out.println(Tree.TRUNK_COLOR);
		Tree.accounceTree();
		myFavOAKTree.grow();
		
	}

}
