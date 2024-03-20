
package modul1_202357201027;

public class Modul_A {
    public static void main(String[] args) {
         int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        for (int a = 0; a < data.length; a++) {
            double ratarata = 0;
            double hasil;
            for (int b = 0; b < data[a].length; b++) {
                ratarata += data[a][b];

            }
            hasil = ratarata /= data[a].length;
            System.out.println(hasil);
        }
    }
    
}
