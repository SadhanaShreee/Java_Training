public class string1 {
    public static void main(String[] args) {
        String name = "Ramesh";
        String empName = "Ramesh";
 
        System.out.println(name == empName); // checks if name & empName points to same memory address...yes so it returns true

        String tenant = new String("Ramesh"); // here we create a new string
        System.out.println("Shallow "+(name == tenant)); // so name doesnt point towards same address...hence name and tenant are 2 different memory...so false
        System.out.println("Deep "+(name.equals(tenant))); // .equals -> yes name & tenant has same string word "Ramesh" -> so true
    }
}
