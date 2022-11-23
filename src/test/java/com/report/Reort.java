package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reort {
	
	public void jvmReport(String jsonfile) {
		
		File filedirec = new File(System.getProperty("user.dir")+"\\target");
			
		Configuration config = new Configuration(filedirec, "AdactinAutomation");

		config.addClassifications("Platform", "windows");
		config.addClassifications("version","10");

		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder repo = new ReportBuilder(jsonfiles, config);
		repo.generateReports();
		}
		}