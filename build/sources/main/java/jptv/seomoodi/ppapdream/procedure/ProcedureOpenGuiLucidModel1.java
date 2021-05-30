package jptv.seomoodi.ppapdream.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import jptv.seomoodi.ppapdream.gui.GuiGuiLucidModel;
import jptv.seomoodi.ppapdream.PpapdreamMod;
import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;

@ElementsPpapdreamMod.ModElement.Tag
public class ProcedureOpenGuiLucidModel1 extends ElementsPpapdreamMod.ModElement {
	public ProcedureOpenGuiLucidModel1(ElementsPpapdreamMod instance) {
		super(instance, 273);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenGuiLucidModel1!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenGuiLucidModel1!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenGuiLucidModel1!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenGuiLucidModel1!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenGuiLucidModel1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(PpapdreamMod.instance, GuiGuiLucidModel.GUIID, world, x, y, z);
	}
}
