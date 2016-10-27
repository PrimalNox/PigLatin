
public class PigLatin {

private PigLatin(){
	
	
}
private static String translateWord(String word){
	  int ans = PigLatin.findFirstVowel(word);                             
	if (ans == -1 || ans == 0){
		word = word.concat("yay ");
		return word;
	}
	else{
		String beg = word.substring(0, ans);
		String end = word.substring(ans);
		String newW = end.concat(beg);
		String finW= newW.concat("ay ");
		return finW;
	}

}
private static int findFirstVowel(String word){
	word = word.toLowerCase();
	char []input = word.toCharArray();
	char []vowel = {'a', 'e', 'i', 'o', 'u'};
	for(int count = 0; count<input.length; count++){
		char check = input[count];
		for(int j = 0; j<vowel.length; j++){
			char vowelCheck = vowel[j];
			if (check == vowelCheck){
				return count;
				
			}
			else {
				
			}
		}

	}
	return -1;


}
public static String translate(String input){

String []sent = input.split("\\s+");
String answer = "";
for(int j = 0;j < sent.length; j++){
	String h = PigLatin.translateWord(sent[j]);
	answer = answer.concat(h);
}
return answer;
	

}

}
