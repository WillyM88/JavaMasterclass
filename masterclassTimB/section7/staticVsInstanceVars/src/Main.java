public class Main {
    public static void main(String[] args) {
        // static keyword means that all instances of a class share the same variable
        // of changes are made to that variable then all instances have it changed.
        // they are similar to a constant. Except it is for all instances of a class.
        // Here is the example of how they work:

        Dog rex = new Dog("Rex", "Thor");
        Dog fluffy = new Dog("Fluffy", "Kimmy");
        rex.printName();
        fluffy.printName();
        rex.printNickName();
        fluffy.printNickName();
    }
}