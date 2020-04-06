package com.colenobi.hyperion.entity.models;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMrSecure extends ModelBase {
	private final ModelRenderer main;
	private final ModelRenderer body_upper;
	private final ModelRenderer aaaab;
	private final ModelRenderer aaaabb;
	private final ModelRenderer logics_screen;
	private final ModelRenderer abbab;
	private final ModelRenderer abbbab;
	private final ModelRenderer armR;
	private final ModelRenderer abbabba;
	private final ModelRenderer coverR;
	private final ModelRenderer armR1;
	private final ModelRenderer armR2;
	private final ModelRenderer armR3;
	private final ModelRenderer armR4;
	private final ModelRenderer armR5;
	private final ModelRenderer handR1;
	private final ModelRenderer handR2;
	private final ModelRenderer handR3;
	private final ModelRenderer handR4;
	private final ModelRenderer handR5;
	private final ModelRenderer handR6;
	private final ModelRenderer handR7;
	private final ModelRenderer handR8;
	private final ModelRenderer handR9;
	private final ModelRenderer armL;
	private final ModelRenderer abbabbbb;
	private final ModelRenderer coverL;
	private final ModelRenderer armL1;
	private final ModelRenderer armL2;
	private final ModelRenderer armL3;
	private final ModelRenderer armL4;
	private final ModelRenderer armL5;
	private final ModelRenderer handL1;
	private final ModelRenderer handL2;
	private final ModelRenderer handL3;
	private final ModelRenderer handL4;
	private final ModelRenderer handL5;
	private final ModelRenderer handL6;
	private final ModelRenderer handL7;
	private final ModelRenderer handL8;
	private final ModelRenderer handL9;
	private final ModelRenderer body_lower;
	private final ModelRenderer aaabb;
	private final ModelRenderer aaaaabb;
	private final ModelRenderer aabbbbbb;
	private final ModelRenderer axel;
	private final ModelRenderer ababbbb;
	private final ModelRenderer wheel;
	private final ModelRenderer wheel2;

	public ModelMrSecure() {
		textureWidth = 128;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 23.0F, 0.0F);

		body_upper = new ModelRenderer(this);
		body_upper.setRotationPoint(0.0F, -18.0F, 0.0F);
		main.addChild(body_upper);
		body_upper.cubeList.add(new ModelBox(body_upper, 32, 30, -4.0F, -1.8F, -4.0F, 8, 2, 8, 0.0F, false));
		body_upper.cubeList.add(new ModelBox(body_upper, 40, 40, -3.5F, -11.6F, -6.2F, 7, 7, 2, 0.0F, false));
		body_upper.cubeList.add(new ModelBox(body_upper, 36, 19, -4.5F, -2.0F, -4.5F, 9, 1, 9, 0.0F, false));
		body_upper.cubeList.add(new ModelBox(body_upper, 0, 0, -4.5F, -12.0F, -4.5F, 9, 10, 9, 0.0F, false));
		body_upper.cubeList.add(new ModelBox(body_upper, 0, 55, -4.5F, -11.4142F, -5.9142F, 9, 3, 1, 0.0F, false));
		body_upper.cubeList.add(new ModelBox(body_upper, 50, 61, -4.5F, -8.4142F, -5.9142F, 3, 6, 1, 0.0F, false));
		body_upper.cubeList.add(new ModelBox(body_upper, 50, 61, 1.5F, -8.4142F, -5.9142F, 3, 6, 1, 0.0F, true));
		body_upper.cubeList.add(new ModelBox(body_upper, 72, 19, -3.5F, -12.96F, -5.5F, 7, 1, 10, 0.0F, false));
		body_upper.cubeList.add(new ModelBox(body_upper, 60, 52, -3.875F, -11.6F, -6.7F, 7, 0, 2, 0.0F, false));

		aaaab = new ModelRenderer(this);
		aaaab.setRotationPoint(-4.5F, 17.0F, 1.0F);
		setRotationAngle(aaaab, -0.7854F, 0.0F, 0.0F);
		body_upper.addChild(aaaab);
		aaaab.cubeList.add(new ModelBox(aaaab, 58, 44, 0.0F, -10.8388F, -18.617F, 9, 2, 2, 0.0F, false));

		aaaabb = new ModelRenderer(this);
		aaaabb.setRotationPoint(0.5F, -12.5F, -0.5F);
		setRotationAngle(aaaabb, -0.0873F, 0.0F, 0.0F);
		body_upper.addChild(aaaabb);
		aaaabb.cubeList.add(new ModelBox(aaaabb, 74, 0, -5.0F, -0.0292F, -5.35F, 9, 1, 10, 0.0F, false));

		logics_screen = new ModelRenderer(this);
		logics_screen.setRotationPoint(0.0F, 17.9F, -0.1F);
		body_upper.addChild(logics_screen);
		logics_screen.cubeList.add(new ModelBox(logics_screen, 64, 61, -1.65F, -22.5F, -5.5F, 3, 2, 2, 0.0F, false));
		logics_screen.cubeList.add(new ModelBox(logics_screen, 1, 78, -1.0F, -21.8F, -5.6F, 0, 0, 0, 0.0F, false));
		logics_screen.cubeList.add(new ModelBox(logics_screen, 1, 80, -1.0F, -21.1F, -5.6F, 0, 0, 0, 0.0F, false));
		logics_screen.cubeList.add(new ModelBox(logics_screen, 2, 78, -0.25F, -21.8F, -5.6F, 0, 0, 0, 0.0F, false));
		logics_screen.cubeList.add(new ModelBox(logics_screen, 2, 80, -0.25F, -21.1F, -5.6F, 0, 0, 0, 0.0F, false));
		logics_screen.cubeList.add(new ModelBox(logics_screen, 4, 78, 0.5F, -21.8F, -5.6F, 0, 0, 0, 0.0F, false));
		logics_screen.cubeList.add(new ModelBox(logics_screen, 4, 80, 0.5F, -21.1F, -5.6F, 0, 0, 0, 0.0F, false));

		abbab = new ModelRenderer(this);
		abbab.setRotationPoint(-3.75F, -11.0F, -8.5F);
		setRotationAngle(abbab, 0.0873F, 0.0F, 0.0F);
		body_upper.addChild(abbab);
		abbab.cubeList.add(new ModelBox(abbab, 24, 69, -0.125F, 0.0592F, 1.8454F, 0, 7, 1, 0.0F, false));
		abbab.cubeList.add(new ModelBox(abbab, 22, 69, 7.225F, 0.0592F, 1.8454F, 0, 7, 1, 0.0F, false));

		abbbab = new ModelRenderer(this);
		abbbab.setRotationPoint(3.0F, -3.8F, -6.5F);
		setRotationAngle(abbbab, 0.0873F, 0.0F, 0.0F);
		body_upper.addChild(abbbab);
		abbbab.cubeList.add(new ModelBox(abbbab, 30, 74, -6.475F, -0.2877F, 0.4806F, 2, 0, 1, 0.0F, false));
		abbbab.cubeList.add(new ModelBox(abbbab, 30, 74, -1.525F, -0.2877F, 0.4806F, 2, 0, 1, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-0.5F, -2.0F, 0.0F);
		body_upper.addChild(armR);
		armR.cubeList.add(new ModelBox(armR, 96, 30, 5.0F, -11.0F, -1.0F, 7, 6, 4, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 58, 61, 5.0F, -11.0F, -3.0F, 1, 6, 2, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 58, 61, 11.0F, -11.0F, -3.0F, 1, 6, 2, 0.0F, true));
		armR.cubeList.add(new ModelBox(armR, 0, 64, 6.0F, -11.0F, -3.0F, 5, 1, 2, 0.0F, false));
		armR.cubeList.add(new ModelBox(armR, 0, 61, 6.0F, -6.0F, -3.0F, 5, 1, 2, 0.0F, false));

		abbabba = new ModelRenderer(this);
		abbabba.setRotationPoint(11.5F, -8.5F, -8.0F);
		setRotationAngle(abbabba, 0.0F, 0.0F, 0.7854F);
		armR.addChild(abbabba);
		abbabba.cubeList.add(new ModelBox(abbabba, 22, 52, -6.364F, 2.8284F, 5.0F, 1, 2, 6, 0.0F, false));

		coverR = new ModelRenderer(this);
		coverR.setRotationPoint(8.5F, -6.0F, -2.7F);
		armR.addChild(coverR);
		coverR.cubeList.add(new ModelBox(coverR, 14, 61, -2.5F, -4.0F, -0.5F, 5, 4, 1, 0.0F, false));

		armR1 = new ModelRenderer(this);
		armR1.setRotationPoint(8.5F, -5.0F, 0.0F);
		armR.addChild(armR1);
		armR1.cubeList.add(new ModelBox(armR1, 64, 65, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

		armR2 = new ModelRenderer(this);
		armR2.setRotationPoint(-4.0F, 1.9F, 0.0F);
		armR1.addChild(armR2);
		armR2.cubeList.add(new ModelBox(armR2, 36, 52, 2.5F, -1.1F, -1.5F, 3, 6, 3, 0.0F, false));

		armR3 = new ModelRenderer(this);
		armR3.setRotationPoint(4.0F, 4.85F, 0.0F);
		armR2.addChild(armR3);
		armR3.cubeList.add(new ModelBox(armR3, 64, 65, -1.0F, -0.75F, -1.0F, 2, 2, 2, 0.0F, false));

		armR4 = new ModelRenderer(this);
		armR4.setRotationPoint(0.0F, 1.5F, 0.0F);
		armR3.addChild(armR4);
		armR4.cubeList.add(new ModelBox(armR4, 36, 52, -1.5F, -0.75F, -1.5F, 3, 6, 3, 0.0F, false));

		armR5 = new ModelRenderer(this);
		armR5.setRotationPoint(0.0F, 5.45F, 0.0F);
		armR4.addChild(armR5);
		armR5.cubeList.add(new ModelBox(armR5, 64, 65, -1.0F, -1.3F, -1.0F, 2, 2, 2, 0.0F, false));

		handR1 = new ModelRenderer(this);
		handR1.setRotationPoint(0.0F, 0.4F, 0.0F);
		armR5.addChild(handR1);
		handR1.cubeList.add(new ModelBox(handR1, 48, 52, -1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F, false));

		handR2 = new ModelRenderer(this);
		handR2.setRotationPoint(0.0F, 3.9F, -1.5F);
		handR1.addChild(handR2);
		handR2.cubeList.add(new ModelBox(handR2, 16, 69, -1.0F, 0.0F, -0.5F, 2, 3, 1, 0.0F, false));

		handR3 = new ModelRenderer(this);
		handR3.setRotationPoint(0.0F, 2.9F, 0.025F);
		handR2.addChild(handR3);
		handR3.cubeList.add(new ModelBox(handR3, 41, 69, -0.75F, 0.0F, -0.25F, 1, 2, 0, 0.0F, false));

		handR4 = new ModelRenderer(this);
		handR4.setRotationPoint(0.0F, 3.9F, 1.5F);
		handR1.addChild(handR4);
		handR4.cubeList.add(new ModelBox(handR4, 16, 69, -1.0F, 0.0F, -0.5F, 2, 3, 1, 0.0F, false));

		handR5 = new ModelRenderer(this);
		handR5.setRotationPoint(0.0F, 2.9F, 0.025F);
		handR4.addChild(handR5);
		handR5.cubeList.add(new ModelBox(handR5, 41, 69, -0.75F, 0.0F, -0.25F, 1, 2, 0, 0.0F, false));

		handR6 = new ModelRenderer(this);
		handR6.setRotationPoint(-1.5F, 3.9F, -0.1F);
		handR1.addChild(handR6);
		handR6.cubeList.add(new ModelBox(handR6, 10, 69, -0.5F, 0.0F, -0.9F, 1, 3, 2, 0.0F, false));

		handR7 = new ModelRenderer(this);
		handR7.setRotationPoint(0.0F, 2.9F, 0.025F);
		handR6.addChild(handR7);
		handR7.cubeList.add(new ModelBox(handR7, 36, 73, -0.225F, 0.0F, -0.675F, 0, 2, 1, 0.0F, false));

		handR8 = new ModelRenderer(this);
		handR8.setRotationPoint(1.5F, 3.9F, 0.0F);
		handR1.addChild(handR8);
		handR8.cubeList.add(new ModelBox(handR8, 10, 69, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

		handR9 = new ModelRenderer(this);
		handR9.setRotationPoint(0.0F, 2.9F, 0.025F);
		handR8.addChild(handR9);
		handR9.cubeList.add(new ModelBox(handR9, 36, 73, -0.225F, 0.0F, -0.775F, 0, 2, 1, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(0.5F, -2.0F, 0.0F);
		body_upper.addChild(armL);
		armL.cubeList.add(new ModelBox(armL, 96, 30, -12.0F, -11.0F, -1.0F, 7, 6, 4, 0.0F, true));
		armL.cubeList.add(new ModelBox(armL, 58, 61, -6.0F, -11.0F, -3.0F, 1, 6, 2, 0.0F, true));
		armL.cubeList.add(new ModelBox(armL, 58, 61, -12.0F, -11.0F, -3.0F, 1, 6, 2, 0.0F, false));
		armL.cubeList.add(new ModelBox(armL, 0, 64, -11.0F, -11.0F, -3.0F, 5, 1, 2, 0.0F, true));
		armL.cubeList.add(new ModelBox(armL, 0, 61, -11.0F, -6.0F, -3.0F, 5, 1, 2, 0.0F, false));

		abbabbbb = new ModelRenderer(this);
		abbabbbb.setRotationPoint(-11.5F, -8.5F, -8.0F);
		setRotationAngle(abbabbbb, 0.0F, 0.0F, -0.7854F);
		armL.addChild(abbabbbb);
		abbabbbb.cubeList.add(new ModelBox(abbabbbb, 22, 52, 5.364F, 2.8284F, 5.0F, 1, 2, 6, 0.0F, true));

		coverL = new ModelRenderer(this);
		coverL.setRotationPoint(-8.5F, -6.0F, -2.7F);
		armL.addChild(coverL);
		coverL.cubeList.add(new ModelBox(coverL, 14, 61, -2.5F, -4.0F, -0.5F, 5, 4, 1, 0.0F, true));

		armL1 = new ModelRenderer(this);
		armL1.setRotationPoint(-8.5F, -5.0F, 0.0F);
		armL.addChild(armL1);
		armL1.cubeList.add(new ModelBox(armL1, 64, 65, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

		armL2 = new ModelRenderer(this);
		armL2.setRotationPoint(4.0F, 1.9F, 0.0F);
		armL1.addChild(armL2);
		armL2.cubeList.add(new ModelBox(armL2, 36, 52, -5.5F, -1.1F, -1.5F, 3, 6, 3, 0.0F, true));

		armL3 = new ModelRenderer(this);
		armL3.setRotationPoint(-4.0F, 4.85F, 0.0F);
		armL2.addChild(armL3);
		armL3.cubeList.add(new ModelBox(armL3, 64, 65, -1.0F, -0.75F, -1.0F, 2, 2, 2, 0.0F, true));

		armL4 = new ModelRenderer(this);
		armL4.setRotationPoint(0.0F, 1.5F, 0.0F);
		armL3.addChild(armL4);
		armL4.cubeList.add(new ModelBox(armL4, 36, 52, -1.5F, -0.75F, -1.5F, 3, 6, 3, 0.0F, true));

		armL5 = new ModelRenderer(this);
		armL5.setRotationPoint(0.0F, 5.45F, 0.0F);
		armL4.addChild(armL5);
		armL5.cubeList.add(new ModelBox(armL5, 64, 65, -1.0F, -1.3F, -1.0F, 2, 2, 2, 0.0F, true));

		handL1 = new ModelRenderer(this);
		handL1.setRotationPoint(0.0F, 0.4F, 0.0F);
		armL5.addChild(handL1);
		handL1.cubeList.add(new ModelBox(handL1, 48, 52, -1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F, false));

		handL2 = new ModelRenderer(this);
		handL2.setRotationPoint(0.0F, 3.9F, -1.5F);
		handL1.addChild(handL2);
		handL2.cubeList.add(new ModelBox(handL2, 16, 69, -1.0F, 0.0F, -0.5F, 2, 3, 1, 0.0F, false));

		handL3 = new ModelRenderer(this);
		handL3.setRotationPoint(0.0F, 2.9F, 0.025F);
		handL2.addChild(handL3);
		handL3.cubeList.add(new ModelBox(handL3, 41, 69, -0.75F, 0.0F, -0.25F, 1, 2, 0, 0.0F, false));

		handL4 = new ModelRenderer(this);
		handL4.setRotationPoint(0.0F, 3.9F, 1.5F);
		handL1.addChild(handL4);
		handL4.cubeList.add(new ModelBox(handL4, 16, 69, -1.0F, 0.0F, -0.5F, 2, 3, 1, 0.0F, false));

		handL5 = new ModelRenderer(this);
		handL5.setRotationPoint(0.0F, 2.9F, 0.025F);
		handL4.addChild(handL5);
		handL5.cubeList.add(new ModelBox(handL5, 41, 69, -0.75F, 0.0F, -0.25F, 1, 2, 0, 0.0F, false));

		handL6 = new ModelRenderer(this);
		handL6.setRotationPoint(-1.5F, 3.9F, -0.1F);
		handL1.addChild(handL6);
		handL6.cubeList.add(new ModelBox(handL6, 10, 69, -0.5F, 0.0F, -0.9F, 1, 3, 2, 0.0F, false));

		handL7 = new ModelRenderer(this);
		handL7.setRotationPoint(0.0F, 2.9F, 0.025F);
		handL6.addChild(handL7);
		handL7.cubeList.add(new ModelBox(handL7, 36, 73, -0.225F, 0.0F, -0.675F, 0, 2, 1, 0.0F, false));

		handL8 = new ModelRenderer(this);
		handL8.setRotationPoint(1.5F, 3.9F, -0.1F);
		handL1.addChild(handL8);
		handL8.cubeList.add(new ModelBox(handL8, 10, 69, -0.5F, 0.0F, -0.9F, 1, 3, 2, 0.0F, false));

		handL9 = new ModelRenderer(this);
		handL9.setRotationPoint(0.0F, 2.9F, 0.025F);
		handL8.addChild(handL9);
		handL9.cubeList.add(new ModelBox(handL9, 36, 73, -0.225F, 0.0F, -0.675F, 0, 2, 1, 0.0F, false));

		body_lower = new ModelRenderer(this);
		body_lower.setRotationPoint(0.0F, -16.0F, 0.0F);
		main.addChild(body_lower);
		body_lower.cubeList.add(new ModelBox(body_lower, 0, 30, -4.0F, -1.8F, -4.0F, 8, 2, 8, 0.0F, false));
		body_lower.cubeList.add(new ModelBox(body_lower, 0, 19, -4.5F, -0.2F, -4.5F, 9, 1, 9, 0.0F, false));
		body_lower.cubeList.add(new ModelBox(body_lower, 36, 0, -4.5F, 0.7142F, -5.9142F, 9, 5, 10, 0.0F, false));
		body_lower.cubeList.add(new ModelBox(body_lower, 64, 30, -4.5F, 5.8492F, -3.9483F, 9, 1, 7, 0.0F, false));

		aaabb = new ModelRenderer(this);
		aaabb.setRotationPoint(-4.5F, 15.0F, 1.0F);
		setRotationAngle(aaabb, -0.7854F, 0.0F, 0.0F);
		body_lower.addChild(aaabb);
		aaabb.cubeList.add(new ModelBox(aaabb, 58, 40, 0.0F, -7.2125F, -14.9907F, 9, 2, 2, 0.0F, false));

		aaaaabb = new ModelRenderer(this);
		aaaaabb.setRotationPoint(0.0F, 6.4F, -4.9F);
		setRotationAngle(aaaaabb, -0.5236F, 0.0F, 0.0F);
		body_lower.addChild(aaaaabb);
		aaaaabb.cubeList.add(new ModelBox(aaaaabb, 0, 52, -4.5F, -1.0868F, -1.2212F, 9, 1, 2, 0.0F, false));

		aabbbbbb = new ModelRenderer(this);
		aabbbbbb.setRotationPoint(0.0F, 5.6132F, 4.9862F);
		setRotationAngle(aabbbbbb, 0.5236F, 0.0F, 0.0F);
		body_lower.addChild(aabbbbbb);
		aabbbbbb.cubeList.add(new ModelBox(aabbbbbb, 0, 52, -4.5F, -0.9056F, -2.3086F, 9, 1, 2, 0.0F, false));

		axel = new ModelRenderer(this);
		axel.setRotationPoint(0.0F, 7.3F, -0.5F);
		body_lower.addChild(axel);
		axel.cubeList.add(new ModelBox(axel, 0, 69, -1.0F, -1.3F, -1.0F, 2, 2, 2, 0.0F, false));
		axel.cubeList.add(new ModelBox(axel, 26, 69, -4.0F, 1.2F, -0.5F, 1, 4, 1, 0.0F, false));
		axel.cubeList.add(new ModelBox(axel, 30, 69, 3.0F, 1.2F, -0.5F, 1, 4, 1, 0.0F, false));
		axel.cubeList.add(new ModelBox(axel, 36, 61, -3.0F, 0.2F, -0.5F, 6, 1, 1, 0.0F, false));
		axel.cubeList.add(new ModelBox(axel, 36, 61, -3.0F, 5.2F, -0.5F, 6, 1, 1, 0.0F, false));

		ababbbb = new ModelRenderer(this);
		ababbbb.setRotationPoint(6.75F, 1.5F, 1.0F);
		setRotationAngle(ababbbb, 0.0F, 0.0F, 0.7854F);
		axel.addChild(ababbbb);
		ababbbb.cubeList.add(new ModelBox(ababbbb, 36, 71, -3.5709F, 1.7324F, -1.5F, 1, 1, 1, 0.0F, false));
		ababbbb.cubeList.add(new ModelBox(ababbbb, 36, 71, -4.9851F, 9.2177F, -1.5F, 1, 1, 1, 0.0F, false));
		ababbbb.cubeList.add(new ModelBox(ababbbb, 36, 69, -0.3282F, 4.9608F, -1.5F, 1, 1, 1, 0.0F, false));
		ababbbb.cubeList.add(new ModelBox(ababbbb, 36, 69, -7.8135F, 6.3751F, -1.5F, 1, 1, 1, 0.0F, false));

		wheel = new ModelRenderer(this);
		wheel.setRotationPoint(0.0F, 5.7F, 0.0F);
		axel.addChild(wheel);
		wheel.cubeList.add(new ModelBox(wheel, 0, 40, -2.0F, -3.0F, -3.0F, 4, 6, 6, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 26, 61, -2.25F, -3.0F, -4.0F, 4, 6, 1, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 26, 61, -2.25F, -3.0F, 3.0F, 4, 6, 1, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 20, 40, -2.25F, -4.0F, -3.0F, 4, 1, 6, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 20, 40, -2.25F, 3.0F, -3.0F, 4, 1, 6, 0.0F, false));

		wheel2 = new ModelRenderer(this);
		wheel2.setRotationPoint(0.0F, -2.5F, -6.0F);
		setRotationAngle(wheel2, -0.7854F, 0.0F, 0.0F);
		wheel.addChild(wheel2);
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 75, -2.25F, -2.782F, 1.0607F, 4, 1, 1, 0.0F, false));
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 75, -2.25F, -2.782F, 9.9602F, 4, 1, 1, 0.0F, false));
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 73, -2.25F, -7.4246F, 5.3033F, 4, 1, 1, 0.0F, false));
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 73, -2.25F, 1.4749F, 5.3033F, 4, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		main.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}