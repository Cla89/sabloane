
public class Paragraf extends AbstractElement
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
	
}
