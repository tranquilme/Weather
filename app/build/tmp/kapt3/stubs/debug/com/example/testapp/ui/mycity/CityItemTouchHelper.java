package com.example.testapp.ui.mycity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J@\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/testapp/ui/mycity/CityItemTouchHelper;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "()V", "tag", "", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getMovementFlags", "", "getSwipeEscapeVelocity", "", "defaultValue", "getSwipeThreshold", "onChildDraw", "c", "Landroid/graphics/Canvas;", "dX", "dY", "actionState", "isCurrentlyActive", "", "onMove", "target", "onSelectedChanged", "onSwiped", "direction", "app_debug"})
public final class CityItemTouchHelper extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    private final java.lang.String tag = "SimpleItem.class";
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSelectedChanged(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int actionState) {
    }
    
    @java.lang.Override()
    public void clearView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override()
    public float getSwipeThreshold(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getSwipeEscapeVelocity(float defaultValue) {
        return 0.0F;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    public CityItemTouchHelper() {
        super();
    }
}