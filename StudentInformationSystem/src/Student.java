public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String year;
    double average;
    boolean isPass;

    public Student(String name, String studentNo, String year, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.year = year;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int examNote1, int quizNote1, int examNote2, int quizNote2,int examNote3, int quizNote3){
        if((examNote1 >= 0 && examNote1 <= 100) && (quizNote1 >= 0 && quizNote1 <= 100)){
            this.course1.totalCourseNote = (examNote1*0.8) + (quizNote1*0.2);
        }
        if((examNote2 >= 0 && examNote2 <= 100) && (quizNote2 >= 0 && quizNote2 <= 100)){
            this.course2.totalCourseNote = (examNote2*0.8) + (quizNote2*0.2);
        }
        if((examNote3 >= 0 && examNote3 <= 100) && (quizNote3 >= 0 && quizNote3 <= 100)){
            this.course3.totalCourseNote = (examNote3*0.8) + (quizNote3*0.2);
        }

    }

    void isPass() {
        this.average = (this.course1.totalCourseNote + this.course2.totalCourseNote + this.course3.totalCourseNote) / 3.0;
        if (this.average > 55) {
            System.out.println("Sınıfı geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.course1.name + " Notu\t: " + this.course1.totalCourseNote);
        System.out.println(this.course2.name + " Notu\t: " + this.course2.totalCourseNote);
        System.out.println(this.course3.name + " Notu\t: " + this.course3.totalCourseNote);
        System.out.println("Ortalamanız: " + this.average);
        System.out.println("=============================");
    }


}
