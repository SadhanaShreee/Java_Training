import java.util.Scanner;
public class NumToWords {
    static String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
        "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public static String convertToWords(int number) {
        String result = "";

        if (number >= 1000) {
            int thousands = number / 1000;
            result += ones[thousands] + " Thousand ";
            number %= 1000;
        }

        
        if (number >= 100) {
            int hundreds = number / 100;
            result += ones[hundreds] + " Hundred ";
            number %= 100;
        }

        if (number < 20) {
            result += ones[number];
        } else {
            int ten = number / 10;
            int one = number % 10;
            result += tens[ten] + " " + ones[one];
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 - 9999): ");
        int num = sc.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Number out of range!");
        } else {
            String words = convertToWords(num);
            System.out.println("In words: " + words);
        }
    }
}

