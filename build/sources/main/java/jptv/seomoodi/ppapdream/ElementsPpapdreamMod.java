/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package jptv.seomoodi.ppapdream;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import jptv.seomoodi.ppapdream.gui.GuiGuiYSsul;
import jptv.seomoodi.ppapdream.gui.GuiGuiXSsul;
import jptv.seomoodi.ppapdream.gui.GuiGuiTreasureSecond;
import jptv.seomoodi.ppapdream.gui.GuiGuiTreasureFinalMap;
import jptv.seomoodi.ppapdream.gui.GuiGuiSalProfile;
import jptv.seomoodi.ppapdream.gui.GuiGuiRemTourPaper03;
import jptv.seomoodi.ppapdream.gui.GuiGuiRemTourPaper02;
import jptv.seomoodi.ppapdream.gui.GuiGuiRemTourPaper01;
import jptv.seomoodi.ppapdream.gui.GuiGuiPgeTravelPhoto02;
import jptv.seomoodi.ppapdream.gui.GuiGuiPgeTravelPhoto01;
import jptv.seomoodi.ppapdream.gui.GuiGuiPgeProfile;
import jptv.seomoodi.ppapdream.gui.GuiGuiPgeFourcut;
import jptv.seomoodi.ppapdream.gui.GuiGuiPgeDiary;
import jptv.seomoodi.ppapdream.gui.GuiGuiPenguinPaper;
import jptv.seomoodi.ppapdream.gui.GuiGuiOgrApplication;
import jptv.seomoodi.ppapdream.gui.GuiGuiNbpApplication;
import jptv.seomoodi.ppapdream.gui.GuiGuiMsgApplication;
import jptv.seomoodi.ppapdream.gui.GuiGuiMineManual02;
import jptv.seomoodi.ppapdream.gui.GuiGuiMineManual01;
import jptv.seomoodi.ppapdream.gui.GuiGuiMap;
import jptv.seomoodi.ppapdream.gui.GuiGuiLucidDreamHall;
import jptv.seomoodi.ppapdream.gui.GuiGuiKjpProfile;
import jptv.seomoodi.ppapdream.gui.GuiGuiKjpDriveLicense;
import jptv.seomoodi.ppapdream.gui.GuiGuiIOgrBucketlistPoster;
import jptv.seomoodi.ppapdream.gui.GuiGuiHsdApplication;
import jptv.seomoodi.ppapdream.gui.GuiGuiHotelPaper;
import jptv.seomoodi.ppapdream.gui.GuiGuiHotelLight;
import jptv.seomoodi.ppapdream.gui.GuiGuiGsdMypad;
import jptv.seomoodi.ppapdream.gui.GuiGuiGloDrawing;
import jptv.seomoodi.ppapdream.gui.GuiGuiGloApplication;
import jptv.seomoodi.ppapdream.gui.GuiGuiFanMypad03;
import jptv.seomoodi.ppapdream.gui.GuiGuiFanMypad02;
import jptv.seomoodi.ppapdream.gui.GuiGuiFanMypad;
import jptv.seomoodi.ppapdream.gui.GuiGuiDlcGardenscape;
import jptv.seomoodi.ppapdream.gui.GuiGuiDlcAbhPoster;
import jptv.seomoodi.ppapdream.gui.GuiGuiBucketList;
import jptv.seomoodi.ppapdream.gui.GuiGuiAbhSisterPhoto;
import jptv.seomoodi.ppapdream.gui.GuiGuiAbhPracticeNote;
import jptv.seomoodi.ppapdream.gui.GuiGuiAbhPhotoCard;
import jptv.seomoodi.ppapdream.gui.GuiGuiAbHApplication;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ElementsPpapdreamMod implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public ElementsPpapdreamMod() {
		sounds.put(new ResourceLocation("ppapdream", "bakha_demo_song"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ppapdream", "bakha_demo_song")));
		sounds.put(new ResourceLocation("ppapdream", "voice_alak01"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ppapdream", "voice_alak01")));
		sounds.put(new ResourceLocation("ppapdream", "voice_ppap01"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ppapdream", "voice_ppap01")));
		sounds.put(new ResourceLocation("ppapdream", "revolver_shot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ppapdream", "revolver_shot")));
		sounds.put(new ResourceLocation("ppapdream", "dream_dragonfly"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("ppapdream", "dream_dragonfly")));
	}

	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsPpapdreamMod.ModElement.class)
					elements.add((ElementsPpapdreamMod.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsPpapdreamMod.ModElement::initElements);
		this.addNetworkMessage(PpapdreamModVariables.WorldSavedDataSyncMessageHandler.class, PpapdreamModVariables.WorldSavedDataSyncMessage.class,
				Side.SERVER, Side.CLIENT);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = PpapdreamModVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = PpapdreamModVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				PpapdreamMod.PACKET_HANDLER.sendTo(new PpapdreamModVariables.WorldSavedDataSyncMessage(0, mapdata), (EntityPlayerMP) event.player);
			if (worlddata != null)
				PpapdreamMod.PACKET_HANDLER.sendTo(new PpapdreamModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = PpapdreamModVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				PpapdreamMod.PACKET_HANDLER.sendTo(new PpapdreamModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			PpapdreamMod.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}
	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiGuiAbhPhotoCard.GUIID)
				return new GuiGuiAbhPhotoCard.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiAbhPracticeNote.GUIID)
				return new GuiGuiAbhPracticeNote.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiSalProfile.GUIID)
				return new GuiGuiSalProfile.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiDlcAbhPoster.GUIID)
				return new GuiGuiDlcAbhPoster.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiDlcGardenscape.GUIID)
				return new GuiGuiDlcGardenscape.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiGloDrawing.GUIID)
				return new GuiGuiGloDrawing.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiPgeTravelPhoto01.GUIID)
				return new GuiGuiPgeTravelPhoto01.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiPgeTravelPhoto02.GUIID)
				return new GuiGuiPgeTravelPhoto02.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiPgeFourcut.GUIID)
				return new GuiGuiPgeFourcut.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiKjpProfile.GUIID)
				return new GuiGuiKjpProfile.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiPgeProfile.GUIID)
				return new GuiGuiPgeProfile.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiGsdMypad.GUIID)
				return new GuiGuiGsdMypad.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiKjpDriveLicense.GUIID)
				return new GuiGuiKjpDriveLicense.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiIOgrBucketlistPoster.GUIID)
				return new GuiGuiIOgrBucketlistPoster.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiXSsul.GUIID)
				return new GuiGuiXSsul.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiYSsul.GUIID)
				return new GuiGuiYSsul.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiFanMypad.GUIID)
				return new GuiGuiFanMypad.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiAbHApplication.GUIID)
				return new GuiGuiAbHApplication.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiGloApplication.GUIID)
				return new GuiGuiGloApplication.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiHsdApplication.GUIID)
				return new GuiGuiHsdApplication.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiMsgApplication.GUIID)
				return new GuiGuiMsgApplication.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiOgrApplication.GUIID)
				return new GuiGuiOgrApplication.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiAbhSisterPhoto.GUIID)
				return new GuiGuiAbhSisterPhoto.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiMineManual01.GUIID)
				return new GuiGuiMineManual01.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiMineManual02.GUIID)
				return new GuiGuiMineManual02.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiFanMypad02.GUIID)
				return new GuiGuiFanMypad02.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiFanMypad03.GUIID)
				return new GuiGuiFanMypad03.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiMap.GUIID)
				return new GuiGuiMap.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiHotelPaper.GUIID)
				return new GuiGuiHotelPaper.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiNbpApplication.GUIID)
				return new GuiGuiNbpApplication.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiLucidDreamHall.GUIID)
				return new GuiGuiLucidDreamHall.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiRemTourPaper01.GUIID)
				return new GuiGuiRemTourPaper01.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiRemTourPaper02.GUIID)
				return new GuiGuiRemTourPaper02.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiRemTourPaper03.GUIID)
				return new GuiGuiRemTourPaper03.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiBucketList.GUIID)
				return new GuiGuiBucketList.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiPenguinPaper.GUIID)
				return new GuiGuiPenguinPaper.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiTreasureFinalMap.GUIID)
				return new GuiGuiTreasureFinalMap.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiTreasureSecond.GUIID)
				return new GuiGuiTreasureSecond.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiPgeDiary.GUIID)
				return new GuiGuiPgeDiary.GuiContainerMod(world, x, y, z, player);
			if (id == GuiGuiHotelLight.GUIID)
				return new GuiGuiHotelLight.GuiContainerMod(world, x, y, z, player);
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiGuiAbhPhotoCard.GUIID)
				return new GuiGuiAbhPhotoCard.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiAbhPracticeNote.GUIID)
				return new GuiGuiAbhPracticeNote.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiSalProfile.GUIID)
				return new GuiGuiSalProfile.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiDlcAbhPoster.GUIID)
				return new GuiGuiDlcAbhPoster.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiDlcGardenscape.GUIID)
				return new GuiGuiDlcGardenscape.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiGloDrawing.GUIID)
				return new GuiGuiGloDrawing.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiPgeTravelPhoto01.GUIID)
				return new GuiGuiPgeTravelPhoto01.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiPgeTravelPhoto02.GUIID)
				return new GuiGuiPgeTravelPhoto02.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiPgeFourcut.GUIID)
				return new GuiGuiPgeFourcut.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiKjpProfile.GUIID)
				return new GuiGuiKjpProfile.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiPgeProfile.GUIID)
				return new GuiGuiPgeProfile.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiGsdMypad.GUIID)
				return new GuiGuiGsdMypad.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiKjpDriveLicense.GUIID)
				return new GuiGuiKjpDriveLicense.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiIOgrBucketlistPoster.GUIID)
				return new GuiGuiIOgrBucketlistPoster.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiXSsul.GUIID)
				return new GuiGuiXSsul.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiYSsul.GUIID)
				return new GuiGuiYSsul.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiFanMypad.GUIID)
				return new GuiGuiFanMypad.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiAbHApplication.GUIID)
				return new GuiGuiAbHApplication.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiGloApplication.GUIID)
				return new GuiGuiGloApplication.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiHsdApplication.GUIID)
				return new GuiGuiHsdApplication.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiMsgApplication.GUIID)
				return new GuiGuiMsgApplication.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiOgrApplication.GUIID)
				return new GuiGuiOgrApplication.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiAbhSisterPhoto.GUIID)
				return new GuiGuiAbhSisterPhoto.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiMineManual01.GUIID)
				return new GuiGuiMineManual01.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiMineManual02.GUIID)
				return new GuiGuiMineManual02.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiFanMypad02.GUIID)
				return new GuiGuiFanMypad02.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiFanMypad03.GUIID)
				return new GuiGuiFanMypad03.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiMap.GUIID)
				return new GuiGuiMap.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiHotelPaper.GUIID)
				return new GuiGuiHotelPaper.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiNbpApplication.GUIID)
				return new GuiGuiNbpApplication.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiLucidDreamHall.GUIID)
				return new GuiGuiLucidDreamHall.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiRemTourPaper01.GUIID)
				return new GuiGuiRemTourPaper01.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiRemTourPaper02.GUIID)
				return new GuiGuiRemTourPaper02.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiRemTourPaper03.GUIID)
				return new GuiGuiRemTourPaper03.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiBucketList.GUIID)
				return new GuiGuiBucketList.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiPenguinPaper.GUIID)
				return new GuiGuiPenguinPaper.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiTreasureFinalMap.GUIID)
				return new GuiGuiTreasureFinalMap.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiTreasureSecond.GUIID)
				return new GuiGuiTreasureSecond.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiPgeDiary.GUIID)
				return new GuiGuiPgeDiary.GuiWindow(world, x, y, z, player);
			if (id == GuiGuiHotelLight.GUIID)
				return new GuiGuiHotelLight.GuiWindow(world, x, y, z, player);
			return null;
		}
	}
	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsPpapdreamMod elements;
		protected final int sortid;
		public ModElement(ElementsPpapdreamMod elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
