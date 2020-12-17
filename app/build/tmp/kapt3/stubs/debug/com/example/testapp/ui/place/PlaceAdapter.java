package com.example.testapp.ui.place;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/testapp/ui/place/PlaceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/testapp/ui/place/PlaceAdapter$ViewHolder;", "fragment", "Lcom/example/testapp/ui/place/PlaceFragment;", "list", "", "Lcom/example/testapp/logic/model/Place;", "(Lcom/example/testapp/ui/place/PlaceFragment;Ljava/util/List;)V", "getList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class PlaceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.testapp.ui.place.PlaceAdapter.ViewHolder> {
    private final com.example.testapp.ui.place.PlaceFragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.testapp.logic.model.Place> list = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.testapp.ui.place.PlaceAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.testapp.ui.place.PlaceAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.testapp.logic.model.Place> getList() {
        return null;
    }
    
    public PlaceAdapter(@org.jetbrains.annotations.NotNull()
    com.example.testapp.ui.place.PlaceFragment fragment, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.testapp.logic.model.Place> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/testapp/ui/place/PlaceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/testapp/ui/place/PlaceAdapter;Landroid/view/View;)V", "place_address", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getPlace_address", "()Landroid/widget/TextView;", "place_name", "getPlace_name", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView place_name = null;
        private final android.widget.TextView place_address = null;
        
        public final android.widget.TextView getPlace_name() {
            return null;
        }
        
        public final android.widget.TextView getPlace_address() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}