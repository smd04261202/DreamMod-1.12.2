package jptv.seomoodi.ppapdream.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import jptv.seomoodi.ppapdream.gui.GuiGuiLucidDreamHallDram;
import jptv.seomoodi.ppapdream.PpapdreamMod;
import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;

@ElementsPpapdreamMod.ModElement.Tag
public class ProcedureLucidDreamHallDreamRightClickedInAir extends ElementsPpapdreamMod.ModElement {
	public ProcedureLucidDreamHallDreamRightClickedInAir(ElementsPpapdreamMod instance) {
		super(instance, 296);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LucidDreamHallDreamRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LucidDreamHallDreamRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LucidDreamHallDreamRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LucidDreamHallDreamRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LucidDreamHallDreamRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(PpapdreamMod.instance, GuiGuiLucidDreamHallDram.GUIID, world, x, y, z);
	}
}
