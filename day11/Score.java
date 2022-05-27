package day11;

public class Score {
	public static void main(String[] args) {
		char grade = 'o';
		String scoreMsg;
		
		if(grade == 'A') {
			scoreMsg = "Your score more then 90";
		} else if ( grade =='B') {
			scoreMsg = "Your score with in 80 - 90";
		} else if ( grade == 'C') {
			scoreMsg = "your score with in 70 - 79";
		} else if ( grade == 'D') {
			scoreMsg = "Your score with in 60 - 69";
		} else if (grade == 'F') {
			scoreMsg = " Your scoe is less then 60";
		} else {
			scoreMsg = "Not valid grade it can be A,B,C,D,F";
		}
		System.out.println("grade "+grade);
		                  // grade o
		System.out.println("Message: "+ scoreMsg);
		}                 // Message: Not valid grade it can be A,B,C,D,F
		
		
		
		
	}


