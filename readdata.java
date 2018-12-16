
// Read jSon File //

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class readdata {
    
    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        
        try{
            Object obj = parser.parse(new FileReader("customerData.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("NAME: " + jsonObject.get("NAME"));
            System.out.println("EMAIL: " + jsonObject.get("EMAIL"));
            System.out.println("ADDRESS: " + jsonObject.get("ADDRESS"));
            
        }
        catch(FileNotFoundException e){ e.printStackTrace();}
        catch(Exception e){ e.printStackTrace();}
    }
    
}
