import java.util.ArrayList;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;

    private ArrayList<Player> squad = new ArrayList<Player>();

    public String toString() {
        String msg = "FootballClub Name: " + name + "Player Count: " + squad.size() + "\n";
        for(int i=0;i<squad.size(); i++)
        {
            msg += "\t" + squad.get(i) + "\n";
        }
        return msg;
    }

    public FootballClub(String clubName)
    {
        this.name = clubName;
    }
    public void addPlayer(Player player)
    {
        squad.add(player);
    }
    public void removeAllPlayer()
    {
        squad.clear();
    }
    public Player findPlayer(String playerFirstName, int jerseyNumber)
    {

        for(Player s : squad)
        {
            if(s.getFirstName().equals(playerFirstName) && s.getJerseyNumber() == jerseyNumber)
            {
                return s;
            }
        }
        return null;
    }
}
