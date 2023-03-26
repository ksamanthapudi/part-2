package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CountATest.class, DivideTest.class, SquareTest.class })
public class AllTests {

}
