package echo.runnable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public  class Input2OutputTest {

	@ParameterizedTest
	@CsvSource({"'Hallo1\nHallo2'",
							"'HalloHallo\njaja'"})
	public void test(String s) {
    assertEquals("vor der Wahl","nach der Wahl");
	}
}
