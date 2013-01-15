package lei.yu;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_output_fizz_when_input_is_divisible_by_3() throws Exception {
        assertThat(fizzBuzz.run(3),is("Fizz"));
    }

    @Test
    public void should_output_buzz_when_input_is_divisible_by_5() throws Exception {
        assertThat(fizzBuzz.run(5),is("Buzz"));
    }

    @Test
    public void should_output_fizzbuzz_when_input_is_divisible_by_both_3_and_5() throws Exception {
        assertThat(fizzBuzz.run(15), is("FizzBuzz"));
    }
}
