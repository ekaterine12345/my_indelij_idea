import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSearch {
    public static Result searchFile(Path file, String[] searched) {

        Result result = new Result(file);

        AtomicInteger atomicInteger = new AtomicInteger(0);

        try (Stream<String> stream = Files.lines(file)) {
            stream.forEach(s ->
            {
                atomicInteger.getAndIncrement();
                if (Arrays.stream(searched).anyMatch(s::contains)) {
                    Match match = new Match(atomicInteger.intValue(), s);
                    result.addMatch(match);
                }
            });
        } catch (Exception e) {

            return null;
        }
        return result;
    }

    public static Set<Result> searchDirectory(Path directory, String searched[]) {
        Set<Result> setResults = new HashSet<Result>();
        Result result = null;

        try {
            Object[] arr = Files.walk(directory).filter(Files::isRegularFile).toArray();

            for (Object o : arr) {
                result = searchFile(Paths.get(o.toString()), searched);
                if (result != null)
                    setResults.add(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        return setResults;
    }


    public static List<Result> listResults(String directory, String searched[]) {
        List<Result> resultList = new ArrayList<>(searchDirectory(Paths.get(directory), searched)).stream()
                .sorted(Comparator.comparingInt(Result::getMathSize).reversed())
                .collect(Collectors.toList());


        return resultList;

    }

    public static void main(String arr[]) {


        String[] searcher = new String[5];

        String directoryPath = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("shemoikvanet direktoria");
        directoryPath = scanner.next();

        System.out.println("shemoikvanet sitkvebi");
        for (int i = 0; i < searcher.length; i++) {

            String s = scanner.next();
            searcher[i] = s;
        }

        ArrayList<Result> results = new ArrayList<>(listResults(directoryPath, searcher));

        for (Result result : results) {
            System.out.println(result);
            for (Match match : result.getMatches())
                System.out.println(match);

        }

    }
}

