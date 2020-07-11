package abstractfactory.ex1;

public class SamsungPC extends AbstractPC {
    private SamsungPC(String name, ComputerBrand computerBrand, int cpuPower, double gpuPower, boolean isOverlocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverlocked);

        System.out.println(this.getComputerBrand() + " " + this.getName() + " was created");
    }

    public static SamsungPC createSamsungN53() {
        return new SamsungPC("N53", ComputerBrand.SAMSUNG, 85, 0.5, true);
    }
    public static SamsungPC createSamsungN92() {
        return new SamsungPC("N92", ComputerBrand.SAMSUNG, 55, 0.7, false);
    }
}
