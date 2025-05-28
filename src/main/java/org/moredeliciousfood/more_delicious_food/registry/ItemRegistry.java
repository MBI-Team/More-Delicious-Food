package org.moredeliciousfood.more_delicious_food.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final String MODID = "more_delicious_food";
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> NEW_CHICKEN = ITEMS.registerSimpleItem("new_chicken", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible()
            .nutrition(20)
            .saturationModifier(100f)
            .build()
    ));
}
