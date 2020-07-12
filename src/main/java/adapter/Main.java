package adapter;

import adapter.adapters.CzajnikAdapter;
import adapter.adapters.GazowkaAdapter;
import adapter.adapters.ZelazkoAdapter;
import adapter.devices.Czajnik;
import adapter.devices.Gazowka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IHomeDevice> homeDevices = new ArrayList<>();
        homeDevices.add(new CzajnikAdapter(new Czajnik()));
        homeDevices.add(new GazowkaAdapter(new Gazowka()));
        homeDevices.add(new ZelazkoAdapter());

        turnAllDevicesOff(homeDevices);
    }

    private static void turnAllDevicesOff(List<IHomeDevice> homeDevices) {
        for (IHomeDevice homeDevice : homeDevices) {
            homeDevice.turnOff();
        }
    }
}
