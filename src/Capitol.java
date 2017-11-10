import java.util.ArrayList;

public class Capitol implements Elemente
{
	
	public String titlu;
	private ArrayList<Elemente> elem = new ArrayList<Elemente>();
	
	public Capitol(String t)
	{
		this.titlu =t;
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
