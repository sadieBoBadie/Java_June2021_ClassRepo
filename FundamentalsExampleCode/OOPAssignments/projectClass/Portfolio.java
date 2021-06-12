import java.util.ArrayList;

public class Portfolio {
    
    private ArrayList<Project> projects;

    public Portfolio() {
        projects = new ArrayList<Project>();
    }

    public Portfolio(Project... projects) {
        this();
        for (Project project: projects) {
            this.projects.add(project);
        }
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public double getPortfolioCost() {
        double sum = 0;
        for (Project project: projects) {
            sum += project.getInitialCost();
        }
        return sum;
    }

    public void showPortfolio() {
        for (Project project: projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.printf("Total Cost: $%.2f\n", getPortfolioCost());
    }
}