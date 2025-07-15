package com.aitextras.client.models.decor.hudolinsupport;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class HudolinSupportTopModel extends SinglePartEntityModel {
    private final ModelPart root;
    public HudolinSupportTopModel(ModelPart root) {
        this.root = root.getChild("root");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(48, 91).cuboid(-3.0F, -71.7462F, -44.479F, 6.0F, 5.0F, 32.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.2538F, 9.479F, 3.1416F, 0.0F, 3.1416F));

        ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(43, 77).cuboid(-4.5F, -1.3797F, -8.1673F, 9.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -72.7462F, -8.479F, 0.3491F, 0.0F, 0.0F));

        ModelPartData cube_r2 = root.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -103.0F, 0.0F, 8.0F, 103.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 36.2538F, 2.521F, 0.1745F, 0.0F, 0.0F));

        ModelPartData x = root.addChild("x", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.2538F, -2.479F));

        ModelPartData bone = x.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.2354F, 13.4359F));

        ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r4 = bone.addChild("cube_r4", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone2 = x.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.2354F, 12.4359F));

        ModelPartData cube_r5 = bone2.addChild("cube_r5", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r6 = bone2.addChild("cube_r6", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone3 = x.addChild("bone3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -12.2354F, 11.2359F));

        ModelPartData cube_r7 = bone3.addChild("cube_r7", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r8 = bone3.addChild("cube_r8", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone4 = x.addChild("bone4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -18.2354F, 10.2359F));

        ModelPartData cube_r9 = bone4.addChild("cube_r9", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r10 = bone4.addChild("cube_r10", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone5 = x.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -24.2354F, 9.2359F));

        ModelPartData cube_r11 = bone5.addChild("cube_r11", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r12 = bone5.addChild("cube_r12", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone6 = x.addChild("bone6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -30.2354F, 8.1359F));

        ModelPartData cube_r13 = bone6.addChild("cube_r13", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r14 = bone6.addChild("cube_r14", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone8 = x.addChild("bone8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -42.2354F, 6.0359F));

        ModelPartData cube_r15 = bone8.addChild("cube_r15", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r16 = bone8.addChild("cube_r16", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone9 = x.addChild("bone9", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -48.2354F, 4.9359F));

        ModelPartData cube_r17 = bone9.addChild("cube_r17", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r18 = bone9.addChild("cube_r18", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone10 = x.addChild("bone10", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -54.2354F, 3.9359F));

        ModelPartData cube_r19 = bone10.addChild("cube_r19", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r20 = bone10.addChild("cube_r20", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone11 = x.addChild("bone11", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -60.2354F, 2.8359F));

        ModelPartData cube_r21 = bone11.addChild("cube_r21", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r22 = bone11.addChild("cube_r22", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone12 = x.addChild("bone12", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -66.2354F, 1.7359F));

        ModelPartData cube_r23 = bone12.addChild("cube_r23", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r24 = bone12.addChild("cube_r24", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone13 = x.addChild("bone13", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -72.2354F, 0.7359F));

        ModelPartData cube_r25 = bone13.addChild("cube_r25", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r26 = bone13.addChild("cube_r26", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone14 = x.addChild("bone14", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -78.2354F, -0.2641F));

        ModelPartData cube_r27 = bone14.addChild("cube_r27", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r28 = bone14.addChild("cube_r28", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone7 = x.addChild("bone7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -36.2354F, 7.1359F));

        ModelPartData cube_r29 = bone7.addChild("cube_r29", ModelPartBuilder.create().uv(111, 34).cuboid(-5.5F, -0.5F, 0.0F, 8.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.483F, -1.3165F, -0.2558F, 0.1745F, 0.0F, 0.0F));

        ModelPartData x2 = root.addChild("x2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.2538F, -13.479F));

        ModelPartData bone15 = x2.addChild("bone15", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.2354F, 13.4359F));

        ModelPartData cube_r30 = bone15.addChild("cube_r30", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r31 = bone15.addChild("cube_r31", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone16 = x2.addChild("bone16", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.2354F, 12.4359F));

        ModelPartData cube_r32 = bone16.addChild("cube_r32", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r33 = bone16.addChild("cube_r33", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone17 = x2.addChild("bone17", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -12.2354F, 11.2359F));

        ModelPartData cube_r34 = bone17.addChild("cube_r34", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r35 = bone17.addChild("cube_r35", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone18 = x2.addChild("bone18", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -18.2354F, 10.2359F));

        ModelPartData cube_r36 = bone18.addChild("cube_r36", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r37 = bone18.addChild("cube_r37", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone19 = x2.addChild("bone19", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -24.2354F, 9.2359F));

        ModelPartData cube_r38 = bone19.addChild("cube_r38", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r39 = bone19.addChild("cube_r39", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone20 = x2.addChild("bone20", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -30.2354F, 8.1359F));

        ModelPartData cube_r40 = bone20.addChild("cube_r40", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r41 = bone20.addChild("cube_r41", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone21 = x2.addChild("bone21", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -42.2354F, 6.0359F));

        ModelPartData cube_r42 = bone21.addChild("cube_r42", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r43 = bone21.addChild("cube_r43", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone22 = x2.addChild("bone22", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -48.2354F, 4.9359F));

        ModelPartData cube_r44 = bone22.addChild("cube_r44", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r45 = bone22.addChild("cube_r45", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone23 = x2.addChild("bone23", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -54.2354F, 3.9359F));

        ModelPartData cube_r46 = bone23.addChild("cube_r46", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r47 = bone23.addChild("cube_r47", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone24 = x2.addChild("bone24", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -60.2354F, 2.8359F));

        ModelPartData cube_r48 = bone24.addChild("cube_r48", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r49 = bone24.addChild("cube_r49", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone25 = x2.addChild("bone25", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -66.2354F, 1.7359F));

        ModelPartData cube_r50 = bone25.addChild("cube_r50", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r51 = bone25.addChild("cube_r51", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone26 = x2.addChild("bone26", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -72.2354F, 0.7359F));

        ModelPartData cube_r52 = bone26.addChild("cube_r52", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r53 = bone26.addChild("cube_r53", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone27 = x2.addChild("bone27", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -78.2354F, -0.2641F));

        ModelPartData cube_r54 = bone27.addChild("cube_r54", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, -0.1343F, 0.1119F, -2.451F));

        ModelPartData cube_r55 = bone27.addChild("cube_r55", ModelPartBuilder.create().uv(110, 48).cuboid(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.083F, -1.3165F, -0.2558F, 0.1343F, 0.1119F, -0.6906F));

        ModelPartData bone28 = x2.addChild("bone28", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -36.2354F, 7.1359F));

        ModelPartData cube_r56 = bone28.addChild("cube_r56", ModelPartBuilder.create().uv(111, 34).cuboid(-5.5F, -0.5F, 0.0F, 8.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.483F, -1.3165F, -0.2558F, 0.1745F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }


    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }
}
