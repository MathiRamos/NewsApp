package com.example.newsapp.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\rR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/newsapp/data/repository/NewsRepository;", "", "remoteDataSource", "Lcom/example/newsapp/data/datasource/NewsRemoteDataSource;", "localDataSource", "Lcom/example/newsapp/data/datasource/FavoritesLocalDataSource;", "(Lcom/example/newsapp/data/datasource/NewsRemoteDataSource;Lcom/example/newsapp/data/datasource/FavoritesLocalDataSource;)V", "cachedArticles", "", "Lcom/example/newsapp/data/model/Article;", "deleteFavorite", "", "article", "(Lcom/example/newsapp/data/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavoritesFlow", "Lkotlinx/coroutines/flow/Flow;", "getCachedArticles", "getFavoriteByUrl", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNews", "Lcom/example/newsapp/util/NetworkResult;", "query", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavorite", "app_debug"})
public final class NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsapp.data.datasource.NewsRemoteDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsapp.data.datasource.FavoritesLocalDataSource localDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.newsapp.data.model.Article> cachedArticles;
    
    @javax.inject.Inject()
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.datasource.NewsRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.datasource.FavoritesLocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNews(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.newsapp.util.NetworkResult<java.util.List<com.example.newsapp.data.model.Article>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.newsapp.data.model.Article> getCachedArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.newsapp.data.model.Article>> getAllFavoritesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFavoriteByUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.newsapp.data.model.Article> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavorite(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}