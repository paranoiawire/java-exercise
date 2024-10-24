package furniture.factory;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import furniture.factory.service.PrivateUnitTest;
import furniture.factory.service.SampleUnitTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   SampleUnitTest.class,
   PrivateUnitTest.class
})

public class UnitTestSuite {

}
