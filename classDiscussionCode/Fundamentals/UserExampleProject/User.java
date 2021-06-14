public class User {

    // Member Variable
    private String firstName;
    private String lastName;
    private String email;

    // Constructor(s)
    public User(String first, String last, String email) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }


    // Action methods


    // Getters and Setters...
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}