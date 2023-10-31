public class Student {
    protected String lastName;
    protected String firstName;
    protected String patronymic;
    protected int studentId;
    protected int srBall;

    public Student(String lastName, String firstName, String patronymic, int studentId, int srBall) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.studentId = studentId;
        this.srBall = srBall;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymicName() {
        return patronymic;
    }

    public String getName() {
        return String.format("%s %s %s", firstName, lastName, patronymic);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSrBall() {
        return srBall;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; cредний бал: %s", lastName, firstName, patronymic, srBall);
    }
}