import java.util.Scanner;

class New1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your grade : ");
            String input = scan.next();

            if (input.equals("q")) {
                break; // Exit the loop if 'q' is entered
            }

            try {
                int grade = Integer.parseInt(input);
                char letterGrade = getLetterGrade(grade);
                System.out.println("The letterGrade for the grade " + grade + " is " + letterGrade);
            } catch (NumberFormatException e) {
               
            }
        }
    }

    public static char getLetterGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
