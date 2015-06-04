import static java.lang.System.out;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 

public class MadLib {
	public String[] MadLib () {
		//randomly chooses a sentance
		List<String> sentanceChoices = new ArrayList<String>();
		sentanceChoices.add("nounFillIn loves to verbFillIn at the gymn because thats where nounFillIn is the most adjectiveFillIn.");
		sentanceChoices.add("You are a adjectiveFillIn nounFillIn and you have a adjectiveFillIn nounFillIn.");
		sentanceChoices.add("nounFillIn will have a adjectiveFillIn day at the park if nounFillIn goes too");
		sentanceChoices.add("Don't verbFillIn before you verbFillIn otherwise you will get sick");
		sentanceChoices.add("Always be a adjectiveFillIn person so that you have a adjectiveFillIn life");

		Random randomVar = new Random();
		int index = randomVar.nextInt(sentanceChoices.size());
		String currentSentanceString = sentanceChoices.get(index);

		//converts this random sentance to an array
		String[] currentSentanceArray = currentSentanceString.split(" ");
		return currentSentanceArray;
	}
}