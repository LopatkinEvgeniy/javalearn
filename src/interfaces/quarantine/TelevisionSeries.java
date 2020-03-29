package interfaces.quarantine;

import interfaces.utils.DurationUtils;

import java.time.Duration;

public class TelevisionSeries implements TimeSpender {
    private String name;
    private int seriesCount;

    public TelevisionSeries(String name, int seriesCount) {
        this.name = name;
        this.seriesCount = seriesCount;
    }

    public Duration spendTime() {
        Duration duration = Duration.ofMinutes(30).multipliedBy(seriesCount);
        System.out.printf("watching %d series of %s for %s\n", seriesCount, name, DurationUtils.format(duration));
        return duration;
    }
}
