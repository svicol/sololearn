package ustoeudate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String usDate = input.nextLine();

        System.out.println(convertUsDateToEu(usDate));

    }

    private static String convertUsDateToEu(String date) {

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendOptional( DateTimeFormatter.ofPattern("M/d/yyyy"))
//                .optionalStart().appendPattern("M/dd/yyyy").optionalEnd()
//                .optionalStart().appendPattern("M/d/yyyy").optionalEnd()
//                .optionalStart().appendPattern("MM/d/yyyy").optionalEnd()
//                .optionalStart().appendPattern("MMM dd, yyyy").optionalEnd()
                .optionalStart().appendPattern("MMM d, yyyy").optionalEnd()
//                .optionalStart().appendPattern("MMMM dd, yyyy").optionalEnd()
                .optionalStart().appendPattern("MMMM d, yyyy").optionalEnd()
                .toFormatter(Locale.US);

        LocalDate dateUs = LocalDate.parse(date, formatter);

        String dateEu = dateUs.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        return dateEu;
    }
}
