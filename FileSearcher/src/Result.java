import java.nio.file.Path;
import java.util.ArrayList;

public class Result {

    private Path file;
    private ArrayList<Match> matches = new ArrayList<>();

    public Result(Path file) {
        this.file = file;
    }

    public void addMatch(Match match) {
        this.matches.add(match);
    }

    public int getMathSize() {
        return this.matches.size();
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    @Override
    public String toString() {
        if (matches.size() == 0) return "No match in file " + file;

        return matches.size() + " match in file " + file+".";
    }
}
