import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("단순 테스트 확인용")
    @Test
    public void junitTest(){
        int a=1;
        int b=2;
        int sum = 3;
        Assertions.assertEquals(a + b, sum);
    }

}