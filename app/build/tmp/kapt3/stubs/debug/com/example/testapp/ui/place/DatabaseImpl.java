package com.example.testapp.ui.place;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/testapp/ui/place/DatabaseImpl;", "", "insertCity", "", "city", "Lcom/example/testapp/logic/model/City;", "queryAllNames", "", "", "app_debug"})
public abstract interface DatabaseImpl {
    
    public abstract void insertCity(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.City city);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> queryAllNames();
}