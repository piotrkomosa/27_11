
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();


    @Test
    public void shouldWorkFor100() {
        int result = fibonacci.fibonacciMethod(100);

        Assertions.assertThat(result).isEqualTo(44);
    }

    @Test
    public void shouldWorkFor21() {
        int result = fibonacci.fibonacciMethod(21);

        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void shouldWorkFor378() {
        int result = fibonacci.fibonacciMethod(378);

        Assertions.assertThat(result).isEqualTo(188);
    }

}
