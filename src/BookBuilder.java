import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BookBuilder implements Builder{

    private Carte bookJson;
    private String filePath;

    BookBuilder(String filePath){
        this.filePath = filePath;
    }

    public void build() {
        JSONParser parser = new JSONParser();

        try {
        	
            Object obj = parser.parse(new FileReader(
                    "/Users/TraXmini/Desktop/text.txt"));

            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("Name");
            String author = (String) jsonObject.get("Author");

            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Elemente getResult() 
    {
        return null;
    }
}