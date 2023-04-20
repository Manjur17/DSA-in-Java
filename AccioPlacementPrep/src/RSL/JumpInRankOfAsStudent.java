package RSL;

class Student {
    String name;
    int marks, prev_rank;

    Student() {
        this.marks = 0;
        this.prev_rank = 0;
    }
}

public class JumpInRankOfAsStudent {
    //Jump in rank of a student after updating marks
    static void nameRank(String[] names, int[] marks, int[] updates, int n) {

        // Array of students
        Student[] student = new Student[n];

        for (int i = 0; i < n; i++) {
            student[i] = new Student();

            // Store the name of the student
            student[i].name = names[i];

            // Update the marks of the student
            student[i].marks = marks[i] + updates[i];

            // Store the current rank of the student -> 1 based indexing
            student[i].prev_rank = i + 1;
        }

        Student highest = student[0];

        for (int i = 1; i < n; i++) {
            if (student[i].marks >= highest.marks)
                highest = student[i];
        }

        // Print the name and jump in rank
        System.out.print("Name: " + highest.name + ", Jump: " + Math.abs(highest.prev_rank - 1));
    }


    public static void main(String[] args) {

        // Names of the students
        String[] names = {"sam", "ram", "geek"};

        // Marks of the students
        int[] marks = {80, 79, 75};

        // Updates that are to be done
        int[] updates = {0, 5, -9};

        // Number of students
        int n = marks.length;

        nameRank(names, marks, updates, n);
    }
}
