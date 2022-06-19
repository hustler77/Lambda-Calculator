    import org.junit.jupiter.api.Assertions;

    public class CalcTest {

        @org.junit.jupiter.api.Test
        public void testCalculatorPow(){
            Calculator calc1 = new Calculator();
            int a = 2;
            int b = 4;
            int result = calc1.pow.apply(a);
            Assertions.assertEquals(b,result);
        }
        @org.junit.jupiter.api.Test
        public void testCalculatorPositive(){
            Calculator calc2 = new Calculator();
            int a = 2;
            boolean b = true;
            boolean result = calc2.isPositive.test(a);
            Assertions.assertEquals(b, result);
        }
        @org.junit.jupiter.api.Test
        public void testCalculatorAbs(){
            Calculator calc3 = new Calculator();
            int a = 2;
            int b = 2;
            int result = calc3.abs.apply(a);
            Assertions.assertEquals(b,result);
        }
    }

