
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        jsonParser parser = new jsonParser();
        List <Students> peopleList = parser.getStudents();

        for (Students testObject : peopleList) {
            System.out.println(testObject.toString());
        }
    }
}
