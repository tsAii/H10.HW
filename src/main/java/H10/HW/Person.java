package H10.HW;

public class Person extends Human {
    int age;
    Gender gender;

    public static final int numberOfPossibleGenders = 3;

    public Person() {
    }

    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }

    public Person(String name, int age, Gender gender) {
        super(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void haveBirthday() {
        if (this.age >= 130) throw new PersonHasDiedException();
        this.age++;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return (name + " (" + age + ") is " + gender);
    }

    public boolean equals(Person person) {
        if (this.name == person.name && this.age == person.age) return true;
        return false;
    }

    String personGreet() {
        return "I'm tired of working. This is inhuman!";
    }

    public String getNaam() {
        return this.name;
    }
}
