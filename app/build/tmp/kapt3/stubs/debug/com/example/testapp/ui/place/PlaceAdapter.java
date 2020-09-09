package com.example.testapp.ui.place;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/testapp/ui/place/PlaceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/testapp/ui/place/PlaceAdapter$ViewHolder;", "fragment", "Lcom/example/testapp/ui/place/PlaceFragment;", "list", "", "Lcom/example/testapp/logic/model/Place;", "databaseImpl", "Lcom/example/testapp/ui/place/DatabaseImpl;", "(Lcom/example/testapp/ui/place/PlaceFragment;Ljava/util/List;Lcom/example/testapp/ui/place/DatabaseImpl;)V", "tag", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class PlaceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.testapp.ui.place.PlaceAdapter.ViewHolder> {
    private final java.lang.String tag = "PlaceAdapter.class";
    private final com.example.testapp.ui.place.PlaceFragment fragment = null;
    private final java.util.List<com.example.testapp.logic.model.Place> list = null;
    private final com.example.testapp.ui.place.DatabaseImpl databaseImpl = null;
    
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
    
    public PlaceAdapter(@org.jetbrains.annotations.NotNull()
    com.example.testapp.ui.place.PlaceFragment fragment, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.testapp.logic.model.Place> list, @org.jetbrains.annotations.NotNull()
    com.example.testapp.ui.place.DatabaseImpl databaseImpl) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/testapp/ui/place/PlaceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/testapp/ui/place/PlaceAdapter;Landroid/view/View;)V", "placeAddres", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getPlaceAddres", "()Landroid/widget/TextView;", "placeName", "getPlaceName", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView placeName = null;
        private final android.widget.TextView placeAddres = null;
        
        public final android.widget.TextView getPlaceName() {
            return null;
        }
        
        public final android.widget.TextView getPlaceAddres() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}