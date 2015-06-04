import static java.lang.System.out;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;



public class InputHelper {
	public MadLib myMadLib = new MadLib(); //chooses random sentance
	public String[] sentanceArray = myMadLib.MadLib(); //converts sentance to array
	public String inputLine = null; 
	public int temp;
	public String currentCategory;
	public static List<String> categories = new ArrayList<String>();

	public InputHelper() {
		System.out.println("Welcome to Mad Libs(R)!"); 
		System.out.println("I'm going to ask you for some lexical categories");
		System.out.println("and when I'm all done, I'll give you the Mad Lib(R).");

		//creates arrayList with all the categories in the sentance that need to be filled
		
		for(int iter = 0; iter < sentanceArray.length; iter++) { 
			if(sentanceArray[iter].contains("adjectiveFillIn")) {
				categories.add("adjectiveFillIn");

			} else if(sentanceArray[iter].contains("nounFillIn")){
				categories.add("nounFillIn");
			} else if(sentanceArray[iter].contains("verbFillIn")){
				categories.add("verbFillIn");
			}
		}

		//Iterates through the categories arraylist randomly to ask user for categories
		//Relies on outputRequest to communicate with user and replace value within array
			//that holds current sentacne
		Random randomVar = new Random();
		int index;
		while(!categories.isEmpty()){
			temp = 0;
			index = randomVar.nextInt(categories.size());
			currentCategory = categories.get(index);
			if(currentCategory.contains("adjectiveFillIn")) {
				System.out.print("Enter an adjective" + ": ");
				outputRequest();
			} else if(currentCategory.contains("nounFillIn")){
				System.out.print("Enter a noun" + ": ");
				outputRequest();
			} else if(currentCategory.contains("verbFillIn")){
				System.out.print("Enter a verb" + ": ");
				outputRequest();
			}
			categories.remove(currentCategory);
		}

		//creates a string combining original sentance and user inputs
		String outputVar = "";
		for(String iter2: sentanceArray) {
			outputVar += " ";
			outputVar += iter2;
		}
		System.out.println(outputVar);
		
	}

	//request user input
	public void outputRequest(){
		try {
			BufferedReader is = new BufferedReader ( new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0 ) { 
				System.out.println("null");
			} else {
				//replaces the gaps in the current sentance with the user's input based on category
				for(int val = 0; val < sentanceArray.length && temp < 1 ; val++) { 		
					if(sentanceArray[val].contains(currentCategory)){
						sentanceArray[val] = inputLine;
						temp++; 
					}
				}
			}
		} 
		catch (IOException e) {
			System.out.println("IOException: " + e); 
		}
	}

}