package level2_relationships.exercise06_team_coach;

public class Team {
    private String name;
    private Coach coach;

    public Team(String name, String coachName, int experienceYears) {
        this.setName(name);
        this.setCoach(coachName, experienceYears);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The team name must be valid");
        }else {
            this.name = name;
        }
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(String coachName, int experienceYears) {
        if (coachName ==  null || coachName.isBlank() || experienceYears <= 0) {
            throw new IllegalArgumentException("The coach must be valid");
        }else {
            this.coach = new Coach(coachName, experienceYears);
        }
    }

    public void showTeamInformation() {
        System.out.println("---Team Information---");
        System.out.println("Team Name: " + getName());
        coach.showCoachInformation();
        System.out.println("------------------------");

    }
}
