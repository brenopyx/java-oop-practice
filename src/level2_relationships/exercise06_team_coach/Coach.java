package level2_relationships.exercise06_team_coach;

public class Coach {
    private String name;
    private int experienceYears;

    public Coach(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name  == null || name.isBlank()) {
            throw new IllegalArgumentException("The name is invalid");
        }else {
            this.name = name;
        }
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears <= 0) {
            throw new IllegalArgumentException("The experience  years needs greater than 0");
        } else {
            this.experienceYears = experienceYears;
        }
    }

    public void showCoachInformation() {
        System.out.println("---Coach Information---");
        System.out.println("Coach Name: " + this.getName());
        System.out.println("Experience Years: " + this.getExperienceYears());
    }
}
