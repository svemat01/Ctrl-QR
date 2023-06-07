package cc.unilock.ctrlqr.forge;

import cc.unilock.ctrlqr.CtrlQR;
import net.minecraftforge.fml.common.Mod;

@Mod(CtrlQR.MOD_ID)
public class CtrlQRForge {
    public CtrlQRForge() {
        CtrlQR.init();
    }
}
