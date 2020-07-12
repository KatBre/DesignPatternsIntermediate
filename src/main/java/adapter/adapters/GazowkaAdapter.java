package adapter.adapters;


import adapter.devices.Gazowka;
import adapter.IHomeDevice;

public class GazowkaAdapter implements IHomeDevice {
    private final Gazowka gazowka;

    public GazowkaAdapter(Gazowka gazowka) {
        this.gazowka = gazowka;
    }

    @Override
    public void turnOn() {
        gazowka.setOn(true);
    }

    @Override
    public void turnOff() {
        gazowka.setOn(false);
    }

    @Override
    public boolean getStatus() {
        return gazowka.isOn();
    }
}
