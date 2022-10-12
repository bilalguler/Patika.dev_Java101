package Siniflar.ogrenciBilgiSistemiOdev;


public class Student {

    Course mat;
    Course kimya;
    Course fizik;
    Course verbMat;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course kimya, Course fizik) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.kimya = kimya;
        this.fizik = fizik;
        calcAvarage();
        this.isPass = false;
    }

    void addBulkExamNote(int mat, int kimya, int fizik) {
        if(mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if(kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if(fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
    }

    void addBulkVerbalNote(int verbMat, int verbKimya, int verbFizik) {
        if(verbMat >= 0 && verbMat <= 100) {
            this.mat.verbalNote = verbMat;
        }
        if(verbKimya >= 0 && verbKimya <= 100) {
            this.kimya.verbalNote = verbKimya;
        }
        if(verbFizik >= 0 && verbFizik <= 100) {
            this.fizik.verbalNote = verbFizik;
        }
    }

    void isPass() {
        if(this.mat.note == 0 || this.kimya.note == 0 || this.fizik.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if(this.isPass) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }

    void calcAvarage() {
        double matAve = this.mat.note * 0.80 + this.mat.verbalNote * 0.20;
        double kimyaAve = this.kimya.note * 0.80 + this.kimya.verbalNote * 0.20;
        double fizikAve = this.fizik.note * 0.80 + this.fizik.verbalNote * 0.20;
        this.average = (matAve + kimyaAve + fizikAve) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    void printNote() {
        System.out.println("===================================");
        System.out.println("Öğrenci Adı: " + this.name);
        System.out.println("Matematik, sınav notu: " + this.mat.note + ", sözlü notu: " +
                this.mat.verbalNote);
        System.out.println("Kimya, sınav notu: " + this.kimya.note + ", sözlü notu: " +
                this.kimya.verbalNote);
        System.out.println("Fizik, sınav notu: " + this.fizik.note + ", sözlü notu: " +
                this.fizik.verbalNote);
    }
}

