package net.unilock.ctrlqr.quilt;

import net.unilock.ctrlqr.fabriclike.CtrlQRFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class CtrlQRQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        CtrlQRFabricLike.init();
    }
}
