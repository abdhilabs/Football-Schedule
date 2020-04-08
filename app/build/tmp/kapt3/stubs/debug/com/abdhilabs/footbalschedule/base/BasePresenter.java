package com.abdhilabs.footbalschedule.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/abdhilabs/footbalschedule/base/BasePresenter;", "T", "Lcom/abdhilabs/footbalschedule/base/BaseServiceCallBack;", "", "()V", "callback", "getCallback", "()Lcom/abdhilabs/footbalschedule/base/BaseServiceCallBack;", "setCallback", "(Lcom/abdhilabs/footbalschedule/base/BaseServiceCallBack;)V", "Lcom/abdhilabs/footbalschedule/base/BaseServiceCallBack;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "bindCallBack", "", "callBack", "unBind", "app_debug"})
public class BasePresenter<T extends com.abdhilabs.footbalschedule.base.BaseServiceCallBack> {
    @org.jetbrains.annotations.Nullable()
    private T callback;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    
    @org.jetbrains.annotations.Nullable()
    protected final T getCallback() {
        return null;
    }
    
    protected final void setCallback(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    public final void bindCallBack(@org.jetbrains.annotations.Nullable()
    T callBack) {
    }
    
    public final void unBind() {
    }
    
    public BasePresenter() {
        super();
    }
}