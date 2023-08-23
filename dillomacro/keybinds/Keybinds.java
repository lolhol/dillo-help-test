package com.dillo.keybinds;

import static com.dillo.commands.RouteCommands.StructurePoints.render;
import static com.dillo.main.macro.refuel.ReFuelDrill.isStart;
import static com.dillo.main.route.Utils.AddBlockRoute.addBlockRoute;
import static com.dillo.main.teleport.macro.TeleportToNextBlock.alrMoved;
import static com.dillo.main.utils.looks.LookAt.reset;

import com.dillo.armadillomacro;
import com.dillo.main.macro.refuel.ReFuelDrill;
import com.dillo.main.route.Nuker.StartNuker;
import com.dillo.utils.StartMacro;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Keybinds {

  public static boolean isNuking = false;
  public static boolean wasDown = false;
  public static boolean isPressed;

  @SubscribeEvent
  public void onTick(TickEvent.ClientTickEvent event) {
    if (event.phase == TickEvent.Phase.END) {
      if (armadillomacro.keybinds.get(0).isPressed()) {
        reset();
        alrMoved = false;
        isStart = false;
        KeybindHandler.updateKeys(false, false, false, false, false, false, false, false);
        StartMacro.startMacro();
      }
  }
}
