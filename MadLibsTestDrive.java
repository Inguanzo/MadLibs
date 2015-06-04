import static java.lang.System.out;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MadLibsTestDrive {
	public static void main (String[] args) { 
		MadLib myMadLib = new MadLib();

		String[] sent1 = "nounFillIn loves to verbFillIn at the gymn because thats where nounFillIn is the most adjectiveFillIn.".split(" ");
		String[] sent2 = "You are a adjectiveFillIn nounFillIn and you have a adjectiveFillIn nounFillIn.".split(" ");
		String[] sent3 = "nounFillIn will have a adjectiveFillIn day at the park if nounFillIn goes too".split(" ");
		String[] sent4 = "Don't verbFillIn before you verbFillIn otherwise you will get sick".split(" ");
		String[] sent5 = "Always be a adjectiveFillIn person so that you have a adjectiveFillIn life".split(" ");

		String testResult = "false"; 

		//make sure a sentace was chose in MabLib
		if(myMadLib.MadLib().length > 0) {
					testResult = "true"; 
		}
		System.out.println("sentance chosen? " + testResult);
		System.out.println("First word is: " + myMadLib.MadLib()[0]);

		//make sure requiring at least 1 part of speech from the user
		List<String> inputHelper = InputHelper.categories;
		if(inputHelper.contains("adjectiveFillIn") || inputHelper.contains("verbFillIn") || inputHelper.contains("nounFillIn")) {
			 testResult = "true"; 
		}
			System.out.println("Madlib requires appropriate part of speech? " + testResult); 
	}
}