package com.example.newsapp.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0018\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/newsapp/data/datasource/FavoritesLocalDataSource;", "", "dao", "Lcom/example/newsapp/data/local/FavoriteArticleDao;", "(Lcom/example/newsapp/data/local/FavoriteArticleDao;)V", "deleteFavorite", "", "article", "Lcom/example/newsapp/data/local/FavoriteArticle;", "(Lcom/example/newsapp/data/local/FavoriteArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavoritesFlow", "Lkotlinx/coroutines/flow/Flow;", "", "getFavoriteByUrl", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavorite", "app_debug"})
public final class FavoritesLocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsapp.data.local.FavoriteArticleDao dao = null;
    
    @javax.inject.Inject()
    public FavoritesLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.local.FavoriteArticleDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.local.FavoriteArticle article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavorite(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.local.FavoriteArticle article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.newsapp.data.local.FavoriteArticle>> getAllFavoritesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFavoriteByUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.newsapp.data.local.FavoriteArticle> $completion) {
        return null;
    }
}