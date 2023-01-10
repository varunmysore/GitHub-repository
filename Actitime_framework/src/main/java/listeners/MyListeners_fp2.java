package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners_fp2 implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		String ScriptName = result.getMethod().getMethodName();
	}

}
