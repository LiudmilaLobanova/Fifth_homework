import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiseTest {
    @Test
    public void testBelowOneHundred() {
        SQRService service = new SQRService();
        int border1 = 20;
        int border2 = 99;
        int expected = 0;
        int actual = service.numberSqrMatches(border1, border2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEqualBorders() {
        SQRService service = new SQRService();
        int border1 = 200;
        int border2 = 200;
        int expected = 0;
        int actual = service.numberSqrMatches(border1, border2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testFirstMatch() {
        SQRService service = new SQRService();
        int border1 = 100;
        int border2 = 120;
        int expected = 1;
        int actual = service.numberSqrMatches(border1, border2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHomeWorkBorders() {
        SQRService service = new SQRService();
        int border1 = 200;
        int border2 = 300;
        int expected = 3;
        int actual = service.numberSqrMatches(border1, border2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxBorders() {
        SQRService service = new SQRService();
        int border1 = 100;
        int border2 = 9801;
        int expected = 90;
        int actual = service.numberSqrMatches(border1, border2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveMaxNumberSQR() {
        SQRService service = new SQRService();
        int border1 = 0;
        int border2 = 20_000;
        int expected = 90;
        int actual = service.numberSqrMatches(border1, border2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveBorders() {
        SQRService service = new SQRService();
        int border1 = 9802;
        int border2 = 20_000;
        int expected = 0;
        int actual = service.numberSqrMatches(border1, border2);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testFailJustForCheck() {
//        SQRService service = new SQRService();
//        int border1 = 9802;
//        int border2 = 20_000;
//        int expected = 1;
//        int actual = service.numberSqrMatches(border1,border2);
//
//        Assertions.assertEquals(expected, actual);
//    }

}
