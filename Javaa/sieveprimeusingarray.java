import java.util.Scanner;

public class sieveprimeusingarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = scan.nextInt();

        boolean[] primeArray = new boolean[range]; // array name
        int i;
        for (i = 0; i < primeArray.length; i++) { // simple for loop to traverse thru all the elements in array
            primeArray[i] = true; // and make it true
        }
        primeArray[0] = false; // 0 and 1 are false so those are not considered;
        primeArray[1] = false;

        for (i = 2; i < primeArray.length; i++) { // simple for loop to traverse again
            if (primeArray[i]) { // checking true ------ if(primeArray == true)
                for (int j = i * i; j < primeArray.length; j += i) { // if yes the find multiples Eg - i= 2 -> 2*2 it starts , till j+=i // also we can write j=i*2 which means 7*7 times = 7*1 7*2 7*3......7*7;                                                          
                    primeArray[j] = false; // then mark all the j multiples as false
                }
            }
        }
        for (i = 0; i < primeArray.length; i++) { // simple for loop to check all the remaining true
            if (primeArray[i]) { // the numbers that are true
                System.out.println(i); // printing then
            }
        }
    }
}
