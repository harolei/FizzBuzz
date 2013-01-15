package lei.yu;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-15
 * Time: 下午12:37
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzTest {
    @Test
    public void should_output_fizz_when_input_is_divisible_by_3() throws Exception {
       FizzBuzz fizzBuzz = new FizzBuzz();
       assertThat(fizzBuzz.run(3),is("Fizz"));
    }
}