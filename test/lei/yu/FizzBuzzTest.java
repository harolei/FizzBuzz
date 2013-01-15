package lei.yu;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_output_fizz_when_input_is_divisible_by_3() throws Exception {
       FizzBuzz fizzBuzz = new FizzBuzz();
       assertThat(fizzBuzz.run(3),is("Fizz"));
    }

    @Test
    public void should_output_buzz_when_input_is_divisible_by_5() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.run(5),is("Buzz"));
    }
}
