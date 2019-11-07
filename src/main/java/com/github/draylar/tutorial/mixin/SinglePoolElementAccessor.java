package com.github.draylar.tutorial.mixin;

import com.github.draylar.tutorial.util.LocationAccessor;
import net.minecraft.structure.pool.SinglePoolElement;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SinglePoolElement.class)
public class SinglePoolElementAccessor implements LocationAccessor {
    @Shadow @Final protected Identifier location;

    @Override
    public Identifier getLocation() {
        return location;
    }
}
