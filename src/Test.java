
public class Test 
{

	public static void main(String[] args) 
	{

		Capitol cap = new Capitol("UNU");
		cap.addElement(new Capitol("1"));
		cap.addElement(new Imagine("imagine"));
		
		
		
		Sectiune sec = new Sectiune("bllala");
		sec.addElement(new Paragraf("blallalaaaa"));
		
		cap.addElement(sec);
		cap.print();
	}

}
