public class Operators {
    public static void main(String[] args) {
        
        int a = 10, b = 3;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + !x);

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        //int p = 5, q = 3; // 0101 & 0011
        System.out.println("a & b = " + (a & b));  // Bitwise AND
        System.out.println("a | b = " + (a | b));  // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b));  // Bitwise XOR
        System.out.println("~a = " + (~a));        // Bitwise NOT
        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned right shift

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int num = 10;
        num += 5;
        System.out.println("num += 5: " + num); // num = num + 5
        num -= 3;
        System.out.println("num -= 3: " + num); // num = num - 3
        num *= 2;
        System.out.println("num *= 2: " + num); // num = num * 2
        num /= 4;
        System.out.println("num /= 4: " + num); // num = num / 4
        num %= 3;
        System.out.println("num %= 3: " + num); // num = num % 3

        // Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("a++: " + (a++)); // Post-increment
        System.out.println("a after a++: " + a); // After post-increment
        System.out.println("--a: " + (--a)); // Pre-decrement
        System.out.println("a--: " + (a--)); // Post-decrement
        System.out.println("a after a--: " + a); // After post-decrement
        System.out.println("~a: " + (~a)); // Bitwise NOT
        System.out.println("!x: " + !x); // Logical NOT

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);

        // Instanceof Operator
        System.out.println("\nInstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
        
        // Type Cast Operator
        System.out.println("\nType Cast Operator:");
        double d = 10.5;
        int castedValue = (int) d; // Casting from double to int
        System.out.println("Casted value (double to int): " + castedValue);

    }
}
