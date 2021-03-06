package org.spongepowered.tools.obfuscation;

import org.spongepowered.tools.obfuscation.mapping.*;
import org.spongepowered.asm.obfuscation.mapping.common.*;
import java.util.*;
import org.spongepowered.asm.obfuscation.mapping.*;

static class UniqueMappings implements IMappingConsumer
{
    private final IMappingConsumer mappings;
    private final Map<ObfuscationType, Map<MappingField, MappingField>> fields;
    private final Map<ObfuscationType, Map<MappingMethod, MappingMethod>> methods;
    
    public UniqueMappings(final IMappingConsumer a1) {
        super();
        this.fields = new HashMap<ObfuscationType, Map<MappingField, MappingField>>();
        this.methods = new HashMap<ObfuscationType, Map<MappingMethod, MappingMethod>>();
        this.mappings = a1;
    }
    
    @Override
    public void clear() {
        this.clearMaps();
        this.mappings.clear();
    }
    
    protected void clearMaps() {
        this.fields.clear();
        this.methods.clear();
    }
    
    @Override
    public void addFieldMapping(final ObfuscationType a1, final MappingField a2, final MappingField a3) {
        if (!this.checkForExistingMapping(a1, (IMapping)a2, (IMapping)a3, (Map)this.fields)) {
            this.mappings.addFieldMapping(a1, a2, a3);
        }
    }
    
    @Override
    public void addMethodMapping(final ObfuscationType a1, final MappingMethod a2, final MappingMethod a3) {
        if (!this.checkForExistingMapping(a1, (IMapping)a2, (IMapping)a3, (Map)this.methods)) {
            this.mappings.addMethodMapping(a1, a2, a3);
        }
    }
    
    private <TMapping extends java.lang.Object> boolean checkForExistingMapping(final ObfuscationType a1, final TMapping a2, final TMapping a3, final Map<ObfuscationType, Map<TMapping, TMapping>> a4) throws MappingConflictException {
        Map<TMapping, TMapping> v1 = a4.get(a1);
        if (v1 == null) {
            v1 = new HashMap<TMapping, TMapping>();
            a4.put(a1, v1);
        }
        final TMapping v2 = v1.get(a2);
        if (v2 == null) {
            v1.put(a2, a3);
            return false;
        }
        if (v2.equals((Object)a3)) {
            return true;
        }
        throw new MappingConflictException((IMapping<?>)v2, (IMapping<?>)a3);
    }
    
    @Override
    public MappingSet<MappingField> getFieldMappings(final ObfuscationType a1) {
        return this.mappings.getFieldMappings(a1);
    }
    
    @Override
    public MappingSet<MappingMethod> getMethodMappings(final ObfuscationType a1) {
        return this.mappings.getMethodMappings(a1);
    }
}
