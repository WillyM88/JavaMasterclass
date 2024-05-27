public class Main {
    public static void main(String[] args) {

        Dog rex = new Dog();

        // static methods do not use either instance field or instance method.
        rex.bark();

    }
}