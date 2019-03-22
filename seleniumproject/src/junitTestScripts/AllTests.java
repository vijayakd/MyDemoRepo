package junitTestScripts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitSignInTestScriptsBcAcChrome.class,junitCloseBrowser.class})
public class AllTests {

}
