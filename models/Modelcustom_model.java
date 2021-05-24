// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer base;
	private final ModelRenderer wing;

	public Modelcustom_model() {
		textureWidth = 16;
		textureHeight = 16;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.cubeList.add(new ModelBox(base, 0, 0, -5.0F, -16.0F, -8.0F, 8, 16, 24, 0.0F, false));

		wing = new ModelRenderer(this);
		wing.setRotationPoint(0.0F, 24.0F, 0.0F);
		wing.cubeList.add(new ModelBox(wing, 0, 0, 3.0F, -10.0F, 4.0F, 8, 7, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		base.render(f5);
		wing.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.wing.rotateAngleY = f2;
	}
}