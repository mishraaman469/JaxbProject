package com.example.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadXmlBindApplication {

	public static void main(String[] args) throws Exception  {
		SpringApplication.run(ReadXmlBindApplication.class, args);
		File file =new File("C:\\Users\\M1064549\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\ReadXmlBind\\TEST-com.example.demo.controller.DemoControllerTest.xml");
		JAXBContext jaxbContext=JAXBContext.newInstance(Testsuite.class);
		Unmarshaller unmarsh=jaxbContext.createUnmarshaller();
		Testsuite test=(Testsuite) unmarsh.unmarshal(file);
		System.out.println(test);
	}

}
