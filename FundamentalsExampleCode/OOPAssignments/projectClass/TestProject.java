public class TestProject {
    public static void main(String[] args) {

        Project test0Params = new Project();
        Project test0Params2 = new Project(); // to test overloaded .equals method
        Project testNameParam = new Project("iCount");
        Project testFullParam = new Project("Story Weaver", "An app for collaborative story experiences.");
        Project proj1 = new Project("Frat Farts", "An app to text about bowel movements.");
        Project proj2 = new Project("Cat Map", "An app for crowd-sourcing stray cat info.");
        testFullParam.setInitialCost(100);
        proj1.setInitialCost(5058.50);
        proj2.setInitialCost(325);

        // System.out.println(test0Params.getClass());
        // System.out.println(test0Params.toString());
        // System.out.println(test0Params.equals(test0Params2));
        // System.out.println(test0Params.equals(testNameParam));

        // System.out.println(testNameParam.elevatorPitch());
        // System.out.println(test0Params.elevatorPitch());
        // System.out.println(testFullParam.elevatorPitch());

        Portfolio portfolio = new Portfolio(testFullParam, testNameParam, proj1, proj2);

        portfolio.showPortfolio();

    }
}