import java.util.Scanner;

public class SoundBot {

	/* bot attributes */
	public static String soundType;
	private static String musicType;
	public static String podcastType;
	
	/* method counters */
	/* count the amount of times each method is called */

	/* podcast counters */
	public static int count = 0;
	public static int polPodCount = 0;
	public static int comPodCount = 0;
	
	/* music counters */
	public static int countryCount = 0;
	public static int rapCount = 0;
	public static int rockCount = 0;
	public static int oldiesCount = 0;
	public static int popCount = 0;
	public static int chooserMistakeCount = 0;

	/* sound chooser methods */
	/* aka constructor */
	public SoundBot(String type) {
		count++;
		soundType = type;
	}
	public SoundBot() {
		count++;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Hello! My name is SoundBot and I'll be assisting you today!");
		System.out.println("Enter 'no' or 'stop' or 'exit' at anytime to if you want me to leave you alone.");
		System.out.println("What are you in the mood for listening-wise? Podcasts or music?");
		soundType = input.nextLine();
		SoundBot.validSoundEntryCheck();
	}
	private static void validSoundEntryCheck() {
		if ((soundType.equalsIgnoreCase("podcast")) || 
			(soundType.equalsIgnoreCase("podcast please")) || 
			(soundType.equalsIgnoreCase("podcasts please")) || 
			(soundType.equalsIgnoreCase("music")) ||
			(soundType.equalsIgnoreCase("music please")) || 
			(soundType.equalsIgnoreCase("podcasts")) || 
			(soundType.equalsIgnoreCase("stop")) || 
			(soundType.equalsIgnoreCase("no")) || 
			(soundType.equalsIgnoreCase("exit"))) {
			if (chooserMistakeCount >= 2) {
				System.out.println("\nFINALLY. Thank you :)");
				chooserMistakeCount = 0;
			}
			SoundBot.giveSoundOutput();
		} else {
			chooserMistakeCount++;
			SoundBot.getSoundInput();
		}
	}
	private static void getSoundInput() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		if (chooserMistakeCount == 1) { 
			System.out.println("\nUnfortunately, I can only give podcast and music suggestions.");
			System.out.println("Either you misspelled something or you chose something ouside of your options.");
			System.out.println("Please enter either 'podcast' or 'music' if you want a suggestion in either.");
			soundType = input.nextLine();
			SoundBot.validSoundEntryCheck();
		} else if (chooserMistakeCount == 2) {
			System.out.println("\nC'mon now. read the directions please...");
			System.out.println("Enter either 'podcast' or 'music' if you want a suggestion in either.");
			soundType = input.nextLine();
			SoundBot.validSoundEntryCheck();
		} else if (chooserMistakeCount == 3) {
			System.out.println("\nLAST CHANCE. follow the directions or I quit...");
			System.out.println("Enter 'podcast' or 'music' if you want a suggestion in either.");
			soundType = input.nextLine();
			SoundBot.validSoundEntryCheck();
		} else {
			SoundBot.sassExit();
		}
	}
	static void giveSoundOutput() {
		if ((soundType.equalsIgnoreCase("podcast")) || 
			(soundType.equalsIgnoreCase("podcast please")) ||
			(soundType.equalsIgnoreCase("podcasts please")) ||
			(soundType.equalsIgnoreCase("podcasts"))) {
			SoundBot.podChooser();
		} else if ((soundType.equalsIgnoreCase("music")) ||
				   (soundType.equalsIgnoreCase("music please"))) {
			SoundBot.musChooser();
		} else if ((soundType.equalsIgnoreCase("no")) || (soundType.equalsIgnoreCase("exit"))
				|| (soundType.equalsIgnoreCase("stop"))) {
			SoundBot.exit();
		} else {
			SoundBot.getSoundInput();
		}
	}

	/* podcast chooser methods */
	private static void podChooser() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("\nWhat type of podcast are you in the mood for then (Political or Comedic)?");
		podcastType = input.nextLine();
		SoundBot.validPodEntryCheck();
	}
	private static void validPodEntryCheck() {
		if ((podcastType.equalsIgnoreCase("Comedic")) || 
			(podcastType.equalsIgnoreCase("political")) || 
			(podcastType.equalsIgnoreCase("stop")) || 
			(podcastType.equalsIgnoreCase("exit")) ||
			(podcastType.equalsIgnoreCase("no"))) {
			if (chooserMistakeCount >= 2) {
				System.out.println("\nFINALLY. Thank you :)");
				chooserMistakeCount = 0;
			}
			SoundBot.givePodOutput();
		} else {
			chooserMistakeCount++;
			SoundBot.getPodInput();
		}
	}
	private static void getPodInput() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		if (chooserMistakeCount == 1) { 
				System.out.println("\nEither you misspelled or you chose something ouside of your options.");
				System.out.println("Please enter either 'political' or 'comedic' if you want a suggestion.");
				System.out.println("If you chillin, enter 'no' to exit this bot.");
				podcastType = input.nextLine();
				SoundBot.validPodEntryCheck();
			} else if (chooserMistakeCount == 2) {
				System.out.println("\nC'mon now. read the directions please...");
				System.out.println("Enter either 'political' or 'comedic' if you want a suggestion.");
				podcastType = input.nextLine();
				SoundBot.validPodEntryCheck();
			} else if (chooserMistakeCount == 3) {
				System.out.println("\nLAST CHANCE. follow the directions or I quit...");
				System.out.println("Enter 'political' or 'comedic' if you want a suggestion.");
				podcastType = input.nextLine();
				SoundBot.validPodEntryCheck();
			} else {
				SoundBot.sassExit();
		}
	}
	private static void givePodOutput() {
		if (podcastType.equalsIgnoreCase("political")) {
			SoundBot.politicPod();
			new soundBotHelper();
		} else if (podcastType.equalsIgnoreCase("Comedic")) {
			SoundBot.comedyPod();
			new soundBotHelper();
		} else if ((podcastType.equalsIgnoreCase("no")) || (podcastType.equalsIgnoreCase("exit"))
				|| (podcastType.equalsIgnoreCase("stop"))) {
			SoundBot.exit();
		}
	}
	private static void politicPod() {
		if (polPodCount == 1) {
			System.out.println("\nWhile not explicitely political, the Joe Rogan Experience is what you really need.");
			System.out.println("They talk about every thing on this podcast. Literally, everything.");
			System.out.println("http://podcasts.joerogan.net/");
			System.out.println("That's it for my political podcast suggestons!");
		} else if (polPodCount > 1) {
			System.out.println("\nSorry! I have no more suggestions in this category!");
		} else {
			System.out.println("\nCool! Check out 'The Fifth Element'.");
			System.out.println("I've found it to have an balanced view of perspectives.");
			System.out.println("http://thefiftheleminute.com/");
			System.out.println("Hope you like it!");
		}
		polPodCount++;
	}
	private static void comedyPod() {
		if (comPodCount == 1) {
			System.out.println("\nCool! Check out 'Brilliant Idiots'.");
			System.out.println("They always seem to have a cool range of topics on there!");
			System.out.println("https://soundcloud.com/thebrilliantidiots");
			System.out.println("\nHope you like it!");
		} else if (comPodCount > 1) {
			System.out.println("\nSorry! I have no more suggestions in this category!");
		} else {
			System.out.println("\nCheck out 'Bill Burr's Monday Morning Podcast'.");
			System.out.println("Bill is a professional comedian that riffs on the world for");
			System.out.println("an hour or so on Monday and Thursdays.");
			System.out.println("http://billburr.com/podcast-2/");
			System.out.println("\nThat's it for my comedy podcast suggestons!");
		}
		comPodCount++;
	}

	/* music chooser methods */
	private static void musChooser() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("\nWhat genre of music are you in the mood for then (country, rap, oldies, rock or pop)?");
		musicType = input.nextLine();
		SoundBot.validMusEntryCheck();
	}
	private static void validMusEntryCheck() {
		if ((musicType.equalsIgnoreCase("country")) || 
			(musicType.equalsIgnoreCase("rap")) || 
			(musicType.equalsIgnoreCase("oldies")) || 
			(musicType.equalsIgnoreCase("pop")) || 
			(musicType.equalsIgnoreCase("rock")) || 
			(musicType.equalsIgnoreCase("stop")) || 
			(musicType.equalsIgnoreCase("exit")) || 
			(musicType.equalsIgnoreCase("no"))) {
			if (chooserMistakeCount >= 2) {
				System.out.println("\nFINALLY. Thank you :)");
				chooserMistakeCount = 0;
			}
			SoundBot.giveMusOutput();
		} else {
			chooserMistakeCount++;
			SoundBot.getMusInput();
		}
	}
	private static void getMusInput() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		if (chooserMistakeCount == 1) { 
			System.out.println("\nEither you misspelled or you chose something ouside of your options.");
			System.out.println("Please enter either 'country', 'rap', 'oldies', 'pop', or 'rock'");
			System.out.println("if you want a suggestion.");
			System.out.println("If you chillin, enter 'no' to exit this bot.");
			musicType = input.nextLine();
			SoundBot.validMusEntryCheck();
			} else if (chooserMistakeCount == 2) {
			System.out.println("\nC'mon now. read the directions please...");
			System.out.println("Enter either 'country', 'rap', 'oldies', 'pop', or 'rock'");
			System.out.println("if you want a suggestion.");
			musicType = input.nextLine();
			SoundBot.validMusEntryCheck();
			} else if (chooserMistakeCount == 3) {
			System.out.println("\nLAST CHANCE. follow the directions or I quit...");
			System.out.println("Enter 'country', 'rap', 'oldies', 'pop', or 'rock' if you want a suggestion.");
			musicType = input.nextLine();
			SoundBot.validMusEntryCheck();
			} else {
			SoundBot.sassExit();
		}
	}
	private static void giveMusOutput() {
		if (musicType.equalsIgnoreCase("country")) {
			SoundBot.country();
			new soundBotHelper();
		} else if (musicType.equalsIgnoreCase("rap")) {
			SoundBot.rap();
			new soundBotHelper();
		} else if (musicType.equalsIgnoreCase("oldies")) {
			SoundBot.oldies();
			new soundBotHelper();
		} else if (musicType.equalsIgnoreCase("pop")) {
			SoundBot.pop();
			new soundBotHelper();
		} else if (musicType.equalsIgnoreCase("rock")) {
			SoundBot.rock();
			new soundBotHelper();
		} else if ((musicType.equalsIgnoreCase("no")) || 
				   (musicType.equalsIgnoreCase("exit")) || 
				   (musicType.equalsIgnoreCase("stop"))) {
			SoundBot.exit();
		}
	}
	private static void country() {
		if (countryCount == 1) {
		System.out.println("\nCool! Check out 'Lately' by Dan + Shay.");
		System.out.println("https://www.youtube.com/watch?v=sDvDS6hI4is");
		System.out.println("This is a country-er than my last suggestion. Hope it works!");
		System.out.println("\nThat's all for my country suggestions! Check my suggestions in other categories!");
		} else if (countryCount > 1) {
			System.out.println("\nSorry! I have no more suggestions in country :(");
		} else {
			System.out.println("\nAlright! Check out 'Say Something' by Justin Timberlake and Chris Stapleton.");
			System.out.println("https://www.youtube.com/watch?v=8MPbR6Cbwi4");
			System.out.println("It's slightly poppy but I think you'll like it!");
			System.out.println("\nCheck out my other suggestions!");
			System.out.println("SECRET: I have an second even better one for country :)");
			System.out.println("choose country again to hear it :)");
		}
		countryCount++;
	}
	private static void rap() {
		if (rapCount == 1) {
		System.out.println("\nCheck out 'River' by Eminem and Ed Sheeran.");
		System.out.println("https://www.youtube.com/watch?v=3BXDsVD6O10");
		System.out.println("Notice how good the chorus written by Ed Sheeran is.");
		System.out.println("\nForget rap, become more wholesome and check out more of Ed :)");
		System.out.println("That's all for my rap suggestions! Check my suggestions in other categories!");
		} else if (rapCount > 1) {
			System.out.println("\nSorry! I have no more suggestions in rap :(");
		} else {
			System.out.println("\nCool! Check out 'Stop It' by French Montana and T.I. It's lit.");
			System.out.println("https://www.youtube.com/watch?v=NKH3Kgou4YI");
			System.out.println("Hope you like it!");
			System.out.println("\nCheck out my other suggestions!");
			System.out.println("SECRET: I have an second even better one for rap :)");
			System.out.println("choose rap again to hear it :)");
		}
		rapCount++;
	}
	private static void oldies() {
		if (oldiesCount == 1) {
		System.out.println("\nCheck out 'You Can Call Me Al' by Paul Simon.");
		System.out.println("https://www.youtube.com/watch?v=uq-gYOrU8bA");
		System.out.println("CLASSIC.");
		System.out.println("\nThat's all for my oldies suggestions! Check my suggestions in other categories!");
		} else if (oldiesCount > 1) {
			System.out.println("\nSorry! I have no more suggestions in oldies :(");
		} else {
			System.out.println("Cool! Check out 'My Funny Valentine' by Frank Sinatra.");
			System.out.println("https://www.youtube.com/watch?v=Are-c0BLyIg");
			System.out.println("Love people with their insecurities, faults, and all!");
			System.out.println("\nCheck out my other suggestions!");
			System.out.println("SECRET: I have an second even better one for oldies :)");
			System.out.println("choose oldies again to hear it :)");
		}
		oldiesCount++;
	}
	private static void pop() {
		if (popCount == 1) {
		System.out.println("\nCheck out 'The Other Stripped' by Lauv.");
		System.out.println("https://www.youtube.com/watch?v=_JHhEh45FpA");
		System.out.println("if you don't appreciate this, idk what to tell you mate...");
		System.out.println("\nThat's all for my pop suggestions! Check my suggestions in other categories!");
		} else if (popCount > 1) {
			System.out.println("\nSorry! I have no more suggestions in pop :(");
		} else {
			System.out.println("\nPop music is trash. Get cultured with some 'Funeral March' by Frederic Chopin.");
			System.out.println("https://www.youtube.com/watch?v=Hgw_RD_1_5I");
			System.out.println("It's truly beautiful. You'll thank me later.");
			System.out.println("\nCheck out my other suggestions!");
			System.out.println("SECRET: to be fair, I do have a second legit suggestion for pop. check back. :)");
			System.out.println("choose pop again to hear it :)");
		}
		popCount++;
	}
	private static void rock() {
		if (rockCount == 1) {
			System.out.println("\nWARNING. 100% CHANCE OF A YOUTUBE BINGE IF YOU CHECK THIS OUT...");
			System.out.println("here it is if you have 5 hours to enjoy. Check out 'Cold Water' by Our Last Band.");
			System.out.println("https://www.youtube.com/watch?v=AJDCk_1SjBM");
			System.out.println("\nThat's all for my rock suggestions! Check my suggestions in other categories!");
			} else if (rockCount > 1) {
				System.out.println("\nSorry! I have no more suggestions in rock :(");
			} else {
			System.out.println("\nRevolutionary! Check out 'Too Good at Goodbyes' by Archetypes Collide.");
			System.out.println("https://www.youtube.com/watch?v=SFCyUQwSnMo");
			System.out.println("Coolest remix of a pop song I've ever heard.");
			System.out.println("\nCheck out my other suggestions!");
			System.out.println("p.s. if you like that, I have an even second even BETTER suggestion.");
			System.out.println("choose rock again to hear it :)");
			}
			rockCount++;
	}

	void setSoundType(String name) {
		soundType = name;
	}
	
	/* exit module method */
	public static void exit() {
		System.out.println("\nHave a good one then boss!");
		System.out.println("\n      * * * * * *    ");
		System.out.println("    *             *    ");
		System.out.println("  *     *     *     *  ");
		System.out.println(" *     ***   ***	     * ");
		System.out.println("*       *     *       *");
		System.out.println("*                     *");
		System.out.println(" *     *       *     * ");
		System.out.println("  *      *****      *  ");
		System.out.println("    *             *    ");
		System.out.println("      * * * * * *      ");
	}
	public static void sassExit() {
		System.out.println("\nEither you don't listen or you're just a bully.");
		System.out.println("BYE. You can come back when you decide to be nice.");
		System.out.println("\n      * * * * * *    ");
		System.out.println("    *             *    ");
		System.out.println("  *                 *  ");
		System.out.println(" *     ***   ***	     * ");
		System.out.println("*        *            *");
		System.out.println("*                     *");
		System.out.println(" *     **********    * ");
		System.out.println("  *                 *  ");
		System.out.println("    *             *    ");
		System.out.println("      * * * * * *      ");
	}
}
