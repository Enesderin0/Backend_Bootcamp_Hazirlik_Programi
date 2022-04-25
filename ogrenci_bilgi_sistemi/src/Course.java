public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;

    Course(String name,String code,String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher=teacher;
            printTeacherPrint();
        }else{
            System.out.println("ders uyuşmuyor");
        }
    }
    void printTeacherPrint(){
        this.teacher.printTeacher();
    }



}
