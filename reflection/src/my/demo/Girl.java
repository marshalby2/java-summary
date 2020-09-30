package my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 30/7/20 3:12 PM
 */
public class Girl implements Human{

    private int age;
    public String name;
    public String nation = "American";
    private String birthday = "1996-01-01";

    public Girl() {}

    public Girl(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void breath() {
        System.out.println("breath...");
    }

    @Override
    public String toString() {
        return "Girl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
