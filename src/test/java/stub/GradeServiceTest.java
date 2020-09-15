package stub;


import mock.SecurityCenter;
import mock.mockDoorPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeService gradeService;

    @BeforeEach
    public void setUp() {
        StubGradeSystem stubGradeSystem = new StubGradeSystem();
        gradeService = new GradeService(stubGradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

        Assertions.assertEquals(92.0, gradeService.calculateAverageGrades(222L));
    }
}