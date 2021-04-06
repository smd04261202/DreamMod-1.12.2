
package jptv.seomoodi.ppapdream.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Iterator;
import java.util.ArrayList;

@ElementsPpapdreamMod.ModElement.Tag
public class EntityDreamFishGreen extends ElementsPpapdreamMod.ModElement {
	public static final int ENTITYID = 9;
	public static final int ENTITYID_RANGED = 10;
	public EntityDreamFishGreen(ElementsPpapdreamMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.entities
				.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("ppapdream", "dream_fish_green"), ENTITYID)
						.name("dream_fish_green").tracker(64, 3, true).egg(-13369396, -13369396).build());
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelcustom_model(), 0.4f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("ppapdream:textures/dream_fish_green.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntitySquid {
		public EntityCustom(World world) {
			super(world);
			setSize(0.4f, 0.4f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected boolean canDespawn() {
			return false;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0D);
		}

		@Override
		public boolean canBreatheUnderwater() {
			return true;
		}

		@Override
		public boolean getCanSpawnHere() {
			return true;
		}

		@Override
		public boolean isNotColliding() {
			return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
		}

		@Override
		public boolean isPushedByWater() {
			return false;
		}
	}

	public static class Modelcustom_model extends ModelBase {
		private final ModelRenderer dorsal;
		private final ModelRenderer dorsal_r1;
		private final ModelRenderer abdominalfin;
		private final ModelRenderer abdominalfin_r1;
		private final ModelRenderer tailfin;
		private final ModelRenderer tailfin_r1;
		private final ModelRenderer Pectoralfin_left;
		private final ModelRenderer Pectoralfin_left_r1;
		private final ModelRenderer Pectoralfin_right;
		private final ModelRenderer Pectoralfin_right_r1;
		private final ModelRenderer bb_main;
		public Modelcustom_model() {
			textureWidth = 16;
			textureHeight = 16;
			dorsal = new ModelRenderer(this);
			dorsal.setRotationPoint(-0.5F, 19.75F, -0.25F);
			dorsal_r1 = new ModelRenderer(this);
			dorsal_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			dorsal.addChild(dorsal_r1);
			setRotationAngle(dorsal_r1, -0.6545F, 0.0F, 0.0F);
			dorsal_r1.cubeList.add(new ModelBox(dorsal_r1, 6, 6, 0.0F, -3.0F, -1.0F, 0, 4, 3, 0.0F, false));
			abdominalfin = new ModelRenderer(this);
			abdominalfin.setRotationPoint(-0.5F, 22.25F, -0.25F);
			setRotationAngle(abdominalfin, 0.0F, 0.0F, -3.1416F);
			abdominalfin_r1 = new ModelRenderer(this);
			abdominalfin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			abdominalfin.addChild(abdominalfin_r1);
			setRotationAngle(abdominalfin_r1, -0.6545F, 0.0F, 0.0F);
			abdominalfin_r1.cubeList.add(new ModelBox(abdominalfin_r1, 6, 6, 0.0F, -3.0F, -1.0F, 0, 4, 3, 0.0F, false));
			tailfin = new ModelRenderer(this);
			tailfin.setRotationPoint(-0.5F, 21.75F, 2.25F);
			tailfin_r1 = new ModelRenderer(this);
			tailfin_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
			tailfin.addChild(tailfin_r1);
			setRotationAngle(tailfin_r1, -0.7418F, 0.0F, 0.0F);
			tailfin_r1.cubeList.add(new ModelBox(tailfin_r1, 0, 0, 0.0F, -2.75F, -0.25F, 0, 2, 2, 0.0F, false));
			Pectoralfin_left = new ModelRenderer(this);
			Pectoralfin_left.setRotationPoint(0.0F, 21.0F, 0.0F);
			Pectoralfin_left_r1 = new ModelRenderer(this);
			Pectoralfin_left_r1.setRotationPoint(-0.5F, 0.0F, 0.5F);
			Pectoralfin_left.addChild(Pectoralfin_left_r1);
			setRotationAngle(Pectoralfin_left_r1, 0.0F, -0.7854F, 0.0F);
			Pectoralfin_left_r1.cubeList.add(new ModelBox(Pectoralfin_left_r1, 6, 6, -0.25F, -1.25F, -0.75F, 2, 2, 0, 0.0F, false));
			Pectoralfin_right = new ModelRenderer(this);
			Pectoralfin_right.setRotationPoint(0.0F, 24.0F, 0.0F);
			Pectoralfin_right_r1 = new ModelRenderer(this);
			Pectoralfin_right_r1.setRotationPoint(-4.5F, -3.0F, 0.5F);
			Pectoralfin_right.addChild(Pectoralfin_right_r1);
			setRotationAngle(Pectoralfin_right_r1, 0.0F, -2.3562F, 0.0F);
			Pectoralfin_right_r1.cubeList.add(new ModelBox(Pectoralfin_right_r1, 0, 0, -3.25F, -1.25F, -2.0F, 2, 2, 0, 0.0F, false));
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -4.0F, -2.0F, 1, 2, 4, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			dorsal.render(f5);
			abdominalfin.render(f5);
			tailfin.render(f5);
			Pectoralfin_left.render(f5);
			Pectoralfin_right.render(f5);
			bb_main.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.tailfin.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Pectoralfin_left.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Pectoralfin_right.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
