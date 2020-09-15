package stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StubGradeSystem extends GradeSystem {
    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(90.0, 92.0, 94.0);
    }
}
