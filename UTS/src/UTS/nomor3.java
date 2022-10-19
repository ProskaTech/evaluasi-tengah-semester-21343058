//created by 21343058_Muhammad Farel Fahlevi

package UTS;

import javax.swing.JOptionPane;

public class nomor3 {
    public static void main(String[] args) {
        int Angka;
        String x;
        
        x = JOptionPane.showInputDialog("Masukan Angka");
        Angka = Integer.parseInt(x);
        
        if(Angka>0) {
            JOptionPane.showMessageDialog(null,"Angka "+Angka+" adalah bilangan positif" );
        }
        else if(Angka<0){
            JOptionPane.showMessageDialog(null, "Angka "+Angka+" adalah bilangan negatif" );
        }
        else {
            JOptionPane.showMessageDialog(null, "Angka "+Angka+" adalah bilangan netral" );
        }
    }
}
