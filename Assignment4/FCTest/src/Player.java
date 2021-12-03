public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String firstName, String lastName, int jerseyNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
    }

    public String toString()
    {
        return String.format("[%s, %s %d]", this.firstName, this.lastName, this.jerseyNumber);
    }

    public String getFirstName()
    {
        return this.firstName;
    }
    public int getJerseyNumber()
    {
        return this.jerseyNumber;
    }
}
