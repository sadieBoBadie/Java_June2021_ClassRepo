public class Project {

    private String name;
    private String description;
    private double initialCost;


    public Project() {}
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.description = description;
        this.name = name;
    }
    @Override
    public boolean equals(Object otherProject) {
        if (otherProject instanceof Project) {

            return (
                name == ((Project)otherProject).getName() && 
                name == ((Project)otherProject).getDescription()
            );
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        if (name != null && description != null) {
            return String.format("%s ($%.2f): %s", name, initialCost, description);
        }
        return "A new project in initial planning stages.";
    }
}