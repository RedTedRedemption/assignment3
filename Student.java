import java.util.ArrayList;

public class Student {

    public static ArrayList<Student> students = new ArrayList<>();

    public String name_First;
    public String name_Last;
    boolean athlete;
    String athleteFlag;
    int grade0;
    int grade1;
    int grade2;

    double score;
    String letterGrade;
    boolean BGEligable;


    public Student(String firstName, String lastName, String AthleteFlag, String Grade0, String Grade1, String Grade2) {
        name_First = firstName;
        name_Last = lastName;

        athlete = AthleteFlag.toLowerCase().equals("y");
        athleteFlag = AthleteFlag.toLowerCase();

        grade0 = Integer.parseInt(Grade0);
        grade1 = Integer.parseInt(Grade1);
        grade2 = Integer.parseInt(Grade2);

        score = (grade0 + grade1 + grade2) / 3.0;

        letterGrade = getLetterGrade();

        BGEligable = athlete && score >= 70;

        students.add(this);

    }

    public void print() {
        System.out.print(name_Last + ", ");
        System.out.print(name_First + " ");
        System.out.print(letterGrade + " ");
        System.out.print(score + " ");
        System.out.print(athleteFlag + " ");
        if (BGEligable) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    private String getLetterGrade() {
        if (score >= 90) {
            return "a";
        }
        if (score >= 80) {
            return "b";
        }
        if (score >= 70) {
            return "c";
        }
        if (score >= 60) {
            return "d";
        }
        return "f";
    }





}
