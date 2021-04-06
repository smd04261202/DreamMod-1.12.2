
package jptv.seomoodi.ppapdream.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.NonNullList;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import jptv.seomoodi.ppapdream.creativetab.TabDream;
import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

@ElementsPpapdreamMod.ModElement.Tag
public class BlockDreamGrass1 extends ElementsPpapdreamMod.ModElement {
	@GameRegistry.ObjectHolder("ppapdream:dream_grass_1")
	public static final Block block = null;
	public BlockDreamGrass1(ElementsPpapdreamMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dream_grass_1"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("ppapdream:dream_grass_1", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.PLANTS);
			setUnlocalizedName("dream_grass_1");
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(3F);
			setLightLevel(0.1F);
			setLightOpacity(0);
			setCreativeTab(TabDream.tab);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		@javax.annotation.Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.15D, 0D, 0.15D, 0.85D, 0.6D, 0.85D);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Items.NETHER_STAR, (int) (0)));
		}
	}
}
