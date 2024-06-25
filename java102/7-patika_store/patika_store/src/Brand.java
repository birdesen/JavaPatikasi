
import java.util.HashMap;
import java.util.TreeSet;

public class Brand {
    private int id;
    private String name;
    private TreeSet<Brand> brandList = new TreeSet<>(new OrderByName());

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brand() {
    }
    public void brandList() {
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Casper"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "Hp"));
        brandList.add(new Brand(8, "Xiaomi"));
        brandList.add(new Brand(9, "Monster"));
    }
    public void printBrandList(){
        brandList();
        System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ MARKALAR ⭐ ⭐ ⭐ ⭐ ⭐");
        for (Brand brand : brandList) {
            System.out.println(brand.id + " - " + brand.getName());
        }
        System.out.println("⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐ ⭐");
    }

    public String getBrandById(int brandId) {
        brandList();
        for (Brand brand : brandList) {
            if (brand.getId() == brandId) {

                return brand.getName();
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
