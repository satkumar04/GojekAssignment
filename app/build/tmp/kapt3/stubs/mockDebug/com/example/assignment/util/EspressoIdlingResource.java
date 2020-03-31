package com.example.assignment.util;

import java.lang.System;

/**
 * Contains a static reference to [IdlingResource], only available in the 'mock' build type.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/assignment/util/EspressoIdlingResource;", "", "()V", "INSTANCE", "app_mockDebug"})
public final class EspressoIdlingResource {
    private static final java.lang.String RESOURCE = "GLOBAL";
    private static final com.example.assignment.util.SimpleCountingIdlingResource mCountingIdlingResource = null;
    public static final com.example.assignment.util.EspressoIdlingResource.INSTANCE INSTANCE = null;
    
    public EspressoIdlingResource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/assignment/util/EspressoIdlingResource$INSTANCE;", "", "()V", "RESOURCE", "", "idlingResource", "Landroidx/test/espresso/IdlingResource;", "getIdlingResource", "()Landroidx/test/espresso/IdlingResource;", "mCountingIdlingResource", "Lcom/example/assignment/util/SimpleCountingIdlingResource;", "decrement", "", "increment", "app_mockDebug"})
    public static final class INSTANCE {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.test.espresso.IdlingResource getIdlingResource() {
            return null;
        }
        
        public final void increment() {
        }
        
        public final void decrement() {
        }
        
        private INSTANCE() {
            super();
        }
    }
}