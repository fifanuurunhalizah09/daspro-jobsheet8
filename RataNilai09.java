import java.util.Scanner;

public class RataNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j,i = 1;
        float nilaiMhs,totalNilai=0,rataNilai;

        while (i<=5){
            System.out.println("input Nilai Mahasiswa ke- " +i);
            totalNilai=0;
            for (j=1;j<=5;j++){
                System.out.print("Nilai ke-" +j +" = ");
                nilaiMhs = sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata - rata nilai Mahasiswa ke-1 adalah " +rataNilai);
            i++;
        }
    }
}

