
**you have to dowload and extract the whole folder into oracle to run the program**

through github
- download as zip directly
- extract the folder files
- navigate to your eclipse workspace
- open the java files in Oracle

through github - 2
- open git. if you don't have git, type in "install git" in google
- (WINDOWS) open command line
- (MACOS) open terminal
- navigate to your eclipse workspace directory
- type 'git clone ' (copy and paste the github link from the google doc and put that where '' is)

(easier) through google drive
- download the folder
- extract the folder files
- navigate to your eclipse workspace
- open the java files in Oracle

**after it is run, the bot is intuitive and you can figure out most capabilities just from using :)**

Check out the attached flow diagram to see the full capabilities of the bot.

This bot will give the user suggestions on what to listen to, either podcasts or music.
There are two categories of podcasts, political and comedic.
There are five categories of music, rap, country, oldies, rock, and pop.

After you make your first choice, the bot will give you the option to get another suggestion. 
If you navigate back to the category that you just picked, you will get a 2nd suggestion in that category.
Every category has 2 suggestions inside. 
If you navigate back to the category a third time, the bot will redirect you back to a chooser as it does not have any more suggestions in that category.

Lastly, I added a little personality to the bot. After the first iteration, the bot will request that you use precise polite language. If you do not, and you ignore the bot three times in a row, on the fourth invalid input, the bot will quit. 

Across the application if the user makes more than 3 input mistakes in a row, the bot will quit with sass. Across the application, if the user enters 'stop', 'no', or 'exit' the bot will exit amicably.

** class principles uses **
I use several if/elsif/else statements to help hte bot decide what to do with user inputs
I have a bot created with a constructor and a second supplementary class to add the capability to give the user more suggestions.
The constructor takes user input to define the type of bot that is engaged and thus what suggestion they get.
I integrated static integer variables as counters so that the program can count the number of times each category is accessed. this allows me to control what happens if the user returns to the same category several times.

