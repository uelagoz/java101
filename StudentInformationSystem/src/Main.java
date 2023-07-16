public class Main {
    public static void main(String[] args) {
        Teacher historyTeacher = new Teacher("Mahmut", "TRH", "505");
        Teacher physicTeacher = new Teacher("Graham", "FZK", "500");
        Teacher mathematicTeacher = new Teacher("Ugur", "MAT", "506");

        Course historyCourse = new Course("Tarih", "TRH", "101");
        historyCourse.addTeacher(historyTeacher);

        Course physicCourse = new Course("Fizik", "FZK", "102");
        physicCourse.addTeacher(physicTeacher);

        Course mathematicCourse = new Course("Matematik", "MAT", "103");
        mathematicCourse.addTeacher(mathematicTeacher);

        Student student1 = new Student("Batu", "5", "3.", historyCourse, physicCourse, mathematicCourse);
        student1.addBulkExamNote(60, 50, 40, 30, 60,80);
        student1.isPass();

        Student student2 = new Student("Uğurcan", "279", "4.", historyCourse, physicCourse, mathematicCourse);
        student2.addBulkExamNote(18,100,90,40,70,100);
        student2.isPass();
    }


}
