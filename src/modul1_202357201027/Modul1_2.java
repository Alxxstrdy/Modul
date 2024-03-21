package modul1_202357201027;

public class Modul1_2 {
    
    public static void main(String[] args) {
        
        String data [][] ={
            {"ABDUL","Kediri","085646668991"},
            {"KUSNO","Trenggalek","085646668992"},
            {"PONIRAN","Bojonegoro","085646668999"}
        };
        System.out.println("NAMA \tTELEPON \tALAMAT");
        for (int a = 0; a < data.length; a++){
                System.out.println(data [a][0] + "\t" + data [a][2] + "\t" + data[a][1]);
            }
            System.out.println(" ");
        }
    }
    

