package driverLicence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DriverLicence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Provide your name: ");
        String myName = input.nextLine();

        System.out.print("Provide the number of available agents: ");
        int agents = Integer.parseInt(input.nextLine());

        System.out.print("Provide the names of other customers: ");
        String customers = input.nextLine();

        String[] arrayCustomers = customers.split(" ");
        List<String> allCustomers = new ArrayList<String>(Arrays.asList(arrayCustomers));
        allCustomers.add(myName);
        List<String> sortedCustommers = allCustomers.stream().sorted().collect(Collectors.toList());
        int myIndex = sortedCustommers.indexOf(myName) + 1;

        int buckets;
        if (myIndex <= agents) {
            buckets = 1;
        } else {
            if (myIndex % agents == 0) {
                buckets = myIndex / agents;
            } else {
                buckets = (myIndex / agents) + 1;
            }
        }

        int timeToOut = buckets * 20;
        System.out.println(timeToOut);
    }
}
