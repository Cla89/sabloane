public interface Elemente 
{
	
	public void addElement(Elemente e);
	public void removeElement(Elemente e);
	public Elemente getElemente(int index);
	public void print();
	public void acceptVisitor(Visitor v);
	
}
