package abstractfactory.ex1;


public class AsusPC extends AbstractPC {
    private AsusPC(String name, ComputerBrand computerBrand, int cpuPower, double gpuPower, boolean isOverlocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverlocked);

        System.out.println(this.getComputerBrand() + " " + this.getName() + " was created");
    }

    public static AsusPC createAsusN53() {
        return new AsusPC("N53", ComputerBrand.ASUS, 85, 0.5, true);
    }

    public static AsusPC createAsusN92() {
        return new AsusPC("N92", ComputerBrand.ASUS, 55, 0.7, false);
    }
}
