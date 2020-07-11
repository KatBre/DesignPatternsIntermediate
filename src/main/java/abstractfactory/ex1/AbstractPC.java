package abstractfactory.ex1;

public abstract class AbstractPC {
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
