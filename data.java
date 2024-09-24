import java.util.Scanner;
public class data {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int JumlahSiswaSiswi; 
        JumlahSiswaSiswi= input.nextInt();
        double totalBeratSiswaSiswi = 10; //Tetapkan jumlah siswa siswi sampai 10 saja

        for (int i =1; i<=JumlahSiswaSiswi; i++ ) {
            System.out.println("Masukan Nilai Siswa Siswi ke-" + i + "; ");
            double Nilai = input.nextDouble();
            totalBeratSiswaSiswi +=Nilai;
        }
        double RataRata = totalBeratSiswaSiswi / JumlahSiswaSiswi;
        System.out.println("Rata Rata Nilai Dari " + JumlahSiswaSiswi + "SiswaSiswiAdalah" + RataRata);
    

    }
    
}
