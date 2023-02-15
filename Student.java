public class Student {
    private String lastName;
    private String firstName;
    private int yearStudy;
    private int group;
    private String direction;
    private String faculty;
    private int ID;
    private boolean isFemale;


    Student(String lastName, String firstName, boolean isFemale, int yearStudy, int group, String direction, String faculty, int ID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.isFemale = isFemale;
        this.yearStudy = yearStudy;
        this.group = group;
        this.direction = direction;
        this.faculty = faculty;
        this.ID = ID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public int getGroup() {
        return group;
    }

    public String getDirection() {
        return direction;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getID() {
        return ID;
    }

    public String getInfo() {
        String ending = (isFemale)? "ка": "";
        return String.format("%s %s - студент%s %d курса %d группы факультета %s направления %s", lastName, firstName,ending, yearStudy, group, faculty, direction);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
}