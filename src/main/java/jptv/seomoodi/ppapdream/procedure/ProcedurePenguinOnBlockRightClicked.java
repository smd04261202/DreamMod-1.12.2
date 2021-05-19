package jptv.seomoodi.ppapdream.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;

@ElementsPpapdreamMod.ModElement.Tag
public class ProcedurePenguinOnBlockRightClicked extends ElementsPpapdreamMod.ModElement {
	public ProcedurePenguinOnBlockRightClicked(ElementsPpapdreamMod instance) {
		super(instance, 52);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PenguinOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A76\u00A7l\uAE4A\uC740 \uC7A0\uC5D0 \uBE60\uC838\uC788\uB2E4"),
					(true));
		}
	}
}
