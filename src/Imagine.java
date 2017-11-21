
public class Imagine extends AbstractElement 
{
	private String imagePath;

	public Imagine(String img)
	{
		this.imagePath = img;
	}

	public void print() 
	{	
		System.out.println(imagePath);
	}
	
	public void acceptVisitor(Visitor v)
	{
        v.visitImagine(this);
    }

}
