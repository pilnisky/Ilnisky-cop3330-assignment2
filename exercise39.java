import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

public class App {
    public static void main(String[] args) {
        ArrayList<Map<String, String>> employeeRecords = getRecords();
        Collections.sort(employeeRecords, new SortByLastName());
        displayEmployeesTable(employeeRecords);
    }

  
    public static ArrayList<Map<String, String>> getRecords() {
        Map<String, String> firstEmployee = Map.of("First Name", "Jacquelyn", "Last Name", "Jackson", "Position", "DBA",
                "Separation Date", "");
        Map<String, String> secondEmployee = Map.of("First Name", "Jake", "Last Name", "Jacobson", "Position",
                "Programmer", "Separation Date", "");
        Map<String, String> thirdEmployee = Map.of("First Name", "John", "Last Name", "Johnson", "Position", "Manager",
                "Separation Date", "2016-12-31");
        Map<String, String> fourthEmployee = Map.of("First Name", "Michaela", "Last Name", "Michaelson", "Position",
                "District Manager", "Separation Date", "2015-12-19");
        Map<String, String> fifthEmployee = Map.of("First Name", "Sally", "Last Name", "Weber", "Position",
                "Web Developer", "Separation Date", "2016-12-18");
        Map<String, String> sixthEmployee = Map.of("First Name", "Tou", "Last Name", "Xiong", "Position",
                "Software Engineer", "Separation Date", "2016-10-05");

        return new ArrayList<Map<String, String>>(Arrays.asList(thirdEmployee, sixthEmployee, fourthEmployee,
                secondEmployee, firstEmployee, fifthEmployee));
    }

    public static void displayEmployeesTable(ArrayList<Map<String, String>> employees) {
        System.out.println(padRight("Name", " ", 30) + " | " + padRight("Position", " ", 30) + " | "
                + padRight("Separation Date", " ", 30));
        System.out.println(padRight("_", "_", 30) + " | " + padRight("_", "_", 30) + " | " + padRight("_", "_", 30));

        for (Map<String, String> map : employees) {
            System.out.println(padRight(map.get("First Name") + " " + map.get("Last Name"), " ", 30) + " | "
                    + padRight(map.get("Position"), " ", 30) + " | " + padRight(map.get("Separation Date"), " ", 30));
        }
    }

    private static String padRight(String inputString, String padChar, int length) {
        return String.format("%-" + length + "s", inputString).replace(" ", padChar);
    }
}

class SortByLastName implements Comparator<Map<String, String>> {

    public int compare(Map<String, String> a, Map<String, String> b) {
        return a.get("Last Name").compareTo(b.get("Last Name"));
    }
}