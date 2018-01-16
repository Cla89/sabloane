
public class Imagine extends SubjectElement 
{
	private String imagePath;

	public Imagine(String img)
	{
		this.imagePath = img;
	}

	public void print() 
	{	
		System.out.println(imagePath);
	}
	
	public void acceptVisitor(Visitor v)
	{
        v.visitImagine(this);
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
