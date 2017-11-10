import java.util.ArrayList;

public class Subcapitol implements Elemente 
{

	public String titlu;
	ArrayList<Elemente> elem = new ArrayList<Elemente>();
	
	public Subcapitol(String t)
	{
		this.titlu = t;
	}

	public void addElement(Elemente e)
	{
		elem.add(e);		
	}
	public void removeElement(Elemente e) 
	{		
		elem.remove(e);
	}
	public int getElemente() 
	{
		return elem.size();
	}

	public void print() 
	{
		System.out.println(this.titlu);
		for(Elemente e : elem)
		{
			e.print();
		}
	}
}
