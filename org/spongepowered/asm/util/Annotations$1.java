package org.spongepowered.asm.util;

import com.google.common.base.*;
import org.spongepowered.asm.lib.tree.*;

static final class Annotations$1 implements Function<AnnotationNode, String> {
    Annotations$1() {
        super();
    }
    
    @Override
    public String apply(final AnnotationNode a1) {
        return a1.desc;
    }
    
    @Override
    public /* bridge */ Object apply(final Object o) {
        return this.apply((AnnotationNode)o);
    }
}