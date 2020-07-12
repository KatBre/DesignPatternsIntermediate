package adapter.adapters;

import adapter.IHomeDevice;
import adapter.devices.Zelazko;

public class ZelazkoAdapter extends Zelazko implements IHomeDevice {
    @Override
    public void turnOn() {
        turnDeviceOn();
    }

    @Override
    public void turnOff() {
        turnDeviceOff();
    }

    @Override
    public boolean getStatus() {
        return false;
    }
}
