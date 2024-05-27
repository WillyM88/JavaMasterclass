public class Dog {

    private static String name;

    private String nickName;

    public Dog(String name, String nickName) {
        // notice we don't use "this.name" instead we use "Dog.name"
        Dog.name = name;
        this.nickName = nickName;
    }

    public void printName() {
        System.out.println("Name = " + name);
    }

    public void printNickName() {
        System.out.println("Nick name = " + this.nickName);
    }

}
