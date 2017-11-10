
public class ImageProxy extends AbstractElement 
{
	private String fileName;
	private Imagine readImage=null;
	
	ImageProxy(String fileName)
	{
		this.fileName=fileName;
	}
	
	public void print()
	{
		System.out.println(fileName);
	}
}
