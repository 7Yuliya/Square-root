import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    //@org.junit.jupiter.api.Test
    @ParameterizedTest
    @CsvSource({
            "0,10,99",
            "12,700,1500",
            "13,800,1700"
    })
    public void shouldCalcExact(int expected, int min1, int max2) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(min1, max2);
        Assertions.assertEquals(expected, actual);
    }


}
