

package ERdiagram;

public class Course {
    private long id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course(long id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }


    public long getId() {
        return id;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public String getTitle() {    // ← এই method টি না থাকলেই তোমার error
        return title;
    }

    public String getCredits() {
        return credits;
    }

    public String getPrerequisite() {
        return prerequisite;
    }


}


