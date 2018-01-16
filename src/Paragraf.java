
public class Paragraf extends SubjectElement
{
	private String text;
	private AlignStrategy strategy = null;
	
	public Paragraf(String text)
	{
		this.text=text;
	}
	
	public void setAlign(AlignStrategy strategy)
	{
	    this.strategy = strategy;
	}
	
	public void print() 
	{
		
		if(strategy != null)
			strategy.printAligned(text);
	    else 
	        System.out.println(text);
	}
	
	
	public void accept(Visitor v)
	{
		v.visitParagraf(this);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	public void addElement(Elemente e) {
		// TODO Auto-generated method stub
		
	}

	public void removeElement(Elemente e) {
		// TODO Auto-generated method stub
		
	}

	public Elemente getElemente(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
