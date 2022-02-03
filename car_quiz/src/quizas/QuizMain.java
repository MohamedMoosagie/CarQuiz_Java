/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizas;

/**
 *
 * @author user
 */import java.util.Scanner;
public class QuizMain{
     
public static void main(String[] args) {
System.out.println("--------Welocome to The Car Quiz--------");
//output to user prompting to choose car quiz type
System.out.println("Choose your 'most' loved car make : Please input {1,2 or 3 as selection}" 
        
        + "\n(1)BMW\n(2)Audi\n(3)(Toyota) \n");

Scanner input = new Scanner(System.in);
int CarSelect= input.nextInt(); //store inout of user into CarSelect variable
switch (CarSelect){ //case selection based on choice user makes [starts specific question quiz based on user input]
case 1:
//prints list of quiz questions and accepts user input
System.out.println("--------Welocome to The BMW Quiz--------");
String q1 = "TRUE OR FALSE,BMW STAND FOR Bavarian Motor Works\n"
+ "(a)true\n(b)false\n";
String q2 ="WHAT GENERATION IS THE BMW F01 SERIAS\n"
+ "(a)5TH GEN\n(b)7TH GEN\n(c)10TH GEN\n";
String q3 ="one of the founders of BMW is..\n"
+ "(a)Camillo Castiglioni\n(b)Franz Josef , \n(c)Mohamed Asad\n";
String q4 ="What BMW engine is best?\n"
+ "(a)M88\n(b)S70/2\n(c)S65\n";
String q5 =" BMW was founded in 1916\n"
+ "(a)TRUE\n(b)FALSE\n";
String q6 ="BMW Made its First Electric Car in: \n"
+ "(a)1950\n(b)1975\n(c)1972";
String q7 ="BMW Originally Built Engines FOR :\n"
+ "(a)SUBMARINE\n(b)ROCKETS\n(c)PLANES";
String q8 =" Their First Car Was the :\n"
+ "(a)BIXI\n(b)DIXI\n(c)DRIXI";
String q9 =" The Colors Used in the Logo Represent: \n"
+ "(a)Noctal\n(b)SafiyullasHead\n(c)Bavaria";
String q10 =" The Treaty of _______ is the Reason BMW Began Making Cars\n"
+ "(a)Educandor\n(b)Versailles\n(c)Bevarious";

takeTests obj =new takeTests();//create new object of takeTest method
/*
loop through array of questions using Question constructor that accepts 2 arguments
second argument holds a character in reference to be compared to user input
*/
Question [] questions = {
new Question(q1,"a"),
new Question(q2,"a"),
new Question(q3,"a"),
new Question(q4,"b"),
new Question(q5,"a"),
new Question(q6,"c"),
new Question(q7,"c"),
new Question(q8,"b"),
new Question(q9,"c"),
new Question(q10,"b")
};

obj.takeTest(questions); //call upon takeTest method that is a method of obj class and take"questions" as argument
break;
case 2:
System.out.println("--------Welocome to The Audi Quiz--------");
//prints list of quiz questions and accepts user input
String q11 = "The word Audi in Latin means _____\"\n"
+ "(a)see\n(b)look\n(c)hear";
String q12 ="The four rings in the logo represent the four companies of\n"
+ "(a)Sub bevaria\n(b) auto union\n(c)JFk\n";
String q13 ="Audi's Quattro four-wheel-drive cars revolutionised rallying\n"
+ "(a)true\n(b)flase\n";
String q14 ="Audi was the first car manufacturer to win Le Mans with both Diesel and Hybrid powered cars?\n"
+ "(a)true\n(b)false\n";
String q15 ="Audi founder trained under Karl Benz\n"
+ "(a)true\n(b)false\n";
String q16 ="Audi has been conducting crash tests for over _____ years now\n"
+ "(a)200 years\n(b)100 years\n (c)75 years\n";
String q17 ="Auto Union produced a ______ going race car back in 1938\n"
+ "(a)500km kmph\n(b)430 kmph\n(c)800 kmph\n";
String q18 =" Modern rallying was --not-- revolutionized by the Audi's Quattro four-wheel system\n"
+ "(a)true\n(b)false\n";
String q19 ="\"______\", the fully autonomous Audi has scaled Pikes Peak with no driver\n"
+ "(a)Edgar\n(b)Shelly\n(c)Von Deutch\n";
String q20 ="Audi is planning to send a Quattro powered Lunar Rover on Moon\n"
+ "(a)true\n(b)false\n";
takeTests obj1 =new takeTests(); //create new object of takeTest


/*
loop through array of questions using Question constructor that accepts 2 arguments
second argument holds a character in reference to be compared to user input
*/
Question [] questions1 = {
new Question(q11,"c"),
new Question(q12,"b"),
new Question(q13,"a"),
new Question(q14,"a"),
new Question(q15,"a"),
new Question(q16,"c"),
new Question(q17,"b"),
new Question(q18,"b"),
new Question(q19,"b"),
new Question(q20,"a")
};
obj1.takeTest(questions1);
break;
case 3:
System.out.println("--------Welocome to The Toyota Quiz--------");

//prints list of quiz questions and accepts user input
String q21 = "When was Toyota Motor Corporation founded?\n"
+ "(a)1950's\n(b)1940's\n(b)1920's\n(c)1930's\n";
String q22 ="What is the City/Hwy MPG for the 2012 Toyota Tundra CrewMax Cab?\n"
+ "(a)16/27\n(b)13/17\n(c)17/23\n";
String q23 ="What size engine does a 2012 Toyota FJ Cruiser have?\n"
+ "(a)5.7L 8-cylinder\n(b)2.7L 4-cylinder , \n(c)4.0L 6-cylinder\n";
String q24 ="In what years did the first generation Toyota Solara span?\n"
+ "(a)1999-2003\n(b)1995-1999\n(c)2000-2004\n";
String q25 ="How much more horsepower did the 1998 Toyota Supra Twin Turbo have over the base Supra model?\n"
+ "(a)67\n(b)95\n";
String q26 = "Which layout do Toyota MR2 models have?\n"
+ "(a)Rear Mid-Engine, Rear-Wheel Drive\n(b)Rear-Engine, Rear-Wheel Drive\n";
String q27 ="Between 2003-2013, Toyota Motor Corporation was the most profitable company in the world.\n"
+ "(a)FALSE \n(b)TRUE\n";
String q28 ="Which Toyota model was NOT sold during the 1990's?\n"
+ "(a)Camillo Previa\n(b)Echo \n(c)Corolla";
String q29 ="How much horsepower does a 2014 Toyota Venza Limited have?\n"
+ "(a)237\n(b)268 \n(c)200\n";
String q30 ="Which Toyota has the fastest 0-60 time?\n"
+ "(a)1995 Toyota Supra Turbo\n(b)2012 Toyota Camry SE (V6)\n";
takeTests obj2 =new takeTests(); //create obj2 of method takeTest
/*
loop through array of questions using Question constructor that accepts 2 arguments
second argument holds a character in reference to be compared to user input

Mohamed Asad Moosagie 201901161
*/
Question [] questions2 = {
new Question(q21,"c"),
new Question(q22,"b"),
new Question(q23,"c"),
new Question(q24,"a"),
new Question(q25,"b"),
new Question(q26,"a"),
new Question(q27,"a"),
new Question(q28,"b"),
new Question(q29,"b"),
new Question(q30,"a")
};
obj2.takeTest(questions2); //call upon takeTest method that is a method of obj class and take"questions2" as argument
break;
}
System.out.println("\n-------------------------------------------------------------------------------");
/*
prints least loved car input , stores in CarSelect and prints out certain
statment based on user selection
*/
System.out.println("\nwhat is your 'least' loved car make"
+ "\n(1)BMW\n(2)Audi\n(3)(Toyota) \n" );
CarSelect= input.nextInt();
switch (CarSelect){
case 1:
System.out.println("Thank You for your contribution,BMW is somebody else's faviroute,See you next time :)");
break;
case 2:
System.out.println("Thank You for your contribution,AUDI is somebody else's faviroute,See you next time :)");
break;
case 3:
System.out.println("Thank You for your contribution,TOYOTA is somebody else's faviroute,See you next time :)");
break;
}
}
}
