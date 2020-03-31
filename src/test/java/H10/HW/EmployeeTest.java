package H10.HW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void greetTest() {
        Employee emp = new Employee("Jan", 23);
        assertEquals("Jan", emp.getNaam());
    }
}