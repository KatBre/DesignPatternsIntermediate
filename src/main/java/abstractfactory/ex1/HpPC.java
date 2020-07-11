package abstractfactory.ex1;

public class HpPC extends AbstractPC {
    private HpPC(String name, ComputerBrand computerBrand, int cpuPower, double gpuPower, boolean isOverlocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverlocked);

        System.out.println(this.getComputerBrand() + " " + this.getName() + " was created");
    }

    public static HpPC createHpN53() {
        return new HpPC("N53", ComputerBrand.HP, 85, 0.5, true);
    }
    public static HpPC createHpN92() {
        return new HpPC("N92", ComputerBrand.HP, 55, 0.7, false);
    }
}
