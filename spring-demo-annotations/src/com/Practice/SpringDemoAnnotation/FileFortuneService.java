package com.Practice.SpringDemoAnnotation;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private File file;
	private Random random;
	private List<String> arr;
	
	public FileFortuneService() {
		file = new File("hello.txt");
		random = new Random();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
			 arr = new ArrayList<>();
			for(String k = br.readLine(); k != null; k = br.readLine()) {
				arr.add(k);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public String getFortune() {
		return arr.get(random.nextInt(arr.size()));
	}

}
