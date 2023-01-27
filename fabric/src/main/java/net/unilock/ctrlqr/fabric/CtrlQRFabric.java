package net.unilock.ctrlqr.fabric;

import net.fabricmc.api.ModInitializer;
import net.unilock.ctrlqr.fabriclike.CtrlQRFabricLike;

public class CtrlQRFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CtrlQRFabricLike.init();
    }
}
