package H10.HW;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
        System.out.println(personGreet());
    }
}
