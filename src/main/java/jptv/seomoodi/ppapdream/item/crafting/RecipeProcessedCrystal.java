
package jptv.seomoodi.ppapdream.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

@ElementsPpapdreamMod.ModElement.Tag
public class RecipeProcessedCrystal extends ElementsPpapdreamMod.ModElement {
	public RecipeProcessedCrystal(ElementsPpapdreamMod instance) {
		super(instance, 67);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.BLAZE_POWDER, (int) (1)), new ItemStack(Items.BLAZE_ROD, (int) (1)), 0F);
	}
}
