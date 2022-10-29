import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertFalse;


class urinalsTest{

    @Test
    @DisplayName("====== Shivanjay Wagh == GoodString Method ---> Empty string test =======")
    void is_Empty_String() {
        boolean check = urinals.goodString(" ");
        assertFalse(check);
    }
}