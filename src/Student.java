import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<String> courseArrayList = new ArrayList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // methods
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                        "ID: %s\n\n",
                name, id);
    }

    public void addCourse(String course) {
        courseArrayList.add(course);
    }

    public void removeMove(String course) {
        courseArrayList.remove(course);
    }

    public StringBuilder getAllCourses() {
        StringBuilder courseStringBuilder = new StringBuilder();
        for (String course: courseArrayList) {
            courseStringBuilder.append(course.toString());
        }
        return courseStringBuilder;
    }
}

