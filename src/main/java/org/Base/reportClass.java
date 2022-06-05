package org.Base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import net.masterthought.cucumber.ReportBuilder;

public class reportClass {
public static void generateJVMReport(String json) {
	//File Loc------------where need to store
	File loc=new File("target\\jvm"); 
	Configuration c=new Configuration(loc, "medical");
	c.addClassifications("BrowserName","Chrome");
	c.addClassifications("BrowserVersion","100");
	c.addClassifications("Os","win 11");
	c.addClassifications("Sprint","26");
	List<String>li=new LinkedList<String>();
	li.add(json);
	ReportBuilder r=new ReportBuilder(li, c);
	r.generateReports();
	
}}