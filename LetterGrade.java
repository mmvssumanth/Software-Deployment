// Author: Malleswara Venkata Satyasai Sumanth Maradugu
import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Malleswara Venkata Satyasai Sumanth Maradugu");
        System.out.println("Please enter your grade  ");

        while (true) {
            String input = scan.next();

            if (input.equals("q")) {
                break; 
            }

            try {
                int grade = Integer.parseInt(input);
                String letterGrade = getLetterGrade(grade);
                System.out.println("The letterGrade for the grade " + grade + " is " + letterGrade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric grade or 'q' to quit.");
            }
        }
        scan.close();
    }

    public static String getLetterGrade(int grade) {
        if (grade >= 90) {
            return "A+";
        } else if (grade >= 80) {
            return "B+";
        } else if (grade >= 70) {
            return "C+";
        } else if (grade >= 45) {
            return "D+";
        } else
            return "F";
        
    }
}






