
package jptv.seomoodi.ppapdream.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.EntityFlyHelper;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;
import net.minecraft.block.state.IBlockState;

import jptv.seomoodi.ppapdream.ElementsPpapdreamMod;

import java.util.Random;
import java.util.Iterator;
import java.util.ArrayList;

@ElementsPpapdreamMod.ModElement.Tag
public class EntityDreamDragonFly extends ElementsPpapdreamMod.ModElement {
	public static final int ENTITYID = 14;
	public static final int ENTITYID_RANGED = 15;
	public EntityDreamDragonFly(ElementsPpapdreamMod instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.entities
				.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("ppapdream", "dream_dragon_fly"), ENTITYID)
						.name("dream_dragon_fly").tracker(64, 3, true).egg(-16724737, -16724737).build());
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
			return new RenderLiving(renderManager, new Modeldream_dragonfly(), 0.4f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("ppapdream:textures/dream_dragonfly.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature {
		public EntityCustom(World world) {
			super(world);
			setSize(0.8f, 0.4f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
			this.navigator = new PathNavigateFlying(this, this.world);
			this.moveHelper = new EntityFlyHelper(this);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAILookIdle(this));
			this.tasks.addTask(2, new EntityAIWander(this, 0.8, 20) {
				@Override
				protected Vec3d getPosition() {
					Random random = EntityCustom.this.getRNG();
					double dir_x = EntityCustom.this.posX + ((random.nextFloat() * 2 - 1) * 16);
					double dir_y = EntityCustom.this.posY + ((random.nextFloat() * 2 - 1) * 16);
					double dir_z = EntityCustom.this.posZ + ((random.nextFloat() * 2 - 1) * 16);
					return new Vec3d(dir_x, dir_y, dir_z);
				}
			});
			this.tasks.addTask(3, new EntityAILeapAtTarget(this, (float) 0.8));
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
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("ppapdream:dream_dragonfly"));
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
		public void fall(float l, float d) {
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.LIGHTNING_BOLT)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.8D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0D);
			this.getAttributeMap().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
			this.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.8);
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			this.setNoGravity(true);
		}

		@Override
		protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {
		}

		@Override
		public void setNoGravity(boolean ignored) {
			super.setNoGravity(true);
		}
	}

	public static class Modeldream_dragonfly extends ModelBase {
		private final ModelRenderer body;
		private final ModelRenderer wing_right;
		private final ModelRenderer wing_f_r1;
		private final ModelRenderer wing_left;
		private final ModelRenderer wing_f_r2;
		private final ModelRenderer bb_main;
		public Modeldream_dragonfly() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(1.0F, 16.0F, -3.0F);
			body.cubeList.add(new ModelBox(body, 9, 12, -2.0F, 6.0F, 6.0F, 1, 1, 5, 0.0F, false));
			body.cubeList.add(new ModelBox(body, 0, 8, -2.5F, 5.5F, 1.0F, 2, 2, 5, 0.0F, false));
			body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, 5.0F, -4.0F, 3, 3, 5, 0.0F, false));
			wing_right = new ModelRenderer(this);
			wing_right.setRotationPoint(-0.5F, 21.0F, -4.5F);
			setRotationAngle(wing_right, 0.0F, 3.1416F, 0.0F);
			wing_f_r1 = new ModelRenderer(this);
			wing_f_r1.setRotationPoint(0.0F, -8.0F, 1.25F);
			wing_right.addChild(wing_f_r1);
			setRotationAngle(wing_f_r1, 0.0F, 0.0F, -0.4363F);
			wing_f_r1.cubeList.add(new ModelBox(wing_f_r1, 7, 8, -3.3807F, 7.2506F, -1.0F, 8, 0, 2, 0.0F, false));
			wing_f_r1.cubeList.add(new ModelBox(wing_f_r1, 9, 0, -3.3807F, 7.2506F, -3.5F, 8, 0, 2, 0.0F, false));
			wing_left = new ModelRenderer(this);
			wing_left.setRotationPoint(-0.5F, 21.0F, -4.5F);
			wing_f_r2 = new ModelRenderer(this);
			wing_f_r2.setRotationPoint(0.0F, -8.0F, -1.25F);
			wing_left.addChild(wing_f_r2);
			setRotationAngle(wing_f_r2, 0.0F, 0.0F, -0.4363F);
			wing_f_r2.cubeList.add(new ModelBox(wing_f_r2, 7, 10, -3.3807F, 7.2506F, -1.0F, 8, 0, 2, 0.0F, false));
			wing_f_r2.cubeList.add(new ModelBox(wing_f_r2, 9, 2, -3.3807F, 7.2506F, 1.5F, 8, 0, 2, 0.0F, false));
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 15, -1.5F, -2.5F, -8.75F, 2, 2, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			body.render(f5);
			wing_right.render(f5);
			wing_left.render(f5);
			bb_main.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.wing_left.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.wing_right.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
