package BBt;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.reflect.TypeToken;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Read {
  public void getdata(){
        List<Person> listPerson;
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("data.json")){

            listPerson = new Gson().fromJson(reader, new TypeToken<List<Person>>() {}.getType());
            for (Person person : listPerson) {
                System.out.println(person);
            }

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}
public static void getPersonCountry() throws FileNotFoundException {
    Map<String,Integer> countPerson = new HashMap<String,Integer>();
    List<Person> listPerson;
    FileReader reader = new FileReader("data.json");

        listPerson = new Gson().fromJson(reader, new TypeToken<List<Person>>() {}.getType());
        for (Person person : listPerson) {
            countPerson.put(person.getCountry(),0);
        }
        for (Person person : listPerson) {
           int count=countPerson.get(person.getCountry());
           if (count==0) {
            countPerson.put(person.getCountry(),1);
           }else {
            countPerson.put(person.getCountry(),(count+1));
              
           }
        }
        for (Map.Entry<String, Integer> entry : countPerson.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
    
}}
/*public void getData(){
    //ArrayList<Customer> listCustomer = new ArrayList<>();
    JSONParser parser = new JSONParser();


    try(FileReader reader = new FileReader("data.json")){

        //Read JSON file
        Object obj = parser.parse(reader);

        JSONArray personList = (JSONArray) obj;
        //System.out.println(customerList);

        //Iterate over employee array
        personList.forEach( per -> parsePersonObject( (JSONObject) per ) );
         
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }
}
private static void parsePersonObject(JSONObject jsonObject){
    Long id=(long)jsonObject.get("id");
    String firstName = (String) jsonObject.get("firstName");

    String lastName= (String) jsonObject.get("lastName");

    String gender = (String) jsonObject.get("gender");

    String country = (String) jsonObject.get("country");

    String dateOfBirth = (String) jsonObject.get("dateOfBirth");
}*/
}
