import java.util.ArrayList;

public class Carte
{

	private String titlu;
	private ArrayList<Autor> autori;
	private ArrayList<Elemente> continut=new ArrayList<Elemente>();
	private DocumentStatisticVisitor stats=new DocumentStatisticVisitor();
	
	public Carte(String titlu)
	{
		this.titlu=titlu;
	}
	public Carte(String titlu, ArrayList<Autor>autori)
	{
		this.titlu=titlu;
		this.autori=autori;
	}
	
	public void addElement(Elemente elem) 
	{
		this.continut.add(elem);		
	}

	public void print()
	{
		System.out.println("Titlu: "+titlu);
	    for(Elemente e : continut)
	        System.out.println(e);
	}

	
	public void acceptVisitor(Visitor v)
	{
        for(Elemente e : continut)
            e.acceptVisitor(v);
    }
}
