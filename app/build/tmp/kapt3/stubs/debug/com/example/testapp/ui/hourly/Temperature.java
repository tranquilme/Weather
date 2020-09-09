package com.example.testapp.ui.hourly;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\b\u0010\u001a\u001a\u00020\u0014H\u0007J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/testapp/ui/hourly/Temperature;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxTem", "", "minTem", "paint", "Landroid/graphics/Paint;", "pointX", "", "pointY", "radius", "tem", "textPaint", "drawPoint", "", "canvas", "Landroid/graphics/Canvas;", "drawText", "getPointX", "getPointY", "init", "onDraw", "setMaxTem", "setMinTem", "setTem", "app_debug"})
public final class Temperature extends android.view.View {
    private float pointX;
    private float pointY;
    private int maxTem;
    private int minTem;
    private int tem;
    private final float radius = 6.0F;
    private android.graphics.Paint paint;
    private android.graphics.Paint textPaint;
    private java.util.HashMap _$_findViewCache;
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void init() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    public final void drawPoint(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    public final void drawText(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    public final void setMaxTem(int maxTem) {
    }
    
    public final void setMinTem(int minTem) {
    }
    
    public final void setTem(int tem) {
    }
    
    public final float getPointX() {
        return 0.0F;
    }
    
    public final float getPointY() {
        return 0.0F;
    }
    
    @androidx.annotation.RequiresApi(value = 23)
    public Temperature(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @androidx.annotation.RequiresApi(value = 23)
    public Temperature(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
}