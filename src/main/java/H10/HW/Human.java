package H10.HW;

public abstract class Human {

    String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    String greet() {
        return "Hello, my name is " + name + ". Nice to meet you!";
    }


}
