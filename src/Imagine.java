
public class Imagine extends AbstractElement 
{
	public String imagePath;
	private Imagine imageData;

	public Imagine(String img)
	{
		this.imagePath = img;
	}
		
	public void addElement(Elemente e) 
	{	
		
	}	
	
	public void removeElement(Elemente e) 
	{
		
	}

	public int getElemente() 
	{
		return 0;
	}

	public void print() 
	{	
		System.out.println(imagePath);
	}

}
