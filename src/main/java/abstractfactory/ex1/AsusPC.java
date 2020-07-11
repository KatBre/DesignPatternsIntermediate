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

    public abstract static class AbstractPC {
        private String name;
        private ComputerBrand computerBrand;
        private int cpuPower;
        private double gpuPower;
        private boolean isOverlocked;

        public AbstractPC(String name, ComputerBrand computerBrand, int cpuPower, double gpuPower, boolean isOverlocked) {
            this.name = name;
            this.computerBrand = computerBrand;
            this.cpuPower = cpuPower;
            this.gpuPower = gpuPower;
            this.isOverlocked = isOverlocked;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ComputerBrand getComputerBrand() {
            return computerBrand;
        }

        public void setComputerBrand(ComputerBrand computerBrand) {
            this.computerBrand = computerBrand;
        }

        public int getCpuPower() {
            return cpuPower;
        }

        public void setCpuPower(int cpuPower) {
            this.cpuPower = cpuPower;
        }

        public double getGpuPower() {
            return gpuPower;
        }

        public void setGpuPower(double gpuPower) {
            this.gpuPower = gpuPower;
        }

        public boolean isOverlocked() {
            return isOverlocked;
        }

        public void setOverlocked(boolean overlocked) {
            isOverlocked = overlocked;
        }

        @Override
        public String toString() {
            return "AbstractPC{" +
                    "name='" + name + '\'' +
                    ", computerBrand=" + computerBrand +
                    ", cpuPower=" + cpuPower +
                    ", gpuPower=" + gpuPower +
                    ", isOverlocked=" + isOverlocked +
                    '}';
        }
    }
}
