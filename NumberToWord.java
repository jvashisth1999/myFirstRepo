import java.util.Scanner;

class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 to 5): ");
        int a_number = scanner.nextInt();
        scanner.close();

        System.out.println("With equality:");
        if(a_number == 1) {
            System.out.println("One");
        } else if(a_number == 2) {
            System.out.println("Two");
        } else if(a_number == 3) {
            System.out.println("Three");
        } else if(a_number == 4) {
            System.out.println("Four");
        } else if(a_number == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Out of range");
        }

        System.out.println("\nWithout using equality (using array lookup):");
        String[] words = {"", "One", "Two", "Three", "Four", "Five"};
        if (a_number > 0 && a_number < 6) {
            System.out.println(words[a_number]); 
        } else {
            System.out.println("Out of range");
        }
    }
}