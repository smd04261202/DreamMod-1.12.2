public static class Modeldream_fish extends ModelBase {
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

	public Modeldream_fish() {
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
		Pectoralfin_left.setRotationPoint(-0.15F, 20.8F, -0.2F);

		Pectoralfin_left_r1 = new ModelRenderer(this);
		Pectoralfin_left_r1.setRotationPoint(-0.35F, 0.2F, 0.7F);
		Pectoralfin_left.addChild(Pectoralfin_left_r1);
		setRotationAngle(Pectoralfin_left_r1, 0.0F, -0.7854F, 0.0F);
		Pectoralfin_left_r1.cubeList
				.add(new ModelBox(Pectoralfin_left_r1, 6, 6, -0.25F, -1.25F, -0.75F, 2, 2, 0, 0.0F, false));

		Pectoralfin_right = new ModelRenderer(this);
		Pectoralfin_right.setRotationPoint(-0.8F, 20.8F, -0.4F);

		Pectoralfin_right_r1 = new ModelRenderer(this);
		Pectoralfin_right_r1.setRotationPoint(-3.7F, 0.2F, 0.9F);
		Pectoralfin_right.addChild(Pectoralfin_right_r1);
		setRotationAngle(Pectoralfin_right_r1, 0.0F, -2.3562F, 0.0F);
		Pectoralfin_right_r1.cubeList
				.add(new ModelBox(Pectoralfin_right_r1, 0, 0, -3.25F, -1.25F, -2.0F, 2, 2, 0, 0.0F, false));

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
		this.tailfin.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Pectoralfin_left.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Pectoralfin_right.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}