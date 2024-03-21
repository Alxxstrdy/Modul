
package modul1_202357201027;
import javax.swing.JOptionPane;
public class Modul_B {
     public static void main(String[] args) {
         int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };   
                 int baris = Integer.parseInt(JOptionPane.showInputDialog("Baris"));
                 int kolom = Integer.parseInt(JOptionPane.showInputDialog("Kolom"));              
                 int baru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai"));
                 data[baris][kolom] = baru;
                 
                 for (int a = 0; a< data.length; a++) {
                     for (int b = 0; b < data[a].length; b++) {
                         System.out.print(data[a][b] + " ");                                       
                 
                }
                     System.out.println();
            }
                System.out.println("Penjumlahan Index Kolom Ganjil");
                 int element = 0;
                 for (int i = 0; i < data.length; i++) {
         for (int j = 1; j < data[i].length; j += 2){
             element += data [i][j];
         }
        }
                 System.out.println(element);
     }
}
