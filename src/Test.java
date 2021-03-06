
public class Test 
{

	public static void main(String[] args) 
	{

		Carte Book = new Carte("Carte 1");

        
        Sectiune section = new Sectiune("Section 1");
        section.addElement(new Paragraf("Paragraph 1. Some text"));
        section.addElement(new Tabel("Tabel 1"));
        section.addElement(new Paragraf("Paragraph 2. Some text"));
        Paragraf paragraf = new Paragraf("Paragraph 3. Some text");
        Imagine image = new Imagine("Image 1");
        Imagine image2 = new Imagine("Image 2");
        ImageProxy imageProxy = new ImageProxy("ImageProxy 1");
        
        Book.addElement(section);
        Book.addElement(paragraf);
        Book.addElement(image);
        Book.addElement(image2);
        Book.addElement(imageProxy);
        

        DocumentStatisticVisitor d = new DocumentStatisticVisitor();
        Book.acceptVisitor(d);
        d.printStatistics();
        Book.print();
        
        BookBuilder builder=new BookBuilder("carte.json");
        builder.build();
        
        
        
        Observer o = new SimpleObserver();
        Paragraf p1 = new Paragraf("Paragraf");
        Paragraf p2 = new Paragraf("Paragraf2");
        Imagine imga = new Imagine("Image2");
        Sectiune s = new Sectiune("Titlu");
        p1.attach(o);
        p2.attach(o);
        imga.attach(o);
        s.attach(o);
        s.Add(p1);
        s.Add(p2);
        s.Add(imga);
	}

}
