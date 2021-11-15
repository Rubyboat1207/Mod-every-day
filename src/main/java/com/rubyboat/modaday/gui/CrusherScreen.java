package com.rubyboat.modaday.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.GrindstoneScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CrusherScreen extends HandledScreen<CrusherScreenHandler> {

    private static final Identifier TEXTURE = new Identifier("textures/gui/container/crusher.png");

    public CrusherScreen(CrusherScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {

    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int i = (this.width - this.backgroundWidth) / 2;
        int j = (this.height - this.backgroundHeight) / 2;
        this.drawTexture(matrices, i, j, 0, 0, this.backgroundWidth, this.backgroundHeight);
        if ((((ScreenHandler) this.handler).getSlot(0).hasStack() || ((ScreenHandler) this.handler).getSlot(1).hasStack())) {
            this.drawTexture(matrices, i + 92, j + 31, this.backgroundWidth, 0, 28, 21);
        }
    }

        @Override
        public Optional<Element> hoveredElement ( double mouseX, double mouseY){
            return super.hoveredElement(mouseX, mouseY);
        }

        @Override
        public void setInitialFocus (@Nullable Element element){
            super.setInitialFocus(element);
        }

        @Override
        public void focusOn (@Nullable Element element){
            super.focusOn(element);
        }

        @Override
        public void mouseMoved ( double mouseX, double mouseY){
            super.mouseMoved(mouseX, mouseY);
        }

        @Override
        public boolean changeFocus ( boolean lookForwards){
            return super.changeFocus(lookForwards);
        }
    }
