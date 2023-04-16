package TestBase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class IAnnot implements IAnnotationTransformer {
	
	public void transform() {
		
	}

	@Override
	public void transform(ITestAnnotation args1, Class args2, Constructor args3, Method args4) {
		IRetryAnalyzer analyzer = args1.getRetryAnalyzer();
		if(analyzer==null) {
			args1.setRetryAnalyzer(RetryFailed.class);
		}
		
	}

}
