package jptv.seomoodi.ppapdream.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;

@ElementsPpapdreamMod.ModElement.Tag
public class ProcedureRevolverBulletHitsPlayer extends ElementsPpapdreamMod.ModElement {
	public ProcedureRevolverBulletHitsPlayer(ElementsPpapdreamMod instance) {
		super(instance, 146);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RevolverBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RevolverBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RevolverBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RevolverBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RevolverBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("ppapdream:revolver_shot")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
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
				}, "gunshot");
			}
		}
	}
}
