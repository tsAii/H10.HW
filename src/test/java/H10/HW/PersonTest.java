package H10.HW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    void greet() {
        Person p = new Person("Kees", 30);
        System.out.println(p.greet());
    }

    @Test
    void testPerson() {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday(); // person gets one year older
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders);
    }

    @Test
    void testOldPerson() {
        Person p = new Person("Jan", 129);
        p.haveBirthday();
        assertThrows(PersonHasDiedException.class, p::haveBirthday);

    }

    @Test
    void testH8() {
        Person p = new Person("Jan", 129);
        Person q = new Person("Jan", 129);
        //assertEquals("", p.toString());
        assertEquals(true, p.equals(q));
    }

}
