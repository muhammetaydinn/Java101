package Siniflar.OgrenciBS;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    double quizPercent;
    double avarage;

    public Course(String name, String code, String prefix,double quizPercent) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz=0;
        this.quizPercent=quizPercent;
        

    }
    public double getAvarage(){
        return (1-this.quizPercent)*this.note+this.quizPercent*this.quiz;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
