package utility;

public class createURL {
	
	//i want to create a repository in my gitHub
	public final static String baseURI="https://api.github.com";
	//used "final' so not gonaa change further...its final
	
	public static String getbaseuri() {
		return baseURI;
	}
	
	//my baseuri can contain resource also
	public static String getbaseuri(String resource) {
		return baseURI + resource;
	}
	

}
