package edu.iis.mto.time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class FakeClock extends Clock {

    private Instant lastInstant;
    private int hoursPassingInInstant;

    public FakeClock(int hoursPassingInInstant) {
        this.hoursPassingInInstant = hoursPassingInInstant;
        lastInstant = Instant.now();
    }

    @Override public ZoneId getZone() {
        return ZoneId.systemDefault();
    }

    @Override public Clock withZone(ZoneId zone) {
        return this;
    }

    @Override public Instant instant() {
        lastInstant = lastInstant.plus(hoursPassingInInstant, ChronoUnit.HOURS);
        return lastInstant;
    }
}
