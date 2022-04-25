public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void printTeacher(){
        System.out.println("Öğretmenin adı : "+name+"\n"+"Öğretmenin numarası: "+mpno+"\n" +"Öğretmenin alanı: "+branch);
    }
}
