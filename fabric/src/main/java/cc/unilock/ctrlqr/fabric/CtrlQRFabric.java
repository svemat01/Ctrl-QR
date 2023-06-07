package cc.unilock.ctrlqr.fabric;

import cc.unilock.ctrlqr.CtrlQR;
import net.fabricmc.api.ClientModInitializer;

public class CtrlQRFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CtrlQR.init();
    }
}
