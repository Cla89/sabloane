
public class Paragraf implements Elemente
{
	public String text;
	public Paragraf()
	{
		 this.text = "none";
	}

	public Paragraf(String txt)
	{
		this.text = txt;
	}


	public void print() 
	{	
		System.out.println(text);
	}

	public void addElement(Elemente e) 
	{
			// TODO Auto-generated method stub
			
	}

	public void removeElement(Elemente e) 
	{
			// TODO Auto-generated method stub
			
	}

	public int getElemente() 
	{
			// TODO Auto-generated method stub
			return 0;
	}
	
	
	public void accept(Visitor v)
	{
		v.visitParagraf(this);
	}
	
}
