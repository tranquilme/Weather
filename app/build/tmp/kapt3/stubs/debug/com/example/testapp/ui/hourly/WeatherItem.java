package com.example.testapp.ui.hourly;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0011J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/testapp/ui/hourly/WeatherItem;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "skycon", "Landroid/widget/TextView;", "skyconImg", "Landroid/widget/ImageView;", "speed", "tem", "Lcom/example/testapp/ui/hourly/Temperature;", "time", "windDirection", "setDirection", "", "dirction", "", "setMaxTem", "max", "", "setMinTem", "min", "setSkyCon", "condition", "setSkyconImg", "img", "setSpeed", "setTem", "temperature", "setTime", "app_debug"})
public final class WeatherItem extends android.widget.LinearLayout {
    private android.widget.TextView time;
    private android.widget.TextView skycon;
    private android.widget.ImageView skyconImg;
    private com.example.testapp.ui.hourly.Temperature tem;
    private android.widget.TextView windDirection;
    private android.widget.TextView speed;
    private java.util.HashMap _$_findViewCache;
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
    }
    
    public final void setSkyCon(@org.jetbrains.annotations.NotNull()
    java.lang.String condition) {
    }
    
    public final void setSkyconImg(int img) {
    }
    
    public final void setMaxTem(int max) {
    }
    
    public final void setMinTem(int min) {
    }
    
    public final void setTem(int temperature) {
    }
    
    public final void setDirection(@org.jetbrains.annotations.NotNull()
    java.lang.String dirction) {
    }
    
    public final void setSpeed(@org.jetbrains.annotations.NotNull()
    java.lang.String speed) {
    }
    
    public WeatherItem(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}