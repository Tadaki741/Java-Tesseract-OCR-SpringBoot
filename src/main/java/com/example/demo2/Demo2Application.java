package com.example.demo2;

import net.sourceforge.tess4j.Tesseract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {


	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Bean
	Tesseract getTesseract(){
		Tesseract tesseract = new Tesseract();
		tesseract.setDatapath("C:\\Users\\tadak\\Downloads\\demo2\\demo2\\src\\main\\resources\\data\\tessdata\\tessdata");
		return tesseract;
	}

}
