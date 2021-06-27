package jptv.seomoodi.ppapdream.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;

@ElementsPpapdreamMod.ModElement.Tag
public class ProcedureLucydpatchOnBlockRightClicked extends ElementsPpapdreamMod.ModElement {
	public ProcedureLucydpatchOnBlockRightClicked(ElementsPpapdreamMod instance) {
		super(instance, 422);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LucydpatchOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00a7e\u00a7l\ub354\ub294 \uc0ac\uc6a9\ud560 \uc218 \uc5c6\ub2e4"), (true));
		}
	}
}
