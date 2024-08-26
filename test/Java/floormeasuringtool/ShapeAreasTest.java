package floormeasuringtool;

import static org.junit.jupiter.api.Assertions.*;

class ShapeAreasTest {

    @org.junit.jupiter.api.Test
    void oneParameter() {
        var area = new ShapeAreas();
        assertEquals(2827.4333882308138, area.oneParameter("C", 30.0f));
        assertEquals(2025.00, area.oneParameter("S", 45.0f));

    }

    @org.junit.jupiter.api.Test
    void twoParameter() {
        ShapeAreas area = new ShapeAreas();
        assertEquals(2250.0, area.twoParameter("R", 45.0f, 50.0f));
        assertEquals(462.50, area.twoParameter("T", 25.0f, 37.0f));
    }
}