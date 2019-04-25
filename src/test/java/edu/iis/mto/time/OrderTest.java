package edu.iis.mto.time;

import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Repeatable;
import java.time.Clock;

import static org.junit.Assert.*;

public class OrderTest {
    Clock fake = new FakeClock();

    @Before public void setUp() throws Exception {
    }
    @Test public void confirm() {
        System.out.println(fake.instant());

    }
}
