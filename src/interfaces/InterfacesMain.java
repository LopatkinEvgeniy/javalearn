package interfaces;

import interfaces.quarantine.ComputerGame;
import interfaces.quarantine.Course;
import interfaces.quarantine.TelevisionSeries;
import interfaces.quarantine.TimeSpender;
import interfaces.utils.DurationUtils;

import java.time.Duration;

public class InterfacesMain {
    public static void main(String[] args) {
        TimeSpender[] spenders = {
                new ComputerGame("warcraft", ComputerGame.Type.STRATEGY),
                new ComputerGame("counter strike go", ComputerGame.Type.ACTION),
                new ComputerGame("pac-man", ComputerGame.Type.ARCADE),
                new TelevisionSeries("LOST", 3),
                new TelevisionSeries("game of thrones", 5),
                new Course("java", Duration.ofHours(2)),
                new Course("postgreSQL", Duration.ofHours(1)),
        };

        Duration totalDuration = Duration.ZERO;
        for (TimeSpender spender: spenders) {
            Duration duration = spender.spendTime();
            totalDuration = totalDuration.plus(duration);
        }

        System.out.println("total time spent: " + DurationUtils.format(totalDuration));
    }
}
