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