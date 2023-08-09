package echo.actor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public  class DaytimeActorTest {

	@ParameterizedTest
	@CsvSource({"'Hallo'",
							"'HalloHallo'"})
	public void test(String s) throws InterruptedException {

		Thread.sleep(500);
    assertEquals("bla","bla");
	}
}
