

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTamGiacDeu() {
        assertEquals("tam giác đều", TriangleClassifier.classify(2, 2, 2));
    }

    @Test
    void testTamGiacCan() {
        assertEquals("tam giác cân", TriangleClassifier.classify(2, 2, 3));
    }

    @Test
    void testTamGiacThuong() {
        assertEquals("tam giác thường", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    void testKhongPhaiTamGiac1() {
        assertEquals("không phải tam giác", TriangleClassifier.classify(8, 2, 3));
    }

    @Test
    void testKhongPhaiTamGiac2() {
        assertEquals("không phải tam giác", TriangleClassifier.classify(-1, 2, 1));
    }

    @Test
    void testKhongPhaiTamGiac3() {
        assertEquals("không phải tam giác", TriangleClassifier.classify(0, 1, 1));
    }
}
