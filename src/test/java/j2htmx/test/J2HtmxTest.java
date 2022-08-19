package j2htmx.test;


import java.io.IOException;
import static j2htmx.J2Htmx.hx;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tareq
 */
public class J2HtmxTest {
    
    @Test
    public void boost_attribute_test() throws IOException{
        StringBuilder builder  = new StringBuilder();
        hx.boost("test").renderModel(builder, null);
        assertTrue(builder.toString().contains("hx-boost=\"test\""));
    }
}
