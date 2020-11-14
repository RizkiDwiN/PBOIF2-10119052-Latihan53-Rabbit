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
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOflegs = legs;
    }
    
    

    public boolean isVegetarian() {
        System.out.println("Peter is Vegetarian? false");
        return vegetarian;
    }

    public String getEats() {
        System.out.println("Peter eats gress");
        return eats;
    }

    public int getNoOflegs() {
        System.out.println("peter has 4 legs");
        return noOflegs;
    }
}
