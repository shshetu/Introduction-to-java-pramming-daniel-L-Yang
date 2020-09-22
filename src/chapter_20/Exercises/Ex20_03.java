package chapter_20.Exercises;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex20_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] countryList = {"Bangladesh", "India", "China"};
        String[] capitalList = {"Dhaka", "New Delhi", "Beijing"};
        // Keep tracking number the user has got
        int totalMarks = countryList.length;
        int obtainedMarks = 0;
        int numberOfTestCases = countryList.length;
        while (numberOfTestCases-- > 0) {
            int randomCountry = (int) (Math.random() * countryList.length);
            System.out.println("What is the capital of: " + countryList[randomCountry]);
            String capitalInputFromUser = input.next();
            if (capitalInputFromUser.equals(capitalList[randomCountry])) {
                obtainedMarks++;
                System.out.println("Your answer is correct!");
            } else {
                System.out.println("You are incorrect! The capital of: " + countryList[randomCountry] + " is: " + capitalList[randomCountry]);
            }
        }
        System.out.println("Your got: " + obtainedMarks + " out of: " + totalMarks);

    }


}
