package com.anthonyhilyard.iceberg.util;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;

public class GuiHelper
{
	public static void drawGradientRect(GuiGraphics graphics, int left, int top, int right, int bottom, int startColor, int endColor)
	{
		graphics.fillGradient(left, top, right, bottom, startColor, endColor);
	}

	public static void blit(GuiGraphics graphics, Identifier texture, int x, int y, int width, int height, float texX, float texY, int texWidth, int texHeight, int fullWidth, int fullHeight)
	{
		graphics.blit(RenderPipelines.GUI_TEXTURED, texture, x, y, texX, texY, width, height, fullWidth, fullHeight);
	}

	public static void blit(GuiGraphics graphics, Identifier texture, int x, int y, int width, int height, float texX, float texY, int texWidth, int texHeight, int fullWidth, int fullHeight, int color)
	{
		graphics.blit(RenderPipelines.GUI_TEXTURED, texture, x, y, texX, texY, width, height, fullWidth, fullHeight, color);
	}
}