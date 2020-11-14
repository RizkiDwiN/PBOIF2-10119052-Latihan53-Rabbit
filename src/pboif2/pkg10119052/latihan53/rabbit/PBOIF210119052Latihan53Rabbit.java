package pboif2.pkg10119052.latihan53.rabbit;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Rabbit / kelinci dengan polymorpism
 * 
 */
public class PBOIF210119052Latihan53Rabbit {

    public static void main(String[] args) {
       int legs = 4;
       Rabbit rabbit = new Rabbit("food", false, "color", legs, "nama");
       rabbit.getName();
       rabbit.isVegetarian();
       rabbit.getEats();
       rabbit.getNoOflegs();
       rabbit.getColor();
    }
    
}
