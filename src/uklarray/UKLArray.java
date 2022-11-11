/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklarray;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class UKLArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String pilihan = scan.nextLine();
        String nama[][] = {{"adi", "budi", "jarjit", "ehsan"}, {"bagas", "rudi", "fizi", "putra"}};
        int nisn[][] = {{1234, 5678, 9111, 9222}, {2468, 1357, 9333, 9444}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (nama[i][j].equalsIgnoreCase(pilihan)) {
                    System.out.println("Nama: " + nama[i][j]);
                    System.out.println("Nisn: " + nisn[i][j]);
                    break;
                }
            }
        }
    }
    
}
