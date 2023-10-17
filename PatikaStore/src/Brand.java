import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private int idNo;
    private String name;

    static TreeSet<Brand> brandTreeSet = new TreeSet<>();
    static {
        brandTreeSet.add(new Brand(1,"Samsung"));
        brandTreeSet.add(new Brand(2,"Lenovo"));
        brandTreeSet.add(new Brand(3,"Apple"));
        brandTreeSet.add(new Brand(4,"Huawei"));
        brandTreeSet.add(new Brand(5,"Casper"));
        brandTreeSet.add(new Brand(6,"Asus"));
        brandTreeSet.add(new Brand(7,"HP"));
        brandTreeSet.add(new Brand(8, "Xiaomi"));
        brandTreeSet.add(new Brand(9, "Monster"));
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Brand (int idNo, String name){
        this.idNo = idNo;
        this.name = name;
    }
    static void printBrand(){
        System.out.println();
        for (Brand brand : brandTreeSet){
            System.out.println(brand);
        }
        System.out.println();
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
    @Override
    public String toString(){
        return " - " + this.getName();
    }
}