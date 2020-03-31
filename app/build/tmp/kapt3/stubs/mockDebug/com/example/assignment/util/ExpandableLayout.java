package com.example.assignment.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u0000 :2\u00020\u0001:\u0002:;B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\u0012\u0010%\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010&\u001a\u00020#H\u0014J\u0018\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0014J\u0012\u0010*\u001a\u0004\u0018\u00010\u00142\u0006\u0010+\u001a\u00020\tH\u0002J\b\u0010,\u001a\u00020\u0011H\u0016J\u000e\u0010-\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0011J\u000e\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\tJ\u000e\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u0011J\u000e\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020\u0011J\u0010\u00104\u001a\u00020#2\b\u00105\u001a\u0004\u0018\u00010\u001fJ\b\u00106\u001a\u00020#H\u0002J\u0018\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/example/assignment/util/ExpandableLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CLOSED", "CLOSING", "EXPANDED", "EXPANDING", "PREINIT", "isExpanded", "", "()Z", "mExpandAnimator", "Landroid/animation/ValueAnimator;", "mExpandDuration", "mExpandScrollTogether", "mExpandState", "getMExpandState", "()I", "setMExpandState", "(I)V", "mExpandWithParentScroll", "mExpandedViewHeight", "mOnExpandListener", "Lcom/example/assignment/util/ExpandableLayout$OnExpandListener;", "mParentAnimator", "sIsInit", "close", "", "expand", "init", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "parentScroll", "distance", "performClick", "setExpand", "setExpandDuration", "expandDuration", "setExpandScrollTogether", "expandScrollTogether", "setExpandWithParentScroll", "expandWithParentScroll", "setOnExpandListener", "onExpandListener", "toggle", "verticalAnimate", "startHeight", "endHeight", "Companion", "OnExpandListener", "app_mockDebug"})
public final class ExpandableLayout extends android.widget.LinearLayout {
    private final int PREINIT = -1;
    private final int CLOSED = 0;
    private final int EXPANDED = 1;
    private final int EXPANDING = 2;
    private final int CLOSING = 3;
    private int mExpandState = 0;
    private android.animation.ValueAnimator mExpandAnimator;
    private android.animation.ValueAnimator mParentAnimator;
    private int mExpandedViewHeight = 0;
    private boolean sIsInit = true;
    private int mExpandDuration = 300;
    private boolean mExpandWithParentScroll = false;
    private boolean mExpandScrollTogether = false;
    private com.example.assignment.util.ExpandableLayout.OnExpandListener mOnExpandListener;
    private static final java.lang.String TAG = null;
    private static final int EXPAND_DURATION = 300;
    public static final com.example.assignment.util.ExpandableLayout.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getMExpandState() {
        return 0;
    }
    
    public final void setMExpandState(int p0) {
    }
    
    private final void init(android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    private final void verticalAnimate(int startHeight, int endHeight) {
    }
    
    private final android.animation.ValueAnimator parentScroll(int distance) {
        return null;
    }
    
    public final void setExpand(boolean expand) {
    }
    
    public final boolean isExpanded() {
        return false;
    }
    
    private final void toggle() {
    }
    
    private final void expand() {
    }
    
    private final void close() {
    }
    
    @java.lang.Override()
    public boolean performClick() {
        return false;
    }
    
    public final void setOnExpandListener(@org.jetbrains.annotations.Nullable()
    com.example.assignment.util.ExpandableLayout.OnExpandListener onExpandListener) {
    }
    
    public final void setExpandScrollTogether(boolean expandScrollTogether) {
    }
    
    public final void setExpandWithParentScroll(boolean expandWithParentScroll) {
    }
    
    public final void setExpandDuration(int expandDuration) {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public ExpandableLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public ExpandableLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ExpandableLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/assignment/util/ExpandableLayout$OnExpandListener;", "", "onExpand", "", "expanded", "", "app_mockDebug"})
    public static abstract interface OnExpandListener {
        
        public abstract void onExpand(boolean expanded);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/assignment/util/ExpandableLayout$Companion;", "", "()V", "EXPAND_DURATION", "", "TAG", "", "kotlin.jvm.PlatformType", "app_mockDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}