package OOPGradeStatistics;


import java.util.ArrayList;


//We make a new class called Grade.
//In this class we calculate the average and the whole grading system.
public class Grade {

    //Make a new ArrayList to store the grades
    private ArrayList<Integer> grades;

    //Constructor, where we instantiate the ArrayList
    public Grade() {
        this.grades = new ArrayList<>();
    }

    //Method where we can add grades to the ArrayList
    //We can only give points between 0 and 100.
    public void addGrade(int gradesToAdd) {
        if (gradesToAdd >= 0 && gradesToAdd <= 100) {
            grades.add(gradesToAdd);
        }
    }

    //Method where we calculate the average of all the grades
    //Two variable is declared. results and total.
    //For each loop to loop through the ArrayList and adding to total.
    //Calculating the average using the ArrayList size
    //Return the results.
    public String calculateAverageGrades() {
        double results = 0;
        int total = 0;

        for (int grade : grades) {
            total = total + grade;
        }
        results = 1.0 * total / grades.size();

        return results + "";
    }

    //Method for what grade to have before you pass
    //3 variables is declared
    //Use a for each loop to go through the grades
    //If the grade is higher than 49, increment passingCount
    //If total is equal to 0, return minus. If not return results
    public String averagePassingGrade() {
        double results = 0;
        int total = 0;
        int passingCount = 0;

        for (int grade : grades) {
            if (grade > 49) {
                passingCount++;
                total = total + grade;
            }
        }
        results = 1.0 * total / passingCount;

        if (total == 0) {
            return "-";
        } else {
            return results + "";
        }
    }

    //Method where we calculate what percentage it needs to pass
    //2 variables is declared
    //For each loop to go through the ArrayList
    //If grade is higher than 49, increment count.
    //Calculate results and return results
    public String percentageToPass() {
        double results = 0;
        int count = 0;
        for (int grade : grades) {
            if (grade > 49) {
                count++;
            }
        }
        results = 100.0 * count / grades.size();

        return results + "";
    }

    //Method we use to print the grade overview.
    //In this method we use two earlier exercise where we also had to print different grades and print stars
    //We declare and initialize an array with 5 indexes. 0-5
    //Using a for each loop to loop through our ArrayList with grades.
    //When a grade input is below or above one of the statements, it puts the input in the array.
    public void printGradeOverview() {
        int[] gradeArr = new int[6];

        for (int grade : grades) {
            if (grade >= 90) {
                gradeArr[0]++;
            } else if (grade <= 89 && grade > 79) {
                gradeArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeArr[4]++;
            } else if (grade <= 49) {
                gradeArr[5]++;
            }
        }
        //We then prints the headline
        //Declaring and initializing 5 rows
        //For each loop to go through  the array from earlier
        //Normal for loop that goes through our for each loop
        //Decrement the grade index
        System.out.println("Grade distribution:");
        int gradeIndex = 5;

        for (int i : gradeArr) {
            System.out.print(gradeIndex + ":");

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n"); //linebreak
            gradeIndex--;
        }
    }

    //Method used to print all the grades
    public void print() {
        System.out.println("Point average (all): " + calculateAverageGrades() + "\n"
                + "Point average (passing): " + averagePassingGrade() + "\n"
                + "Pass percentage: " + percentageToPass() + "\n");

        printGradeOverview();
    }

}
