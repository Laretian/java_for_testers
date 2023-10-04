public class Hello {
    public static void main(String[] args) {
//        try {
//            var x = 1;
//            var y = 1;
//            var z = divide(x, y);
//            System.out.println("Hello, world!");
//        } catch (ArithmeticException exception) {
////            System.out.println(exception.getMessage());
////            exception.printStackTrace();
//            System.out.println("Division by zero is not allowed");
//        }
        var x = 1;
        var y = 0;

        if (y == 0) {
            System.out.println("Division by zero is not allowed");
        } else {
            var z = divide(x, y);
            System.out.println("Hello, world!");
        }
    }

    private static int divide(int x, int y) {
        var z = x / y;
        return z;
    }
}
