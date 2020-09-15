package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.when;

public class GradeServiceTest {

    GradeService gradeService;
    GradeSystem gradeSystem;

    @BeforeEach
    public void setup() {
        gradeSystem = Mockito.mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
    }

    @Test
    public void should_return_average_80() {
        when(gradeSystem.gradesFor(22)).thenReturn(Arrays.asList(80.0, 80.0, 80.0));
        double result = gradeService.calculateAverageGrades(22);
        Assertions.assertEquals(80.0, result);
    }
}
