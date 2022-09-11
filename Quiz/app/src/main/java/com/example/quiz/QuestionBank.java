package com.example.quiz;

import java.util.ArrayList;

public class QuestionBank {
    private static ArrayList<Questionlist> javaQuestions(){
        final ArrayList<Questionlist> questionlists = new ArrayList<>();
        final Questionlist question1 = new Questionlist("Which of the following is not a Java features?","Dynamic","Architecture Neutral","Use of pointers","Object-oriented","Use of pointers","");
        final Questionlist question2 = new Questionlist(" _____ is used to find and fix bugs in the Java programs.","JVM","JRE","JDK","JDB","JDB","");
        final Questionlist question3 = new Questionlist("An interface with no fields or methods is known as a","Runnable Interface","Marker Interface","Abstract Interface","CharSequence Interface","Marker Interface","");
        final Questionlist question4 = new Questionlist("Which of the following is a reserved keyword in Java?","object","strictfp","main","system","strictfp","");

        questionlists.add(question1);
        questionlists.add(question2);
        questionlists.add(question3);
        questionlists.add(question4);
        return  questionlists;

    }

    private static ArrayList<Questionlist> phpQuestions(){
        final ArrayList<Questionlist> questionlists = new ArrayList<>();
        final Questionlist question1 = new Questionlist("Which of the following is not a Php features?","Dynamic","Architecture Neutral","Use of pointers","Object-oriented","Use of pointers","");
        final Questionlist question2 = new Questionlist(" _____ is used to find and fix bugs in the Php programs.","JVM","JRE","JDK","JDB","JDB","");
        final Questionlist question3 = new Questionlist("An interface with no fields or methods is known as a","Runnable Interface","Marker Interface","Abstract Interface","CharSequence Interface","Marker Interface","");
        final Questionlist question4 = new Questionlist("Which of the following is a reserved keyword in Php?","object","strictfp","main","system","strictfp","");

        questionlists.add(question1);
        questionlists.add(question2);
        questionlists.add(question3);
        questionlists.add(question4);
        return  questionlists;

    }

    private static ArrayList<Questionlist> htmlQuestions(){
        final ArrayList<Questionlist> questionlists = new ArrayList<>();
        final Questionlist question1 = new Questionlist("Which of the following is not a html features?","Dynamic","Architecture Neutral","Use of pointers","Object-oriented","Use of pointers","");
        final Questionlist question2 = new Questionlist(" _____ is used to find and fix bugs in the html.","JVM","JRE","JDK","JDB","JDB","");
        final Questionlist question3 = new Questionlist("An interface with no fields or methods is known as a","Runnable Interface","Marker Interface","Abstract Interface","CharSequence Interface","Marker Interface","");
        final Questionlist question4 = new Questionlist("Which of the following is a reserved keyword in html?","object","strictfp","main","system","strictfp","");

        questionlists.add(question1);
        questionlists.add(question2);
        questionlists.add(question3);
        questionlists.add(question4);
        return  questionlists;

    }

    private static ArrayList<Questionlist> androidQuestions(){
        final ArrayList<Questionlist> questionlists = new ArrayList<>();
        final Questionlist question1 = new Questionlist("Which of the following is not a Android features?","Dynamic","Architecture Neutral","Use of pointers","Object-oriented","Use of pointers","");
        final Questionlist question2 = new Questionlist(" _____ is used to find and fix bugs in the Android programs.","JVM","JRE","JDK","JDB","JDB","");
        final Questionlist question3 = new Questionlist("An interface with no fields or methods is known as a","Runnable Interface","Marker Interface","Abstract Interface","CharSequence Interface","Marker Interface","");
        final Questionlist question4 = new Questionlist("Which of the following is a reserved keyword in Android?","object","strictfp","main","system","strictfp","");

        questionlists.add(question1);
        questionlists.add(question2);
        questionlists.add(question3);
        questionlists.add(question4);
        return  questionlists;

    }

    public  static ArrayList<Questionlist> getQuestions(String selectedTopic){
        switch (selectedTopic){
            case "Java":
                return javaQuestions();
            case "Php":
                return phpQuestions();
            case "Android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }

}
