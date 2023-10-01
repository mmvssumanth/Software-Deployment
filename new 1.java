import java.util.Scanner;

class New1 {
    public static void main(String[] args) {
        System.out.println("Malleswara Venkata Satyasai Sumanth Maradugu and naga sai garnepudi");
        System.out.println("Please enter your grade: ");

        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();

        char letterGrade = getLetterGrade(grade);

        System.out.println("The letterGrade for the grade " + grade + " is " + letterGrade);
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
