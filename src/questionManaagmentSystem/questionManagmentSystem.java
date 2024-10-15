package questionManaagmentSystem;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import static questionManaagmentSystem.printMethods.*;
import static questionManaagmentSystem.lists.*;

public class questionManagmentSystem {
    public static void switchA(){
        Scanner scanner=new Scanner(System.in);

        String multipleChoices;
        int correctAnswers=0;
        int inCorrectAnswers=0;

        getListOfQuestion().add("Q1 : what is mohammad's favorite food? \n" +
                "a) beans   b)rice   c) kebab   d) Bolani \n" +
                "as teacher required correct answer is >>>  c  ");
        getListOfQuestion().add("Q2 : what is mohammad's favorite seasening with food ? \n" +
                "a) pomegranate jam   b)ketchup   c) ranch   d) non of them\n" +
                "as teacher required correct answer is >>>  a  ");
        getListOfQuestion().add("Q3 : how much do you like java ? \n" +
                "a) a little  b) a lot   c) not too much   d) I don't like it\n" +
                "as teacher required correct answer is >>>  d ");
        getListOfQuestion().add("Q4 : how much do you remember mysql ? \n" +
                "a) a little  b) a lot   c) not too much   d) I don't remember it at all\n" +
                "as teacher required correct answer is >>> d ");
        getMapOfCorrectAnswers().put(1,"c");
        getMapOfCorrectAnswers().put(2,"a");
        getMapOfCorrectAnswers().put(3,"d");
        getMapOfCorrectAnswers().put(4,"d");

        printListOfQuestions();
        printFirstMessage();
        int userInput=scanner.nextInt();

        if (userInput==1){
            for (int i=0;i<listOfQuestion.toArray().length;i++){
            do {System.out.println(listOfQuestion.get(i));
            multipleChoices=scanner.next();
            if (mapOfCorrectAnswers.get(i+1).equals(multipleChoices)){
                printCorrectAnswerMessage();
                correctAnswers++;
            } else if (multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c") || multipleChoices.equals("d"))
            {
                inCorrectAnswers++;
                if (i==listOfQuestion.toArray().length-1)printLastIncorrectAnswerMessage();else {
               printIncorrectAnswerMessage();}
                mapOfUserAnswers.put(i+1,multipleChoices);
            }else printWrongEntry();
        }while (!(multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c" +
                    "") || multipleChoices.equals("d")));}

            int totalAnswers=correctAnswers+inCorrectAnswers;
            double score=(double)((correctAnswers*100)/totalAnswers);
            System.out.println("you entered "+correctAnswers+" correct answers and "+inCorrectAnswers+" " +
                    "incorrect answers of total "+totalAnswers +" answers your score is "+score+" of 100.0 "  );

            if (correctAnswers>=inCorrectAnswers) {System.out.println("congratulation you passed exam ");}
            else{System.out.println("unfortunately you did not pass the exam you can try it again ");}
            printListOfCorrectAnswers();

        } else if (userInput==2) {
            System.out.println("incomplite code \n go to questionManagmentSystem class of this project uncomment codes and correct them");
            /*do {
                printListOfQuestions();
            System.out.println("select which question do you want to answer");

            userInput = scanner.nextInt();
            switch (userInput) {


                case 1:

                    do {
                        System.out.println(listOfQuestion.get(userInput - 1));
                        multipleChoices = scanner.next();
                        if (mapOfCorrectAnswers.get(userInput).equals(multipleChoices)) {
                            printCorrectAnswerMessage();
                            correctAnswers++;
                        } else if (multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c") || multipleChoices.equals("d")) {
                            inCorrectAnswers++;
                            if (userInput == listOfQuestion.toArray().length) printLastIncorrectAnswerMessage();
                            else {
                                printIncorrectAnswerMessage();
                            }
                            mapOfUserAnswers.put(userInput, multipleChoices);
                        } else printWrongEntry();
                    } while (!(multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c" +
                            "") || multipleChoices.equals("d")));

                  break;
                case 2:
                    do {
                        System.out.println(listOfQuestion.get(userInput - 1));
                        multipleChoices = scanner.next();
                        if (mapOfCorrectAnswers.get(userInput).equals(multipleChoices)) {
                            printCorrectAnswerMessage();
                            correctAnswers++;
                        } else if (multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c") || multipleChoices.equals("d")) {
                            inCorrectAnswers++;
                            if (userInput == listOfQuestion.toArray().length) printLastIncorrectAnswerMessage();
                            else {
                                printIncorrectAnswerMessage();
                            }
                            mapOfUserAnswers.put(userInput, multipleChoices);
                        } else printWrongEntry();
                    } while (!(multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c" +
                            "") || multipleChoices.equals("d")));
                    break;

                case 3:
                    do {
                        System.out.println(listOfQuestion.get(userInput - 1));
                        multipleChoices = scanner.next();
                        if (mapOfCorrectAnswers.get(userInput).equals(multipleChoices)) {
                            printCorrectAnswerMessage();
                            correctAnswers++;
                        } else if (multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c") || multipleChoices.equals("d")) {
                            inCorrectAnswers++;
                            if (userInput == listOfQuestion.toArray().length) printLastIncorrectAnswerMessage();
                            else {
                                printIncorrectAnswerMessage();
                            }
                            mapOfUserAnswers.put(userInput, multipleChoices);
                        } else printWrongEntry();
                    } while (!(multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c" +
                            "") || multipleChoices.equals("d")));
                        break;
                case 4:
                    do {
                        System.out.println(listOfQuestion.get(userInput - 1));
                        multipleChoices = scanner.next();
                        if (mapOfCorrectAnswers.get(userInput).equals(multipleChoices)) {
                            printCorrectAnswerMessage();
                            correctAnswers++;
                        } else if (multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c") || multipleChoices.equals("d")) {
                            inCorrectAnswers++;
                            if (userInput == listOfQuestion.toArray().length) printLastIncorrectAnswerMessage();
                            else {
                                printIncorrectAnswerMessage();
                            }
                            mapOfUserAnswers.put(userInput, multipleChoices);
                        } else printWrongEntry();
                    } while (!(multipleChoices.equals("a") || multipleChoices.equals("b") || multipleChoices.equals("c" +
                            "") || multipleChoices.equals("d")));
                    //break;
                case 5:
                    break;


                default:
                    printWrongEntry();
            }
        }while(userInput==5);*/
        } else {System.out.println(" Wrong entry \n you can only enter 1 || 2\ntry again");}
    }


}









