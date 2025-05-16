package ERdiagram;
public class Student {
    private long id;
    private String name;
    private String program;

    public Student(long id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    // ✅ Getter Methods
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
