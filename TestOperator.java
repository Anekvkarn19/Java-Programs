public class TestOperator
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = 30;
        
        // Using arithmetic operators
        System.out.println("Addition: " + (a + b + c));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b * c));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));
        
        // Using relational operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));
        
        // Using logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

        //Using bitwise operators
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT of a: " + (~a));
        System.out.println("Left Shift a by 2: " + (a << 2));
        System.out.println("Right Shift b by 2: " + (b >> 2));
    }
}
