package study.GoF23.StructuralPattern.bridge;


/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 16:15
 * @Descrintion:电脑接口，
 * @version: 1.0
 */
public class Computer {
    //组合，品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info();
    }
}

class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
        System.out.println("台式机");
    }
}
class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
        System.out.println("笔记本");
    }
}
