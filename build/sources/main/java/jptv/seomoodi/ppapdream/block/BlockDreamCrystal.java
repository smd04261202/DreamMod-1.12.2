
package jptv.seomoodi.ppapdream.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import jptv.seomoodi.ppapdream.procedure.ProcedureDreamCrystalBlockDestroyedByPlayer;
import jptv.seomoodi.ppapdream.creativetab.TabDream;
import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@ElementsPpapdreamMod.ModElement.Tag
public class BlockDreamCrystal extends ElementsPpapdreamMod.ModElement {
	@GameRegistry.ObjectHolder("ppapdream:dream_crystal")
	public static final Block block = null;
	public BlockDreamCrystal(ElementsPpapdreamMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dream_crystal"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("ppapdream:dream_crystal", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.GLASS);
			setUnlocalizedName("dream_crystal");
			setSoundType(SoundType.GLASS);
			setHarvestLevel("pickaxe", 2);
			setHardness(5F);
			setResistance(3F);
			setLightLevel(0.6F);
			setLightOpacity(255);
			setCreativeTab(TabDream.tab);
			setDefaultSlipperiness(0.7f);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public int quantityDropped(Random random) {
			return 0;
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureDreamCrystalBlockDestroyedByPlayer.executeProcedure($_dependencies);
			}
			return retval;
		}
	
		@SideOnly(Side.CLIENT)
		@Override
		public boolean shouldSideBeRendered(final IBlockState blockState, final IBlockAccess blockAccess,
				final BlockPos pos, final EnumFacing side) {
			final IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
			final Block block = iblockstate.getBlock();
			if (blockState != iblockstate) {
				return true;
			}
			if (block == this) {
				return false;
			}
			return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
		}
	}
}
