package questionManaagmentSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static questionManaagmentSystem.questionManagmentSystem.*;

public class lists {
    static Map<Integer,String> mapOfUserAnswers=new HashMap<>();
    static Map<Integer,String> mapOfCorrectAnswers=new HashMap<>();
    static List<String> listOfQuestion=new ArrayList<>();

    public static Map<Integer, String> getMapOfUserAnswers() {
        return mapOfUserAnswers;
    }

    public static Map<Integer, String> getMapOfCorrectAnswers() {
        return mapOfCorrectAnswers;
    }

    public static List<String> getListOfQuestion() {
        return listOfQuestion;
    }

}
