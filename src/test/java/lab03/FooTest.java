package lab03;

import org.junit.jupiter.api.*;

public class FooTest {

    private Foo foo;

    @BeforeEach
    public void initData() {
        foo = new Foo();
        System.out.println("Running before each test.");
    }

    @Test
    public void returnNumber_NumberIs5_5() {
        Assertions.assertEquals(5, foo.returnNumber());
    }

    @Test
    public void getNum_ValueIs0_0() {
        Assertions.assertEquals(0, foo.getNum());
    }

    @Test
    public void increment_ValueIs1_1() {
        foo.increment();
        Assertions.assertEquals(1, foo.getNum());
    }

    @DisplayName("Testujeme Exception")
    @Test
    public void exceptionThrown_ExceptionIsThrown_exception() {
        Assertions.assertThrows(Exception.class, () -> foo.exceptionThrown());
    }

    @Test
    @Disabled
    public void alwaysFail_NumberIs6_6() {
        Assertions.assertEquals(6, foo.returnNumber());
    }

    @AfterEach
    public void clearEnvironment() {
        System.out.println("Running after each test.");
    }
}
