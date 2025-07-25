package com.example.newsapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007\u001aB\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007\u001a\u001e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0010\u001a\u00020\u0001H\u0007\u00a8\u0006\u0011"}, d2 = {"ArticleItem", "", "article", "Lcom/example/newsapp/data/model/Article;", "onClick", "Lkotlin/Function0;", "onDeleteClick", "ArticleList", "articles", "", "onItemClick", "Lkotlin/Function1;", "ErrorMessage", "message", "", "onRetry", "LoadingIndicator", "app_debug"})
public final class ComponentsKt {
    
    @androidx.compose.runtime.Composable()
    public static final void LoadingIndicator() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRetry) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ArticleList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.newsapp.data.model.Article> articles, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.newsapp.data.model.Article, kotlin.Unit> onItemClick, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.newsapp.data.model.Article, kotlin.Unit> onDeleteClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ArticleItem(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClick) {
    }
}