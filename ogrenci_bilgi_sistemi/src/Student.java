public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage=0.0;
    Boolean isPass;
    int note;
    int oralNote;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
    }
    void addBulkExamNote(int note1,int note2,int note3){
        if (note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if (note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if (note3>=0 && note3<=100){
            this.c3.note=note3;
        }
    }
    void oralExam(int ONote1,int ONote2,int ONote3){
        if (ONote1>=0 && ONote1<=100){
            this.c1.oralNote=ONote1;
        }
        if (ONote2>=0 && ONote2<=100){
            this.c2.oralNote=ONote2;
        }
        if (ONote3>=0 && ONote3<=100){
            this.c3.oralNote=ONote3;
        }
    }
    void calcAvarage(){
        avarage=(((this.c1.note)*0.8+(this.c1.oralNote)*0.2)+((this.c2.note)*0.9+(this.c2.oralNote)*0.1)+
                ((this.c3.note)*0.9+(this.c3.oralNote)*0.1))/3;
        printNote();
        setIsPasss();
        if (avarage>50){
            isPass=true;
        }
    }
    void setIsPasss(){
        if (isPass=true){
            System.out.println("Sınıfı Geçtiniz");
            System.out.println("ortalamanız: "+avarage);
        }else{
            System.out.println("Sınıfı geçemediniz");
            System.out.println("ortalamanız: "+avarage);
        }
    }
    void printNote(){
        System.out.println(c1.name+" Notu\t: "+c1.note);
        System.out.println(c2.name+" Notu\t: "+c2.note);
        System.out.println(c3.name+" Notu\t: "+c3.note);
        System.out.println(c1.name+" Sozlu notu\t: "+c1.oralNote);
        System.out.println(c2.name+" Sozlu notu\t: "+c2.oralNote);
        System.out.println(c3.name+" Sozlu notu\t: "+c3.oralNote);
    }
}
