package level2_relationships.exercise06_team_coach;

public class Main {
    public static void main(String[] args) {
        Team team1= new Team("Tigers", "Carlos", 10);
        Team team2= new Team("Eagles", "Roberto", 5);

        team1.showTeamInformation();
        team2.showTeamInformation();
    }
}
