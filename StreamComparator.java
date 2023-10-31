import java.util.Comparator;

public class StreamComparator implements Comparator<Controller> {

    @Override
    public int compare(Controller stream1, Controller stream2) {
        return Integer.compare(stream1.getGroups().size(), stream2.getGroups().size());
    }
}