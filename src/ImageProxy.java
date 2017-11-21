
public class ImageProxy extends AbstractElement 
{
	private String fileName;
	private Imagine readImage = null;
	
	ImageProxy(String fileName)
	{
		this.fileName = fileName;
	}
	
	public void print()
	{
		Imagine readImage= new Imagine(fileName);
		System.out.println(readImage);
	}
	
	public void acceptVisitor(Visitor v)
	{
        v.visitImageProxy(this);
    }
}
