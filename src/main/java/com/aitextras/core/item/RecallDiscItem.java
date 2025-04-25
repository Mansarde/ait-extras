package com.aitextras.core.item;


import dev.amble.ait.core.AITSounds;
import dev.amble.ait.core.AITTags;
import dev.amble.ait.core.tardis.Tardis;
import dev.amble.ait.core.tardis.control.Control;
import dev.amble.ait.core.tardis.handler.travel.TravelHandler;
import dev.amble.lib.data.CachedDirectedGlobalPos;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class RecallDiscItem extends Item {
//    private Tardis tardis;

    public RecallDiscItem(Settings settings) {
        super(settings);
   }



//    public Control.Result runServer(Tardis tardis, ServerPlayerEntity player, ServerWorld world, BlockPos console, boolean leftClick) {
//        if (leftClick) {
//            if (!tardis.extra().getInsertedDisc().isEmpty()) {
//                this.ejectDisc(tardis, player, world, console);
//                return Control.Result.SUCCESS;
//            } else {
//                tardis.waypoint().spawnItem(console);
//                return Control.Result.SUCCESS;
//            }
//        } else {
//            ItemStack itemStack = player.getMainHandStack();
//            CachedDirectedGlobalPos lastLocation = this.getLastKnownLocation();
//            if (lastLocation != null) {
//                // Trigger takeoff to the last location
//                TravelHandler travelHandler = tardis.travel();
//                travelHandler.destination(lastLocation);
//                tardis.travel().autopilot(true);
//                tardis.travel().handbrake(false);
//                tardis.travel().dematerialize();
//
//                // Play sound
//                tardis.getDesktop().playSoundAtEveryConsole(AITSounds.DING);
//
//                // Consume the disc
//                itemStack.decrement(1);
//                return Control.Result.SUCCESS;
//            } else if (!tardis.extra().getInsertedDisc().isEmpty()) {
//                // If a disc is already inserted, fail
//                return Control.Result.FAILURE;
//            } else {
//                // Insert the disc into the console
//                tardis.extra().setInsertedDisc(itemStack.copy());
//                player.setStackInHand(Hand.MAIN_HAND, ItemStack.EMPTY);
//                return Control.Result.SUCCESS;
//            }
//        }
//    }

//    private Control.Result handleNonDiscItems(Tardis tardis, ServerPlayerEntity player, ServerWorld world, BlockPos console, ItemStack itemStack) {
//        return null;
//    }
//
//    private void ejectDisc(Tardis tardis, ServerPlayerEntity player, ServerWorld world, BlockPos console) {
//    }
//
//    private boolean isInConsolePortControl(ItemStack stack) {
//
//        return true;
//    }
//
//    public CachedDirectedGlobalPos getLastKnownLocation() {
//
//        return null;
//    }
//
//    public void setTardis(Tardis tardis) {
//        this.tardis = tardis;
//    }
}