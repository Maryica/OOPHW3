import java.util.List;

public class StreamServis {
    public void sort(List<Controller> streamList) {
        StreamComparator sortStream = new StreamComparator();
        streamList.sort(sortStream);
    }
}