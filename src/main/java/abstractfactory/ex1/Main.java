package abstractfactory.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractPC mac = AppleMac.createAppleMacN53();
        AbstractPC asus = AsusPC.createAsusN92();
        AbstractPC hp = HpPC.createHpN53();
        AbstractPC samsung = SamsungPC.createSamsungN92();


        List<AbstractPC> pcList = new ArrayList<>();
        pcList.add(mac);
        pcList.add(asus);
        pcList.add(hp);
        pcList.add(samsung);

        System.out.println(pcList.toString());
    }
}
