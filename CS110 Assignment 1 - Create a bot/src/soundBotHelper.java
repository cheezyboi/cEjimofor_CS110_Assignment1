import java.util.Scanner;

public class soundBotHelper {

	public static int mistakeCount = 0;

	/* give user more suggestions method */
	public soundBotHelper() {
		if (SoundBot.count > 0) {
			soundBotHelper.newOptions();
		}
	}
	static void newOptions() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("\n----------------------------------------------------");
		System.out.println("\nWould you like any other listening suggestions? (yes/no)");
		String moreFun = input.nextLine();
		soundBotHelper.moreSuggestionsResponse(moreFun);
	}
	static void moreSuggestionsResponse(String moreFun) {
		if (moreFun.equalsIgnoreCase("yes")) {
			soundBotHelper.giveMoreSuggestions();
		} else if (moreFun.equalsIgnoreCase("no")) {
			SoundBot.exit();
		} else {
			soundBotHelper.getSuggestionInput();
		}
	}
	private static void getSuggestionInput() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("\nEither you misspelled something or you chose something ouside of your options.");
		System.out.println("Please enter either 'yes' if you want more suggestions.");
		System.out.println("Enter 'no' want to sit back enjoy the gift I've already given.");
		String moreFun = input.nextLine();
		soundBotHelper.moreSuggestionsResponse(moreFun);
	}
	public static void giveMoreSuggestions() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String soundType1 = SoundBot.soundType;
		System.out.println("\nNice! I've got more for you then!");
		if ((soundType1.equalsIgnoreCase("podcast")) ||
		    (soundType1.equalsIgnoreCase("podcasts"))) {
			System.out.println("\n----------------------------------------------------");
			System.out.println("What are you interested in next? Another podcast suggestion?");
			System.out.println("Or would you like to evaluate my exquisite taste in music?");
		} else if (soundType1.equalsIgnoreCase("music")) {
			System.out.println("\n----------------------------------------------------");
			System.out.println("What are you interested in next? Another song suggestion?");
			System.out.println("Or would you like to evaluate my acute taste in podcasts?");
		} else {
			System.out.println("\n----------------------------------------------------");
			System.out.println("What are you interested in next? My exquisite taste in music?");
			System.out.println("Or my acute taste in podcasts?");
		}
		String soundType2 = input.nextLine();
		soundBotHelper.newValidSoundEntryCheck(soundType2);
	}
	private static void sass() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		if (mistakeCount == 1) {
			System.out.println("\nAsk politely this time! Who taught you your manners...");
			System.out.println("I'll accept 'podcast please' or 'music please'.");
			System.out.println("p.s. you could also enter 'music' or 'podcast' like before...");
			System.out.println("Otherwise, you've got to go :P");
			String soundType2 = input.nextLine();
			soundBotHelper.newValidSoundEntryCheck(soundType2);
		} else if (mistakeCount == 2) {
			System.out.println("\nI'M SERIOUS. This is your last chance.");
			System.out.println("'podcast please' or 'music please' are your options");
			System.out.println("p.s. you could also enter 'music' or 'podcast' like before...");
			System.out.println("Otherwise, bye bye :|");
			String soundType2 = input.nextLine();
			soundBotHelper.newValidSoundEntryCheck(soundType2);
		} else if (mistakeCount == 3) {
			System.out.println("\nYou caught me. That first threat was a bluff.");
			System.out.println("But if you do it again, I'm seriously quitting.");
			System.out.println("READ ------> 'podcast please' or 'music please' are your best options!!!");
			System.out.println("p.s. you could also enter 'music' or 'podcast' like before...");
			String soundType2 = input.nextLine();
			soundBotHelper.newValidSoundEntryCheck(soundType2);
		} else {
			SoundBot.sassExit();
		}
	}
	private static void newValidSoundEntryCheck(String type) {
		if ((type.equalsIgnoreCase("podcast")) ||
				(type.equalsIgnoreCase("podcast please")) ||
				(type.equalsIgnoreCase("podcasts please")) ||
				(type.equalsIgnoreCase("music")) ||
				(type.equalsIgnoreCase("music please")) ||
				(type.equalsIgnoreCase("podcasts")) ||
		    (type.equalsIgnoreCase("stop")) ||
		    (type.equalsIgnoreCase("no")) ||
		    (type.equalsIgnoreCase("exit"))) {
			if (mistakeCount >= 2) {
				System.out.println("\nFINALLY. Thank you :)");
				mistakeCount = 0;
			}
			SoundBot soundBot2 = new SoundBot(type);
			soundBot2.setSoundType(type);
			SoundBot.giveSoundOutput();
			} else {
				mistakeCount++;
				soundBotHelper.sass();
				}
		}
}
