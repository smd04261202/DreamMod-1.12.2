package jptv.seomoodi.ppapdream.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Map;

@ElementsPpapdreamMod.ModElement.Tag
public class ProcedureLucydpatchOnBlockRightClicked extends ElementsPpapdreamMod.ModElement {
	public ProcedureLucydpatchOnBlockRightClicked(ElementsPpapdreamMod instance) {
		super(instance, 82);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LucydpatchOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
//			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("go to Dream"), (false));
		}
//		if (entity instanceof EntityLivingBase)
//			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 240, (int) 2, (false), (false)));
//		if (entity instanceof EntityLivingBase)
//			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 280, (int) 1, (false), (false)));
//		if (entity instanceof EntityLivingBase)
//			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 230, (int) 2, (false), (false)));
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00a76\u00a7l\uc7a0\uc5d0 \ube60\uc838\ub4e0\ub2e4"),
					(true));
		Minecraft.getMinecraft().player.sendChatMessage("/go dream");  // Connect Skript
	}
}
