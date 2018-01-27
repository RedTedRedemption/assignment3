import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment3 {

    private static Scanner scanner;
    private static Scanner cin = new Scanner(System.in);
    private static String filename = "students.txt";
    private static boolean filefound = false;

    public static void main(String[] args) {
        System.out.println("Name: Theodore Herzfeld");

        while (!filefound) {
            try {
                scanner = new Scanner(new File(filename));
                System.out.println("found file!");
                filefound = true;
            } catch (FileNotFoundException e) {
                System.out.println("Error: Could not find " + filename + " file");
                System.out.print("Would you like to enter the name of a different file to use? [y/n]");
                if (cin.next().toLowerCase().equals("y")) {
                    System.out.print("enter file name: ");
                    filename = cin.next();
                }
                else {
                    System.exit(0);
                }
            }
        }

        while (scanner.hasNextLine()) {
            Scanner lScan = new Scanner(scanner.nextLine());
            new Student(lScan.next(), lScan.next(), lScan.next(), lScan.next(), lScan.next(), lScan.next());
        }

        for (Student student : Student.students) {
            student.print();
        }

        //histogram

        System.out.println();
        System.out.println("Grade Histogram: ");

        System.out.print("A = ");
        for (Student student : Student.students) {
            if (student.letterGrade.equals("a")) {
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("B = ");
        for (Student student : Student.students) {
            if (student.letterGrade.equals("b")) {
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("C = ");
        for (Student student : Student.students) {
            if (student.letterGrade.equals("c")) {
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("D = ");
        for (Student student : Student.students) {
            if (student.letterGrade.equals("d")) {
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("F = ");
        for (Student student : Student.students) {
            if (student.letterGrade.equals("f")) {
                System.out.print("*");
            }
        }


    }

}
