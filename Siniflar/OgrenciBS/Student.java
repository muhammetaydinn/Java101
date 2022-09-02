package Siniflar.OgrenciBS;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matQuiz, int fizik,int fizikQuiz, int kimya,int kimyaQuiz) {

        if (mat >= 0 && mat <= 100 &&matQuiz>=0&&matQuiz<=100) {
            this.mat.note = mat;
            this.mat.quiz=matQuiz;
            this.mat.avarage=this.mat.getAvarage();
           
        }

        if (fizik >= 0 && fizik <= 100 &&fizikQuiz>=0&&fizikQuiz<=100) {
            this.fizik.note = fizik;
            this.fizik.quiz=fizikQuiz;
            this.fizik.avarage=this.fizik.getAvarage();
           
        }

        if (kimya >= 0 && kimya <= 100 &&kimyaQuiz>=0&&kimyaQuiz<=100) {
            this.kimya.note = kimya;
            this.kimya.quiz=kimyaQuiz;
            this.kimya.avarage=this.kimya.getAvarage();
            
        }

    }

    public void isPass() {
        if (this.mat.avarage == 0  ||this.fizik.avarage == 0 || this.kimya.avarage == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage =( this.fizik.getAvarage() + this.kimya.getAvarage() + this.mat.getAvarage())/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.avarage);
        System.out.println("Fizik Notu : " + this.fizik.avarage);
        System.out.println("Kimya Notu : " + this.kimya.avarage);
    }

}
