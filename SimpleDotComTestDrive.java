public class SimpleDotComTestDrive{
	public static void main(String[] args){
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);	
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String = "Errado";
		if (result.equals("hit")){
			testResult = "Acertou";
		}
		System.out.println(testResult);
	}
}
