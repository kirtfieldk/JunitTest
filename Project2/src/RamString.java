public class RamString implements WackyStringInterface {

    String wackyString;
    
    @Override
    public void setWackyString(String str){
        this.wackyString = str;
    }
    @Override
    public String getWackyString(){
        return this.wackyString;
    }
    @Override
    public String getEvenCharacters(){
    	wackyString = wackyString.replaceAll("\\s+","");
    	String stringOfEvens = "";
    	int length = wackyString.length();
        if(length == 0) {
        	return "";
        }
        for(int i = 1; i < length; i+= 2) {
            char evenLetter = wackyString.charAt(i);
            stringOfEvens = stringOfEvens + evenLetter;
        }
        return stringOfEvens;
    }
    @Override
    public String getOddCharacters(){
        int length = wackyString.length();
        String stringOfOdds = "";
        if(length == 0) {
        	return "";
        }
        for(int i = 0; i <= length; i+= 2) {
            char oddLetter = wackyString.charAt(i);
            stringOfOdds = stringOfOdds + oddLetter;
        }
        return stringOfOdds;
    }
    @Override
    public int countNonDigits(){
    	int counter = 0;
    	if(wackyString.length() == 0) {
    		return 0;
    	}
    	for(int i = 0; i < wackyString.length(); i++) {
    		String character = wackyString.charAt(i) + "";
    		try {
    			Integer.parseInt(character);
    			counter++;
    		}catch (NumberFormatException e) {
    			continue;
    		}
    	}return counter;
    	
    }
        

    @Override
    public boolean isValidEmail(){
    	if(wackyString.contains(".") &&
    			wackyString.contains("@"))
    		return true;
    	else
    		return false;
    }
    @Override
    public void ramifyString(){

    }
    @Override
    public void convertDigitsToRomanNumeralsInSubstring(int startPosition, int endPosition) throws MyIndexOutOfBoundsException, IllegalArgumentException {

    }
}
