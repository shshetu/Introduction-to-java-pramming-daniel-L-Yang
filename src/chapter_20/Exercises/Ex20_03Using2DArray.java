package chapter_20.Exercises;

import java.util.*;

public class Ex20_03Using2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     // add the array to  the Array List
        List<String[]> capitalList = new ArrayList<>(Arrays.asList(initCountryAndCapitals()));
     // Shuffle and loop through each element and ask and match
        Collections.shuffle(capitalList);
        int marks = 0;
        for (int i = 0; i <capitalList.size() ; i++) {
            System.out.println("What is the capital of: "+ capitalList.get(i)[0]);
            if(input.nextLine().toLowerCase().equals(capitalList.get(i)[1])) {
                marks++;
                System.out.println("Your answer is correct");
            }else {
                System.out.println("Correct answer should be: "+capitalList.get(i)[1]);
            }
        }
        System.out.println("You got: "+marks+" out of: "+capitalList.size());
    }

    // method: add the capital and country in a 2D array
    public static String[][] initCountryAndCapitals(){
        String[][] capitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "St. Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };
        return capitals;
    }
}




