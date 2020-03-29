package interfaces.quarantine;

import interfaces.utils.DurationUtils;

import java.time.Duration;

public class Course implements TimeSpender {
    private String name;
    private Duration duration;

    public Course(String name, Duration duration) {
        this.name = name;
        this.duration = duration;
    }

    public Duration spendTime() {
        System.out.printf("learning %s for %s\n", name, DurationUtils.format(duration));
        return duration;
    }
}
