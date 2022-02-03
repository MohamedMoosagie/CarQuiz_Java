/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizas;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class takeTests {
    
    public void takeTest(Question [] questions){
//create count variables to keep track of correct and incorrect answers and set count to 0
int scoreCorrect = 0;
int scoreIncorrect =0;
Scanner keyboardInput=new Scanner(System.in); //accept user input
for(int i =0; i < questions.length; i++){ //loop through questions and store in "answer"
System.out.println(questions[i].prompt);
String answer = keyboardInput.nextLine();
//condition if answer is correct then print first statement and if answer wrong print second statement
if(answer.equals(questions[i].answer)){
System.out.println("Well done! The answer provided is correct\n"
+ "----------------------------------------------------------");
scoreCorrect++;
}
else{
System.out.println("Sorry: The answer provided is incorrect.The correct answer is : " +
questions[i].answer
+ " \n"+"----------------------------------------------------------");
scoreIncorrect++;
}
}
System.out.println("Quiz score Results:" );
System.out.println("You got " + scoreCorrect + " correct" +"\nand you got " + scoreIncorrect + 
        "incorrect");
    
    
    }
}
