import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.sql.Array;

public class Main {

    public static int sumer(int[] arr) {

        int sum = 0;
        for (int each : arr) {
            if (each < 100) {
                sum += each;
            }
        }
        return sum;

    }

    public static double getDiscriminant(double a, double b, double c) {

        double discriminant;
        discriminant = (b * b) - (4 * a * c);
        return discriminant;
    }

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        int[] arr = {1, 2, 3, 4, 5, 2, 2};
//        int sum = sumer(arr);
//        System.out.println(sum);

//        System.out.println(getDiscriminant(1, 2, 3));
//        try {
//            Book book = new Book("vefx", "shota", 100);
//            Book book2 = new Book("vefsdx", "shoasfta", -100);
//            System.out.println(book2.equals(book));
//        }catch (PriceException e){
//
//            System.out.println(e.getMessage());
//
//        }

//        XMLUtils.createXML();
//        XMLUtils2.createXML();
//        XMLUtils3.createXML();
//
//        System.out.println(inArray(arr,2));
//        double a = 10;
//        System.out.println(a/4)
        try{
        Employee employee = new Employee("Kote", 234410, 234);
        Employee employee2 = new Employee("Kotsdafe", 234410, -2341.4);
        System.out.println(employee.toString());
        System.out.println(employee.equals(employee2));
        }catch (EmployeeException e){
            System.out.println(e.getMessage());
        }

    }


    public static double avg(int[] arr) {
        int counter = 0;
        double sum = 0;
        for (int each : arr) {
            if (each % 2 == 0) {
                sum += each;
                counter++;
            }
        }
        return sum / counter;
    }


    public static boolean inArray(int[] arr, int key) {
        boolean checker = false;
        for (int each : arr) {
            if (each == key) {
                checker = true;
                break;
            }

        }
        return checker;
    }
    public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
}