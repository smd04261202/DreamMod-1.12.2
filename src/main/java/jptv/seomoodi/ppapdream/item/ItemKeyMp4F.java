
package jptv.seomoodi.ppapdream.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import jptv.seomoodi.ppapdream.creativetab.TabDream;
import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

@ElementsPpapdreamMod.ModElement.Tag
public class ItemKeyMp4F extends ElementsPpapdreamMod.ModElement {
	@GameRegistry.ObjectHolder("ppapdream:key_mp_4_f")
	public static final Item block = null;
	public ItemKeyMp4F(ElementsPpapdreamMod instance) {
		super(instance, 415);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ppapdream:key_mp_4_f", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("key_mp_4_f");
			setRegistryName("key_mp_4_f");
			setCreativeTab(TabDream.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
