package com.example.assignment.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001\u001bB\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u000e\u001a\u00020\fJ\u001b\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u0010H\u0016\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\nH\u0016J\u001c\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/assignment/ui/RepoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/assignment/ui/RepoAdapter$SimpleRepoHolder;", "Lcom/example/assignment/util/ItemClickCallBack;", "items", "", "Lcom/example/assignment/model/database/entity/User;", "(Ljava/util/List;)V", "expandedPositionSet", "Ljava/util/HashSet;", "", "add", "", "list", "clear", "getItem", "T", "item", "(Ljava/lang/Object;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SimpleRepoHolder", "app_mockDebug"})
public final class RepoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.assignment.ui.RepoAdapter.SimpleRepoHolder> implements com.example.assignment.util.ItemClickCallBack {
    private final java.util.HashSet<java.lang.Integer> expandedPositionSet = null;
    private java.util.List<com.example.assignment.model.database.entity.User> items;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.assignment.ui.RepoAdapter.SimpleRepoHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.assignment.ui.RepoAdapter.SimpleRepoHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.assignment.model.database.entity.User> list) {
    }
    
    public final void clear() {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void getItem(T item) {
    }
    
    public RepoAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.assignment.model.database.entity.User> items) {
        super();
    }
    
    public RepoAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/assignment/ui/RepoAdapter$SimpleRepoHolder;", "Lcom/example/assignment/ui/base/DataBindingViewHolder;", "Lcom/example/assignment/model/database/entity/User;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "(Lcom/example/assignment/ui/RepoAdapter;Landroidx/databinding/ViewDataBinding;)V", "onBind", "", "t", "app_mockDebug"})
    public final class SimpleRepoHolder extends com.example.assignment.ui.base.DataBindingViewHolder<com.example.assignment.model.database.entity.User> {
        
        @java.lang.Override()
        public void onBind(@org.jetbrains.annotations.NotNull()
        com.example.assignment.model.database.entity.User t) {
        }
        
        public SimpleRepoHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding dataBinding) {
            super(null, 0, null, false);
        }
    }
}