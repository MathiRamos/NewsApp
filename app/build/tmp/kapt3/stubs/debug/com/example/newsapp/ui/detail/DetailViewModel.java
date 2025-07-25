package com.example.newsapp.ui.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\tJ\f\u0010\u0018\u001a\u00020\u0019*\u00020\tH\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/newsapp/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/newsapp/data/repository/NewsRepository;", "dao", "Lcom/example/newsapp/data/local/FavoriteArticleDao;", "(Lcom/example/newsapp/data/repository/NewsRepository;Lcom/example/newsapp/data/local/FavoriteArticleDao;)V", "_article", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/newsapp/data/model/Article;", "_isFavorite", "", "article", "Lkotlinx/coroutines/flow/StateFlow;", "getArticle", "()Lkotlinx/coroutines/flow/StateFlow;", "isFavorite", "addToFavorites", "", "checkIfFavorite", "url", "", "loadArticle", "removeFromFavorites", "toFavoriteEntity", "Lcom/example/newsapp/data/local/FavoriteArticle;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsapp.data.repository.NewsRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsapp.data.local.FavoriteArticleDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.newsapp.data.model.Article> _article = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.newsapp.data.model.Article> article = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isFavorite = null;
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.repository.NewsRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.local.FavoriteArticleDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.newsapp.data.model.Article> getArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    public final void loadArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private final void checkIfFavorite(java.lang.String url) {
    }
    
    public final void addToFavorites(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.model.Article article) {
    }
    
    public final void removeFromFavorites(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.model.Article article) {
    }
    
    private final com.example.newsapp.data.local.FavoriteArticle toFavoriteEntity(com.example.newsapp.data.model.Article $this$toFavoriteEntity) {
        return null;
    }
}