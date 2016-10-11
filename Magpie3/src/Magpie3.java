public class Magpie3 {

	//Get a default greeting and return a greeting
	public String getGreeting() {
		return "Hello, let's talk.";
	}
	
	/*
	 * done 1) Copy and paste the code you wrote in Magpie 2 into the getResponse method
	 * 
	 * done 2) Then *change* getResponse to use .findKeyword(String statement,String keyword) instead of .findKeyword(statement, (String keyword)	 
	 *  
	 * done 3) Copy and paste the 2 new noncommittal responses you wrote in part 2 into getRandomResponse();
	 * 
	 * 4) Use the code to complete the tracing in the handout.
	 * 
	 */

	/**
	 * Gives a response to a user statement
	 * takes in user statement
	 * response based on the rules given
	 */
	
	
	public String getResponse(String statement) {
		String response = "";
		if (findKeyword(statement, "no") >= 0) {
			response = "Why so negative?";
		} else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0) {
			response = "Tell me more about your family.";
			
		} else if(findKeyword(statement, "Mr.Paul") >= 0
				|| findKeyword(statement, "Ms.Dreyer") >= 0
				|| findKeyword(statement, "Ms.Tutaj") >= 0
				|| findKeyword(statement, "Ms.Alberta") >= 0
				|| findKeyword(statement, "Ms.Ronina") >= 0
				|| findKeyword(statement, "Ms.Liu") >= 0) {
			response = "Wow, your teacher must be amazing!";
			
		}else if(findKeyword(statement, "video games") >= 0){
			response = "I like battlefield, whats your favorite game?";
			
		}else if(findKeyword(statement, "cake") >= 0){
			response = "I love cake. I would eat it all day long!";
			
		}else if(findKeyword(statement, "boba") >= 0){
			response = "Where is your favorite place to get boba? I like Eggettes the most.";
			
		}else if(statement.length() == 0){
			response = "Come on, why don't you say something? :(";
			
		}else{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This
	 * method will check that the given goal is not a substring of a longer
	 * string (so, for example, "I know" does not contain "no").
	 * 
	 * parameter: statement
	 *            the string to search
	 * parameter: goal
	 *            the string to search for
	 * parameter: startPos
	 *            the character of the string to begin the search at
	 * return the index of the first occurrence of goal in statement or -1 if
	 *         it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf (goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0) {
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),
						psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (before.equals(" ") && after.equals(" ")) {
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This
	 * method will check that the given goal is not a substring of a longer
	 * string (so, for example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * takes in the string to search
	 * takes in the string to search for
	 * returns the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Origami is cool.";
		} else if (whichResponse == 5) {
			response = "I don't know what you are talking about.";
		} else if (whichResponse == 6) {
			response = "I like bacon!";
		}
		return response;	
	}
}
