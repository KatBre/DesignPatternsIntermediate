package abstractfactory.ex1;

public class AppleMac extends AbstractPC {
    private AppleMac(String name, ComputerBrand computerBrand, int cpuPower, double gpuPower, boolean isOverlocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverlocked);

        System.out.println(this.getComputerBrand() + " " + this.getName() + " was created");
    }

    public static AppleMac createAppleMacN53() {
        return new AppleMac("N53", ComputerBrand.APPLE, 85, 0.5, true);
    }
    public static AppleMac createAppleMacN92() {
        return new AppleMac("N92", ComputerBrand.APPLE, 55, 0.7, false);
    }
}
