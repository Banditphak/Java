package day32;

public class TeamTask {
	public static void main(String[] args) {
		
		String[][] teams = {
				{"Yulduz","Mark", "Akylbek","Danial"},
				{"Ariunna","frank","Nurgazy","Anna"},
				{"Selvin","Meerim","Gulzhana","Rocio"},
				{"Job","Evelyn","Edil","Aizhamal"}};
		
		
		System.out.println(teams[0][0]);
		System.out.println(teams[0][1]);
		System.out.println(teams[0][2]);
		System.out.println(teams[0][3]);
		System.out.println(teams[1][0]);
		System.out.println(teams[1][1]);
		System.out.println(teams[1][2]);
		System.out.println(teams[1][3]);
		System.out.println(teams[2][0]);
		System.out.println(teams[2][1]);
		System.out.println(teams[2][2]);
		System.out.println(teams[2][3]);
		
		System.out.println("-----------------------");
		
		int totalLength = 0;
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				 totalLength = totalLength + teams[i][j].length();
			}
			}
		      
		    	System.out.println("length: " +totalLength);
		    	
		System.out.println("----------------");
		    	for(int i = 0; i < teams.length; i++) {
		    		for(int j = 0; j < teams[i].length; j ++) {
		    		if(teams[i][j].length() % 2 == 0) {
		    			System.out.println(teams[i][j]);
		    		}
		    	}
		    }
		}    	
}
