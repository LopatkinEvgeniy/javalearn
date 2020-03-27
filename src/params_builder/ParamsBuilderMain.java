package params_builder;

public class ParamsBuilderMain {
    public static void main(String[] args) {
        Programmer programmer = new Programmer.Builder()
                .name("Eugene")
                .language("java")
                .age(28)
                .build();

        System.out.println(programmer.toString());
    }
}
