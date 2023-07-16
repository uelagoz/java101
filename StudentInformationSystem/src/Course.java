public class Course {
    String name;
    String prefix;
    String code;
    Teacher teacher;
    int examNote;
    int quizNote;
    double totalCourseNote;

    Course(String name, String prefix, String code) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.examNote = 0;
        this.quizNote = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    public void printTeacher() {
        this.teacher.print();
    }
}

