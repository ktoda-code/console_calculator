package application.functions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogGeneratorTests {
    private LogGenerator lg;

    @BeforeEach
    void setUp() {
        this.lg = LogGenerator.getInstance();
    }

    @AfterEach
    void tearDown() {
        this.lg = null;
    }

    @Test
    void GetInstanceOfLogGeneratorWhenIsNew() {
        assertEquals(this.lg,LogGenerator.getInstance());
    }

    @Test
    void GetInstanceOfLogGeneratorWhenExisting() {
        LogGenerator expected = LogGenerator.getInstance();

        assertEquals(expected,this.lg);
    }
}