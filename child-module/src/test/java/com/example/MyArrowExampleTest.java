package com.example;

import java.io.IOException;
import java.net.URISyntaxException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MyArrowExampleTest {

    @Test
    public void simpleTest() throws IOException, URISyntaxException {
        System.out.println("HELLOO");
        Connection conn = new Connection();
        conn.highThroughPutRead("ignore");
    }
}