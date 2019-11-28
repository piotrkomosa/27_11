import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Euler6Test {

    private Euler6 euler6 = new Euler6();

    @Test
    public void shouldWorkFor5() {
        int result = euler6.difference(5);

        Assertions.assertThat(result).isEqualTo(170);
    }

    @Test
    public void shouldWorkFor11() {
        int result = euler6.difference(11);

        Assertions.assertThat(result).isEqualTo(3850);
    }

    @Test
    public void shouldWorkFor1minus() {
        int result = euler6.difference(-1);

        Assertions.assertThat(result).isEqualTo(0);
    }



}
