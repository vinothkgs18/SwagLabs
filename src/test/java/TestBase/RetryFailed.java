package TestBase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class RetryFailed implements IRetryAnalyzer {
	private int retryCount=0;
	private int retryMaxCount=2;

	@Override
	public boolean retry(ITestResult args) {
		// TODO Auto-generated method stub
		
		if(retryCount<retryMaxCount) {
			retryCount++;
			return true;
		}
		return false;
	}

}
