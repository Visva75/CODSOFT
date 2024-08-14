import java.util.Scanner;
class Studentgradecalculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE STUDENT NAME :");
        String name = scan.nextLine();
        System.out.println("ENTER THE DEPARTMENT");
        String dept = scan.nextLine();
        System.out.println("ENTER THE NUMBER OF SUBJECTS :");
        int  Noofsubjects = scan.nextInt();
        int totalMarks=0;
        for (int i = 1; i <= Noofsubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scan.nextInt();
            totalMarks += marks;
        }
        double averagePercentage= (double) totalMarks / (Noofsubjects * 100) * 100;

       char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("**********************");
       System.out.println("Studentname:"+name);
       System.out.println("Department:"+dept);
       System.out.println("Totalnumber of marks:"+totalMarks);
       System.out.println("Average Percentage:"+averagePercentage+"%");
       System.out.println("Grade:"+grade);

    }
}