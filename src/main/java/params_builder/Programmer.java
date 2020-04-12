package params_builder;

import java.text.MessageFormat;

public class Programmer {
    private final String name;
    private final String language;
    private final int age;

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return MessageFormat.format("Programmer(name={0} language={1} age={2})", name, language, age);
    }

    private Programmer(Builder b) {
        this.name = b.name;
        this.language = b.language;
        this.age = b.age;
    }

    public static class Builder {
        private String name;
        private String language;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Programmer build() {
            return new Programmer(this);
        }
    }
}
