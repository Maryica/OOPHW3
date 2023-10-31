import java.util.ArrayList;
import java.util.List;

public class Controller extends Steam {
    private int streamNum;
    private List<Steam> groups;

    public Controller(int streamNum) {
        this.streamNum = streamNum;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Steam group) {
        this.groups.add(group);
    }

    public void removeGroup(Steam studyGroup) {
        groups.remove(studyGroup);

    }

    public int getStreamNum() {
        return streamNum;
    }

    public List<Steam> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Поток ").append(streamNum).append(" из ").append(groups.size()).append(" групп").append("\n");
        for (Steam group : groups) {
            result.append("Группа ").append(group.getGroupNumber()).append(" из ").append(group.getStudentList().size())
                    .append(" человек").append("\n");
        }
        return result.toString();
    }
}