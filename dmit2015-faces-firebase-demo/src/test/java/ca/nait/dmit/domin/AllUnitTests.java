package ca.nait.dmit.domin;

import org.junit.platform.suite.api.*;
@Suite
@SuiteDisplayName("JUnit 5 Platform Suite")
@SelectPackages("ca.nait.dmit.domain")
@IncludeClassNamePatterns(".*Test")
@SelectClasses({BMITest.class, ChineseZodiacTest.class})
public class AllUnitTests
{
// the class remains completely empty,
// being used only as a holder for the above annotations
}