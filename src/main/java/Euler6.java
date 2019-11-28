public class Euler6 {

    public static void main(String[] args) {

        int result = difference(10);
        System.out.println(result);
    }

    public static int difference(int number){
        int sum1 = (number*(number+1))/2;
        int resultOfSquareOfSum = sum1*sum1;
        int sum2=0;
        for (int i = 1; i <= number; i++) {
            sum2+= i * i;
        }
        return resultOfSquareOfSum-sum2;
    }
}
