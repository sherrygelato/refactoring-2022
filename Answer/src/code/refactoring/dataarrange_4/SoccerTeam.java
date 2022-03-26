package code.refactoring.dataarrange_4;

public class SoccerTeam {

	 public static void main(String[] args){ 
		 //String[] row = new String[3];
		 Performance row = new Performance();
		 
		 row.setTeamName("¸®¹öÇ®");
		 row.setWins(15);
		 
		 String name = row.getTeamName();
		 int wins = row.getWins();
		 
		 System.out.println("name --> " + name);
		 System.out.println("wins --> " + wins);

	 }
}
