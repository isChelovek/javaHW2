
/**
 * jsonParser
 */
 
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class jsonParser {

    public List<Students> getStudents() 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        List <Students> peopleList = new ArrayList<>();
        try (FileReader reader = new FileReader("test.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
   
            for (Object testObject : employeeList) {
                JSONObject peopleJsonObject = (JSONObject) testObject;

                String namePeople = (String) peopleJsonObject.get("фамилия");
                String subject    = (String) peopleJsonObject.get("оценка");
                String score        = (String) peopleJsonObject.get("предмет");

                Students pers = new Students(namePeople, subject, score);
                peopleList.add(pers);
            }
            return peopleList; 
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
 
}
