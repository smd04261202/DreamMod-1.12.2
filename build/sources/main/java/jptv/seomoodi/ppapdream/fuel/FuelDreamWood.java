
package jptv.seomoodi.ppapdream.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

@ElementsPpapdreamMod.ModElement.Tag
public class FuelDreamWood extends ElementsPpapdreamMod.ModElement {
	public FuelDreamWood(ElementsPpapdreamMod instance) {
		super(instance, 53);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(Blocks.LOG, (int) (1), 2).getItem()
				&& fuel.getMetadata() == new ItemStack(Blocks.LOG, (int) (1), 2).getMetadata())
			return 600;
		return 0;
	}
}
