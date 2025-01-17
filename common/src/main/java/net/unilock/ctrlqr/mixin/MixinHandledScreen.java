package net.unilock.ctrlqr.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Environment(EnvType.CLIENT)
@Mixin(HandledScreen.class)
public class MixinHandledScreen extends Screen {
    protected MixinHandledScreen(Text title) {
        super(title);
    }

    @ModifyArg(method = "keyPressed", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;onMouseClick(Lnet/minecraft/screen/slot/Slot;IILnet/minecraft/screen/slot/SlotActionType;)V"), index = 2)
    private int hasCtrlDown(int isCtrlDown) {
        var handle = MinecraftClient.getInstance().getWindow().getHandle();
        return InputUtil.isKeyPressed(handle, GLFW.GLFW_KEY_LEFT_CONTROL) || InputUtil.isKeyPressed(handle, GLFW.GLFW_KEY_RIGHT_CONTROL) ? 1 : 0;
    }

    /*
    @Inject(method = "init", at = @At(value = "TAIL"))
    private void keysRepeat(CallbackInfo ci) {
        this.client.keyboard.setRepeatEvents(true);
    }
     */
}
