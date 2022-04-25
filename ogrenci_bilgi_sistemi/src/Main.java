public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("enes", "5469705451", "TRH");
        Teacher t2 = new Teacher("elif", "5555555555", "MAT");
        Teacher t3= new Teacher("derviş","4444444444","FZK");
        Course Tarih=new Course("Tarih","101","TRH",t1);
        Course Matematik=new Course("Matematik","101","MAT",t2);
        Course Fizik=new Course("Fizik","102","FZK",t3);
        Student s1=new Student("enes","410","4",Tarih,Matematik,Fizik);
        s1.addBulkExamNote(90,69,97);
        s1.oralExam(70,50,98);
        s1.calcAvarage();
    }
}
