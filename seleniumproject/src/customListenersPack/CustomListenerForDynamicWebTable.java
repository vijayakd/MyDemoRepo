package customListenersPack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import screenShotsPack.FailedTcScreenShot;

public class CustomListenerForDynamicWebTable extends FailedTcScreenShot implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting TC===="+result.getMethod().getMethodName());		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(" TC Success ===="+result.getMethod().getMethodName());	
		try {
			failedTcScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("TC Failed ======="+result.getMethod().getMethodName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
System.out.println("TC Skipped ======"+result.getMethod().getMethodName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
