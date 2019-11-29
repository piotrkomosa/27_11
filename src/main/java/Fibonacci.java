public class Fibonacci {


    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacciMethod(100);
        System.out.println(result);
    }
    public int fibonacciMethod(int limit) {
        int sum = 0;
        int number1 = 0;
        int number2 = 1;
        int number3 = number1 + number2;
        while (number1 <  limit ) {
            if (number1 % 2 == 0) {
                sum += number1;
            }
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
        }
        return sum;
    }
}



