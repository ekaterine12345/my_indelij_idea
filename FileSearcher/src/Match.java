public class Match {
    private int lineIndex;
    private String line;

    public Match(int lineIndex, String line) {
        this.lineIndex = lineIndex;
        this.line = line;
    }

    @Override
    public String toString() {
        return "Match in line: " + lineIndex + " " + line ;
    }
}

