package jptv.seomoodi.ppapdream.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import jptv.seomoodi.ppapdream.item.ItemDlcNoAd;
import jptv.seomoodi.ppapdream.item.ItemDlcMemory;
import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;

@ElementsPpapdreamMod.ModElement.Tag
public class ProcedureALucydpatchCanUseOnBlockRightClicked extends ElementsPpapdreamMod.ModElement {
	public ProcedureALucydpatchCanUseOnBlockRightClicked(ElementsPpapdreamMod instance) {
		super(instance, 306);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ALucydpatchCanUseOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDlcNoAd.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemDlcNoAd.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00a7e\uad11\uace0 \uc81c\uac70\uc5d0 \ub2e4\uc18c \uc2dc\uac04\uc774 \uc18c\uc694\ub429\ub2c8\ub2e4"), (true));
			}
		} else {
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemDlcMemory.block, (int) (1)).getItem())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemDlcMemory.block, (int) (1)).getItem(), -1, (int) 1, null);
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00a7e\uae30\uc5b5 \uc18d\uc73c\ub85c \ud758\ub7ec\ub4e4\uc5b4\uac08 \uc900\ube44\uac00 \ub418\uc5c8\uc2b5\ub2c8\ub2e4"), (true));
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
						_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
							@Override
							public String getName() {
								return "";
							}

							@Override
							public boolean canUseCommand(int permission, String command) {
								return true;
							}

							@Override
							public World getEntityWorld() {
								return _ent.world;
							}

							@Override
							public MinecraftServer getServer() {
								return _ent.world.getMinecraftServer();
							}

							@Override
							public boolean sendCommandFeedback() {
								return false;
							}

							@Override
							public BlockPos getPosition() {
								return _ent.getPosition();
							}

							@Override
							public Vec3d getPositionVector() {
								return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
							}

							@Override
							public Entity getCommandSenderEntity() {
								return _ent;
							}
						}, "godream");
					}
				}
			}
		}
	}
}
