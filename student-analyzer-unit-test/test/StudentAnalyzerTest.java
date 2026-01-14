import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

public class StudentAnalyzerTest {

    // ===============================
    // Test cho countExcellentStudents
    // ===============================

    @Test
    public void testCountExcellentStudents_MixedScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2,
                analyzer.countExcellentStudents(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                )
        );
    }

    @Test
    public void testCountExcellentStudents_AllExcellent() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(3,
                analyzer.countExcellentStudents(
                        Arrays.asList(8.0, 8.5, 9.5)
                )
        );
    }

    @Test
    public void testCountExcellentStudents_NoExcellent() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
                analyzer.countExcellentStudents(
                        Arrays.asList(5.0, 6.5, 7.9)
                )
        );
    }

    @Test
    public void testCountExcellentStudents_OnlyInvalidScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
                analyzer.countExcellentStudents(
                        Arrays.asList(-2.0, 11.0, 20.0)
                )
        );
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    // ===============================
    // Test cho calculateValidAverage
    // ===============================

    @Test
    public void testCalculateValidAverage_MixedScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                ),
                0.01
        );
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.0,
                analyzer.calculateValidAverage(
                        Arrays.asList(7.0, 8.0, 9.0)
                ),
                0.01
        );
    }

    @Test
    public void testCalculateValidAverage_SingleValidScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(9.0,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, -1.0, 15.0)
                ),
                0.01
        );
    }

    @Test
    public void testCalculateValidAverage_NoValidScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0,
                analyzer.calculateValidAverage(
                        Arrays.asList(-3.0, 11.0, 20.0)
                ),
                0.01
        );
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0,
                analyzer.calculateValidAverage(Collections.emptyList()),
                0.01
        );
    }
}
