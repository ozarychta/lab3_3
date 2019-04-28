package edu.iis.mto.time;

import org.junit.Before;
import org.junit.Test;

import java.time.Clock;

public class OrderTest {

    Order order;
    Clock fakeClock;

    @Test (expected = OrderExpiredException.class)
    public void confirm_shouldThrowException() {
        fakeClock = new FakeClock(26);
        order = new Order(fakeClock);

        order.submit();
        order.confirm();
    }

    @Test
    public void confirm_shouldNotThrowException() {
        fakeClock = new FakeClock(2);
        order = new Order(fakeClock);

        order.submit();
        order.confirm();
    }
}
