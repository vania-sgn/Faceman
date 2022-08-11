package ARRAYS_0;

import javax.sound.midi.Soundbank;

public class ZAD_3_0 {
    public static void main(String[] args) {
        String[][] arrays = new String[3][6];
        char symbol = 'a';
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <6 ; j++) {
                arrays[i][j] = symbol+""+(j+1);
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println("");
            symbol++;
        }
    }
}
