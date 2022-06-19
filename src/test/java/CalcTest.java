    import org.junit.jupiter.api.Assertions;

    public class CalcTest {

        @org.junit.jupiter.api.Test
        public void testPow(){
            Calculator calc = new Calculator();
            int a = 2;
            int b = 4;
            int result = calc.pow.apply(a);
            Assertions.assertEquals(b,result);
        }
        @org.junit.jupiter.api.Test
        public void testPositive(){
            Calculator calc = new Calculator();
            int a = 2;
            boolean b = true;
            boolean result = calc.isPositive.test(a);
            Assertions.assertEquals(b, result);
        }
        @org.junit.jupiter.api.Test
        public void testAbs(){
            Calculator calc = new Calculator();
            int a = -2;
            int b = 2;
            int result = calc.abs.apply(a);
            Assertions.assertEquals(b,result);
        }
    }

