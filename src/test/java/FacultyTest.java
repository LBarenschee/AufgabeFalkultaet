import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {

    @Test
    void facultyZero() {
        assertEquals(1, Faculty.facultyWhile(0));
    }
    @Test
    void facultyOne() {
        assertEquals(1, Faculty.facultyWhile(1));
    }
    @Test
    void facultyThree() {
        assertEquals(6, Faculty.facultyWhile(3));
    }
}