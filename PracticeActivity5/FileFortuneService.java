package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService 
{
	private ArrayList<String> fortunes;
	private Random rand = new Random();
	
	public FileFortuneService()
	{
		fortunes = new ArrayList<String>();
		
		try
		{
			File myObj = new File("C:\\Users\\Joiney\\Desktop\\Eclipse\\spring-demo-two\\src\\fortuneTextfile");
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				fortunes.add(data);
			}
			
			myReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}

	@Override
	public String getFortune() 
	{
		int num = rand.nextInt(fortunes.size());
		
		return fortunes.get(num);
	}

}
