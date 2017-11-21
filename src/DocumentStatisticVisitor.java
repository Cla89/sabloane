
public class DocumentStatisticVisitor implements Visitor
{
	private int numarTabele=0;
	private int numarParagrafe=0;
	private int numarImagini=0;
	private int numarSectiuni=0;
	
	
	public void printStatistics()
	{
		System.out.println("Exista:");

	    System.out.println(numarSectiuni + " sectiuni");

	    System.out.println(numarImagini + " imagini");

	    System.out.println(numarParagrafe + " paragrafe");

	    System.out.println(numarTabele + " tabele");
	}

	public void visitImagine(Imagine img) 
	{
		numarImagini++;	
	}

	public void visitImageProxy(ImageProxy imgr) 
	{
		numarImagini++;	
	}

	public void visitSectiune(Sectiune s) 
	{
		numarSectiuni++;
		for(Elemente e : s.getElemente())
            e.acceptVisitor(this);
	}

	public void visitTabel(Tabel t) 
	{
		numarTabele++;		
	}

	public void visitParagraf(Paragraf p) 
	{
		numarParagrafe++;		
	}
}
