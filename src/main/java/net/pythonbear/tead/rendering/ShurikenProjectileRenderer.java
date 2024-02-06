package net.pythonbear.tead.rendering;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3f;
import net.pythonbear.tead.entity.ShurikenProjectileEntity;
import net.pythonbear.tead.init.TeadItems;

public class ShurikenProjectileRenderer extends FlyingItemEntityRenderer<ShurikenProjectileEntity> {
    private final ItemRenderer itemRenderer;
    private final float scale;

    public ShurikenProjectileRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.itemRenderer = context.getItemRenderer();
        this.scale = 1;
    }

    @Override
    public void render(ShurikenProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        if (entity.age >= 2 || !(this.dispatcher.camera.getFocusedEntity().squaredDistanceTo(entity) < 12.25)) {
            matrices.push();
            matrices.scale(this.scale, this.scale, this.scale);
            matrices.multiply(this.dispatcher.getRotation());
            matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180.0F));
            Vec3f.POSITIVE_X.getDegreesQuaternion(90.0F);
            this.itemRenderer.renderItem(null, TeadItems.SHURIKEN.getDefaultStack(),
                    ModelTransformation.Mode.GROUND, false, matrices, vertexConsumers, entity.getWorld(),
                    light, OverlayTexture.DEFAULT_UV, entity.getId());
            matrices.pop();
            super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
        }
    }
}
