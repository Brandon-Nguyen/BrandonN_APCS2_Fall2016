
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
			
		} else if(statement.indexOf("Mr.Paul") >= 0
				|| statement.indexOf("Ms.Dreyer") >= 0
				|| statement.indexOf("Ms.Tutaj") >= 0
				|| statement.indexOf("Ms.Alberta") >= 0
				|| statement.indexOf("Ms.Ronina") >= 0
				|| statement.indexOf("Ms.Liu") >= 0) {
			response = "Wow, your teacher must be amazing!";
			
		}else if(statement.indexOf("video games") >= 0){
			response = "I like battlefield, whats your favorite game?";
			
		}else if(statement.indexOf("cake") >= 0){
			response = "I love cake. I would eat it all day long!";
			
		}else if(statement.indexOf("boba") >= 0){
			response = "Where is your favorite place to get it? I like Eggettes.";
			
		}else if(statement.trim() == ""){
			response = "Come on, do you not want to talk to me?";
			
		}else{
			response = getRandomResponse();
		}
		return response;
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
