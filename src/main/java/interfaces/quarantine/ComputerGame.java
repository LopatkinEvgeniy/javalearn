package interfaces.quarantine;

import interfaces.utils.DurationUtils;

import java.time.Duration;

public class ComputerGame implements TimeSpender {
    public enum Type {
        STRATEGY,
        ACTION,
        ARCADE
    }

    private String name;
    private Type type;

    public ComputerGame(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Duration spendTime() {
        Duration duration;

        switch (type) {
            case ACTION:
                duration = Duration.ofHours(1);
                break;
            case ARCADE:
                duration = Duration.ofMinutes(30);
                break;
            case STRATEGY:
                duration = Duration.ofHours(2);
                break;
            default:
                duration = Duration.ZERO;
        }

        System.out.println("playing in " + name + " for " + DurationUtils.format(duration));
        return duration;
    }
}
