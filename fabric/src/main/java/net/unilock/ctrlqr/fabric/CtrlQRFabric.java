package net.unilock.ctrlqr.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.unilock.ctrlqr.fabriclike.CtrlQRFabricLike;

public class CtrlQRFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CtrlQRFabricLike.init();
    }
}
