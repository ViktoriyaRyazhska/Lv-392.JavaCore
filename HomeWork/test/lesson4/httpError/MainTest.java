package lesson4.httpError;

import org.junit.Assert;
import org.junit.Test;
import ua.com.lozinska.lesson4.httpError.HTTP;
import ua.com.lozinska.lesson4.httpError.Main;


public class MainTest {


    @Test
    public void errorNum() {
        String er = "400";
        HTTP result = Main.errorNum(er);
        Assert.assertEquals(HTTP.BAD_REQUEST, result);
    }
}
