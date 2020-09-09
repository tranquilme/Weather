package com.example.testapp.ui.mycity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/testapp/ui/mycity/MyCityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/testapp/ui/mycity/MyCityAdapter$MyVh;", "context", "Landroid/content/Context;", "deleteImpl", "Lcom/example/testapp/ui/mycity/DeleteImpl;", "(Landroid/content/Context;Lcom/example/testapp/ui/mycity/DeleteImpl;)V", "getContext", "()Landroid/content/Context;", "data", "", "Lcom/example/testapp/logic/model/City;", "flag", "", "tag", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAdapter", "MyVh", "app_debug"})
public final class MyCityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.testapp.ui.mycity.MyCityAdapter.MyVh> {
    private final java.lang.String tag = "MainAdapter.class";
    private int flag;
    private java.util.List<com.example.testapp.logic.model.City> data;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.example.testapp.ui.mycity.DeleteImpl deleteImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.testapp.ui.mycity.MyCityAdapter.MyVh onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.testapp.ui.mycity.MyCityAdapter.MyVh holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.testapp.logic.model.City> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public MyCityAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.testapp.ui.mycity.DeleteImpl deleteImpl) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/testapp/ui/mycity/MyCityAdapter$MyVh;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "cityLat", "Landroid/widget/TextView;", "getCityLat", "()Landroid/widget/TextView;", "cityLng", "getCityLng", "cityName", "getCityName", "app_debug"})
    public static final class MyVh extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cityName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cityLat = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cityLng = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCityName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCityLat() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCityLng() {
            return null;
        }
        
        public MyVh(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}