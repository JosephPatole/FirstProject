package linkedinJavaOOP;
import java.awt.Color;

public class Tree 
{
	private double hieghtFt;
	private double trunkDiameterInches;
	private TreeType treeType;
	
	protected static Color TRUNK_COLOR = new Color(255, 0, 255);
	
	public Tree(double hieghtFt, double trunkDiameterInches, TreeType treetype)
	{
		this.hieghtFt = hieghtFt;
		this.trunkDiameterInches = trunkDiameterInches;
		this.treeType = treetype;
	}
	
	public double getHieghtFt()
	{
		return hieghtFt;
	}
	
	public double getTrunkDiameterInches()
	{
		return trunkDiameterInches;
	}
	
	public TreeType getTreeType()
	{
		return treeType;
	}
	
	public void setHieghtFt(double hieghtFt)
	{
		this.hieghtFt = hieghtFt;
	}
	
	public void setTrunkDiameterInches(double trunkDiameterInches)
	{
		this.trunkDiameterInches = trunkDiameterInches;
	}
	
	public void grow()
	{
		this.hieghtFt = this.hieghtFt + 10;
		this.trunkDiameterInches = this.trunkDiameterInches + 1;
	}
	
	public static void accounceTree()
	{
		System.out.println("Look at this "+TRUNK_COLOR +" tree");
	}
	
	public void accounceTallTree()
	{
		if (this.hieghtFt > 100)
		{
			System.out.println(this.treeType);
		}
	}
}
