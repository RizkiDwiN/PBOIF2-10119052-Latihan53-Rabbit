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
public class Rabbit extends Animal{
   public String color,name;

    public Rabbit(String name,boolean vegetarian, String food, int legs,String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        System.out.println("Peter color is grey");
        return color;
    }

    public String getName() {
        System.out.println("Hello,his name is Peter");
        return name;
    } 
}
