package local_imports;

import local_imports.speakers.GoodbyeSpeaker;
import local_imports.speakers.HelloSpeaker;

public class LocalImportsMain {
    public static void main(String[] args) {
        HelloSpeaker helloSpeaker = new HelloSpeaker();
        GoodbyeSpeaker goodbyeSpeaker = new GoodbyeSpeaker();

        helloSpeaker.speak();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("execution was interrupted " + e.getMessage());
            return;
        }

        goodbyeSpeaker.speak();
    }
}
