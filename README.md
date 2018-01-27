# assignment3

Assignment details:

Assignment #3 requires you to read data from a file, perform some calculations on that data, and then output the read and calculated data to the screen.  Here are the requirements:

    Name your source code "Assignment3.java"
    Have your program output your first and last name
    Email me your "Assignment3.java" file as an attachment before class begins on 2/3.  I don't need your class file or your "students.txt" file
    Read in the data from the attached file, "students.txt".  Each line in this file contains information about a student:
        Last Name
        First Name
        Athlete Flag ("Y" means this student is an athlete, "N" means they are not an athlete)
        Grade 1
        Grade 2
        Grade 3
    Note:  Your program can assume that "students.txt" is in the same directory as your Assignment3.class file.  If you are using Eclipse, put the "students.txt" file in the project's folder [not the src folder]
    Your program needs to calculate the following for each student:
        Score = the average of Grade 1, Grade 2, and Grade 3.  Remember that average is the sum divided by the count of items.  In this case it would be (Grade 1 + Grade 2 + Grade 3) / 3
        Letter Grade = a letter grade for the student (use A >= 90, B >= 80, C >= 70, D >= 60, F < 60)
        "Big Game" Eligible =  Can the student play in the "Big Game"?  To be eligible to play, the student must be an athlete (athlete flag equal to "Y") and must have a grade of "C" or better
    Your program needs to output one line for each student.  That line should output the student's name (use last name then comma then first name format), their letter grade, their score, the athlete flag, and then if they are eligible for the big game (output "Yes" if they are an athlete and their grade is "C" or better, "No" if they are an athlete and their grade is worse than a "C", and "N/A" if they are not an athlete).  NOTE:  The input file contains at least one athlete that is not eligible to play in the "Big Game"
    Your program needs to keep count of how many of each letter grade is given.  Output this as a graph after your output the data for all students.  The graph will have a line for each letter grade and an "*" for each time that grade appeared.   See the screen shot below for an example of the graph output format using  some made up test data (A=5, B=3, C=10, D=2, F=0).  Of course, this screen shot is just showing some test data, the actual values your program calculates will be different.

