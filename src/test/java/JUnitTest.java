import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("성공 테스트 확인용")
    @Test
    public void junitTest(){
        int a=1;
        int b=2;
        int sum = 3;
        Assertions.assertEquals(a + b, sum);
    }
    @DisplayName("실패 테스트 확인용")
    @Test
    public void junitTestX(){
        int a=1;
        int b=3;
        int sum = 3;
        Assertions.assertEquals(a + b, sum);
    }
}
