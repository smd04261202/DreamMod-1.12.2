
package jptv.seomoodi.ppapdream.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import jptv.seomoodi.ppapdream.procedure.ProcedureBakhaRecorderRightClickedInAir;
import jptv.seomoodi.ppapdream.creativetab.TabDream;
import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;
import java.util.HashMap;

@ElementsPpapdreamMod.ModElement.Tag
public class ItemBakhaRecorder extends ElementsPpapdreamMod.ModElement {
	@GameRegistry.ObjectHolder("ppapdream:bakha_recorder")
	public static final Item block = null;
	public ItemBakhaRecorder(ElementsPpapdreamMod instance) {
		super(instance, 145);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ppapdream:bakha_recorder", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("bakha_recorder");
			setRegistryName("bakha_recorder");
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

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureBakhaRecorderRightClickedInAir.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
