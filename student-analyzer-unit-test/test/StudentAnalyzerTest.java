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
                                                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
        }

        @Test
        public void testCountExcellentStudents_AllExcellent() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(3,
                                analyzer.countExcellentStudents(
                                                Arrays.asList(8.0, 8.5, 9.5)));
        }

        @Test
        public void testCountExcellentStudents_NoExcellent() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0,
                                analyzer.countExcellentStudents(
                                                Arrays.asList(5.0, 6.5, 7.9)));
        }

        @Test
        public void testCountExcellentStudents_OnlyInvalidScores() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0,
                                analyzer.countExcellentStudents(
                                                Arrays.asList(-2.0, 11.0, 20.0)));
        }

        @Test
        public void testCountExcellentStudents_EmptyList() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        }

        @Test
        public void testCountExcellentStudents_BoundaryValues() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(1,
                                analyzer.countExcellentStudents(Arrays.asList(10.0, 7.99)));
        }

        @Test
        public void testCountExcellentStudents_NullList() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0, analyzer.countExcellentStudents(null));
        }

        @Test
        public void testCountExcellentStudents_WithZero() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(1,
                                analyzer.countExcellentStudents(Arrays.asList(0.0, 8.0)));
        }

        @Test
        public void testCountExcellentStudents_JustBelowExcellent() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0,
                                analyzer.countExcellentStudents(Arrays.asList(7.999)));
        }

        @Test
        public void testCountExcellentStudents_JustAboveTen() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0,
                                analyzer.countExcellentStudents(Arrays.asList(10.01)));
        }

        @Test
        public void testCountExcellentStudents_JustAboveExcellent() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(1,
                                analyzer.countExcellentStudents(Arrays.asList(8.001)));
        }

        @Test
        public void testCountExcellentStudents_JustBelowZero() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0,
                                analyzer.countExcellentStudents(Arrays.asList(-0.01)));
        }

        @Test
        public void testCountExcellentStudents_JustBelowTen() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(1,
                                analyzer.countExcellentStudents(Arrays.asList(9.999)));
        }

        @Test
        public void testCountExcellentStudents_MultipleBoundaryValues() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(2,
                                analyzer.countExcellentStudents(
                                                Arrays.asList(0.0, 7.999, 8.0, 10.0, 10.001)));
        }

        @Test
        public void testCountExcellentStudents_ListWithNullScore() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(1,
                                analyzer.countExcellentStudents(Arrays.asList(null, 8.5)));
        }

        @Test
        public void testCountExcellentStudents_AllNullScores() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0,
                                analyzer.countExcellentStudents(Arrays.asList(null, null, null)));
        }

        @Test
        public void testCountExcellentStudents_NullInvalidAndNonExcellent() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0,
                                analyzer.countExcellentStudents(Arrays.asList(null, -1.0, 7.5)));
        }

        // ===============================
        // Test cho calculateValidAverage
        // ===============================

        @Test
        public void testCalculateValidAverage_MixedScores() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(8.17,
                                analyzer.calculateValidAverage(
                                                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_AllValid() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(8.0,
                                analyzer.calculateValidAverage(
                                                Arrays.asList(7.0, 8.0, 9.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_SingleValidScore() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(9.0,
                                analyzer.calculateValidAverage(
                                                Arrays.asList(9.0, -1.0, 15.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_NoValidScores() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0.0,
                                analyzer.calculateValidAverage(
                                                Arrays.asList(-3.0, 11.0, 20.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_EmptyList() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0.0,
                                analyzer.calculateValidAverage(Collections.emptyList()),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_InvalidBeforeValid() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(8.0,
                                analyzer.calculateValidAverage(Arrays.asList(-1.0, 8.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_NullList() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0.0, analyzer.calculateValidAverage(null), 0.01);
        }

        @Test
        public void testCalculateValidAverage_ListWithNullScore() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(8.5,
                                analyzer.calculateValidAverage(Arrays.asList(null, 8.5)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_BoundaryZeroAndTen() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(5.0,
                                analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_JustAboveTen() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0.0,
                                analyzer.calculateValidAverage(Arrays.asList(10.01)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_SingleBoundaryValue() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(8.0,
                                analyzer.calculateValidAverage(Arrays.asList(8.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_JustAboveZero() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0.01,
                                analyzer.calculateValidAverage(Arrays.asList(0.01)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_JustBelowZero() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0.0,
                                analyzer.calculateValidAverage(Arrays.asList(-0.01)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_JustBelowTen() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(9.999,
                                analyzer.calculateValidAverage(Arrays.asList(9.999)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_JustAboveExcellent() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(8.001,
                                analyzer.calculateValidAverage(Arrays.asList(8.001)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_MultipleBoundaryValues() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(6.0,
                                analyzer.calculateValidAverage(
                                                Arrays.asList(0.0, 7.999, 10.0)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_AllBoundaryAndInvalidMixed() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(6.0,
                                analyzer.calculateValidAverage(
                                                Arrays.asList(-1.0, 0.0, 8.0, 10.0, 10.5)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_AllNullScores() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(0.0,
                                analyzer.calculateValidAverage(Arrays.asList(null, null, null)),
                                0.01);
        }

        @Test
        public void testCalculateValidAverage_NullInvalidAndNonExcellent() {
                StudentAnalyzer analyzer = new StudentAnalyzer();
                assertEquals(7.5,
                                analyzer.calculateValidAverage(Arrays.asList(null, -1.0, 7.5)),
                                0.01);
        }
}
