package questionManaagmentSystem;

import static questionManaagmentSystem.lists.*;
import static questionManaagmentSystem.questionManagmentSystem.*;

public class printMethods {


    //print methods
    public static void printListOfQuestions(){
        for (String q:listOfQuestion){
        System.out.println(q);}
    }

    public static void printFirstMessage(){
        System.out.println("         *******************************************************************");
        System.out.println( " there are 4 question to answer them by order from 1-4 automatically press 1 and enter\n" +
                "to answer them individual by your choose enter  2 remember option 2 is still incomplete  ");
    }
    public static void printCorrectAnswerMessage(){
        System.out.println( " good job your answer is correct");
    }
    public static void printIncorrectAnswerMessage(){
        System.out.println( " your answer is not correct lets go with next question");
    }
    public static void printLastIncorrectAnswerMessage(){
        System.out.println( " your answer is not correct");
    }
    public static void printWrongEntry(){
        System.out.println( " your entry is wrong you should enter a||b||c||d lets try again");

    }
    public static void printListOfCorrectAnswers(){
        System.out.println( "for questions "+mapOfUserAnswers.keySet()+" you answered"+mapOfUserAnswers.values());
        System.out.println("but correct answers are ");
        for (int q :mapOfUserAnswers.keySet()){
            System.out.println(mapOfCorrectAnswers.get(q));}

    }

}
