package interfaceQuiz;

import java.util.Random;

public class RandomGeneraor {

	public static String [] names = {"David","John","Paul","Mark","James","Andrew","Scott","Steven","Robert","Stephen",
		                             "William","Craig","Michael","Stuart","Christopher","Alan","Colin","Brian","Kevin",
		                             "Gary","Richard","Derek","Martin","Thomas","Neil","Barry","Ian","Jason","Iain","Gordon",
		                             "Alexander","Graeme","Peter","Darren","Graham","George","Kenneth","Allan","Simon",
		                             "Douglas","Keith","Lee","Anthony","Grant","Ross","Jonathan","Gavin","Nicholas","Joseph",
		                             "Stewart","Daniel","Edward","Matthew","Donald","Fraser","Garry","Malcolm","Charles",
		                             "Duncan","Alistair","Raymond","Philip","Ronald","Ewan","Ryan","Francis","Bruce","Patrick",
		                             "Alastair","Bryan","Marc","Jamie","Hugh","Euan","Gerard","Sean","Wayne","Adam","Calum",
		                             "Alasdair","Robin","Greig","Angus","Russell","Cameron","Roderick","Norman","Murray","Gareth",
		                             "Dean","Eric","Adrian","Gregor","Samuel","Gerald","Henry","Justin","Benjamin","Shaun","Callum",
		                             "Campbell","Frank","Roy","Timothy","David","John","Paul","James","Mark","Scott","Andrew",
		                             "Steven","Robert","Stephen","Craig","Christopher","Alan","Michael","Stuart","William","Kevin",
		                             "Colin","Brian","Derek","Neil","Richard","Gary","Barry","Martin"};
	public static Random rand = new Random();
	
	public static String getRandomName()	
	{
	    return (names [ rand.nextInt(names.length)]);
		
	}
	
	
	public static int [] getRandomGrades()	
	{
		int [] arr = new int[rand.nextInt(4)+ 3];
		
		for (int i=0 ;i< arr.length;i++)
		{
			arr[i]= rand.nextInt(60)+40;
		}
	    return arr;
		
	}
	
}
