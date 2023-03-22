package com.example.quiz_app;

public class QuestionAnswer {
    public static String question[]={"Who invented Java Programming?","Which component is used to compile, debug and execute the java programs",
    "What is the extension of java code files","Android is ","Under which of the following Android is licensed?"," Android is based on which of the following language?",
      "APK stands for -" ,"What does API stand for?" ,"What is an activity in android?","ADB stands for -" };
    public static String choices[][]={
            {"Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup"},
            {"JRE", " JIT" , " JDK" , " JVM"},
            {".js",".txt",".class",".java"},
            {"an operating system", "a web browser","a web server", "None of the above"},
            {"OSS", "Sourceforge", "Apache/MIT" ,"None of the above"},
            {"Java" , "C++" , "C"  ,"None of the above"},
            {"Android Phone Kit" , "Android Page Kit" ,"Android Package Kit" , "None of the above"},
            {"Application Programming Interface" , "Android Programming Interface" , "Android Page Interface" , "Application Page Interface"},
            {"android class" , "android package" ,"A single screen in an application with supporting java code" ,"None of the above"},
            {"Android debug bridge" ,"Android delete bridge" ,"Android destroy bridge" , "None of the above"}

    };

    public static String correctanswer[]={"James Gosling"," JDK" ,".java","an operating system","Apache/MIT","Java","Android Package Kit","Application Programming Interface","A single screen in an application with supporting java code","Android debug bridge" };
}
