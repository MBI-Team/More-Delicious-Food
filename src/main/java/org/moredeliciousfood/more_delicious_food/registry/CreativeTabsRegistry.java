package org.moredeliciousfood.more_delicious_food.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static org.moredeliciousfood.more_delicious_food.registry.ItemRegistry.NEW_CHICKEN;

public class CreativeTabsRegistry {
    public static final String MODID = "more_delicious_food";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MDF_TAB = CREATIVE_MODE_TABS.register("mdf_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.more_delicious_food")).withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> NEW_CHICKEN.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(NEW_CHICKEN.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
    }).build());
}
