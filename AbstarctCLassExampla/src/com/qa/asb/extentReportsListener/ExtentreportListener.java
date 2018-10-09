package com.qa.asb.extentReportsListener;

import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.etsi.uri.x01903.v13.GenericTimeStampType;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.IReporter;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ReporterType;
import com.relevantcodes.extentreports.model.Test;

public abstract class ExtentreportListener implements IReporter{

	private ExtentReports extent;
	
	public void generatereport(List <XmlSuite>Xmlsuites,List<ISuite>suites,String outputDirectory)
	{
		extent=new ExtentReports(outputDirectory +File.separator +"ASB.html", true);
		
		for(ISuite suite:suites)
		{
			Map<String, ISuiteResult> result= suite.getResults();
			
			for(ISuiteResult r:result.values())
			{
				ITestContext conteext=r.getTestContext();
				
				buidTestNodes(conteext.getPassedTests(), LogStatus.PASS);
				
			}
		}
		extent.flush();
		extent.close();
					
}
	void buidTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test = null;
		
		if(tests.size() >0) {
			for(ITestResult result: tests.getAllResults()) {
				test=extent.startTest(result.getMethod().getMethodName());
				
				//test.setStartedTime(GenericTimeStampType(results.gets));
				
				for(String group: result.getMethod().getGroups())
					test.assignCategory(group);
				
				if(result.getThrowable()!= null)
				{
					test.log(status, result.getThrowable());
				}else
				{
					test.log(status,"test"+status.toString().toLowerCase()+"ed");				}
			}
			extent.endTest(test);
		}
		
	}




private Date gettime()
{
	Calendar calender=Calendar.getInstance();
	long millis = 0;
	calender.setTimeInMillis(millis);
	return calender.getTime();
}
@Override
public void addTest(Test arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void flush() {
	// TODO Auto-generated method stub
	
}
@Override
public void setTestRunnerLogs() {
	// TODO Auto-generated method stub
	
}

	
@Override
public void stop() {
	// TODO Auto-generated method stub
	
}
public void start(Reporter arg0) {
	// TODO Auto-generated method stub
	
}
public void start(ReporterType arg0) {
	// TODO Auto-generated method stub
	
}
}