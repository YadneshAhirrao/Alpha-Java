

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class saple {
    public static void main(String[] args) {
        String Adhar_Number = "123461789123";
        String DOB = "13/05/1952";
        String comorbidity = "yes";
        Function(Adhar_Number, DOB, comorbidity);
    }

    public static void Function(String Adhar_Number, String DOB, String comorbidity) {
        LocalDate birthdate = LocalDate.parse(DOB, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int age = calculateAge(birthdate);

        if (Adhar_Number.length() != 12) {
            System.out.println("Invalid adhar number");
            System.exit(0);
        }

        if (comorbidity.equals("yes") || comorbidity.equals("no")) {
            if (age > 60) {
                System.out.println("1");
            } else if (age > 45 && age <= 60) {
                if (comorbidity.equals("yes")) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            } else if (age > 30 && age <= 45) {
                if (comorbidity.equals("yes")) {
                    System.out.println("1");
                } else {
                    System.out.println("3");
                }
            }
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }

    }

    private static void exit(int i) {
    }

    static int calculateAge(LocalDate birthdate) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and the current date
        Period period = Period.between(birthdate, currentDate);

        // Return the years from the period
        return period.getYears();
    }
}
