import java.util.ArrayList;

public class Sectiune extends SubjectElement 
{
	private String titlu;	
	private ArrayList<Elemente> elem = new ArrayList<Elemente>();
	
	public Sectiune(String t)
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
	
	public Elemente getElemente(int index) 
	{
		return elem.get(index);
	}
	
	public ArrayList<Elemente> getElemente()
	{
        return elem;
    }

	public void print() 
	{
		System.out.println(this.titlu);
		for(Elemente e : elem)
		{
			e.print();
		}
	}
	
	
	public void acceptVisitor(Visitor v)
	{
		v.visitSectiune(this);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
	
}
