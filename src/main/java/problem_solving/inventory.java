
package problem_solving;


public class inventory {

    @Override
    public String toString() {
        return "inventory{" + "name=" + name + ", qty=" + qty + '}';
    }
    
    private String name;
    private int qty;

    public inventory(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    
}
