package ie.atu;

import java.io.File;
import java.util.Scanner;

public class CVS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new File("names.cvs")); // throws Exception
        sc.useDelimiter(","); // Sets the delimiter pattern
        while (sc.hasNext()) { // Returns a boolean value
            System.out.println(sc.next());
        }
        sc.close(); // Closes the scanner
    }
}
