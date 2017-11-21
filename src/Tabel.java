
public class Tabel extends AbstractElement
{
	private String numeTabel;
	

	public Tabel(String numT)
	{
		this.numeTabel = numT;
	}
		
	public void print() 
	{
		System.out.println("Nume tabel: " + numeTabel);
	}
	
	public void acceptVisitor(Visitor v)
	{
    	v.visitTabel(this);
    }
	
	public String toString()
    {
        return numeTabel;
    }
}
