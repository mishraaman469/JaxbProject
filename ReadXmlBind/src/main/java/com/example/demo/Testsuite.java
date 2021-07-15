package com.example.demo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="testsuite")
public class Testsuite {
	
	
		private List<Testcase> testcase;

		public Testsuite() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Testsuite(List<Testcase> testcase) {
			super();
			this.testcase = testcase;
		}

		public List<Testcase> getTestcase() {
			return testcase;
		}

		public void setTestcase(List<Testcase> testcase) {
			this.testcase = testcase;
		}

		@Override
		public String toString() {
			return "Testsuite [ testcase= " + testcase + "]";
		}

		
	
		

		
		
		
}
