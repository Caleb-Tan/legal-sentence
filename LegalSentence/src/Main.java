
class Main {
	//main method
	public static void main(String [] args){
		LegalSentence ls = new LegalSentence(); //initialization
		ls.check("~ p & q"); //must have spaces in between elements, ex: "~ p <=> q"
	}
}
