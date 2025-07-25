package com.example.newsapp.ui.favorites;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/newsapp/ui/favorites/FavoritesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/newsapp/data/repository/NewsRepository;", "(Lcom/example/newsapp/data/repository/NewsRepository;)V", "favorites", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/example/newsapp/data/model/Article;", "getFavorites", "()Lkotlinx/coroutines/flow/StateFlow;", "addFavorite", "", "article", "removeFavorite", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FavoritesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.newsapp.data.repository.NewsRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.newsapp.data.model.Article>> favorites = null;
    
    @javax.inject.Inject()
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.repository.NewsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.newsapp.data.model.Article>> getFavorites() {
        return null;
    }
    
    public final void removeFavorite(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.model.Article article) {
    }
    
    public final void addFavorite(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.data.model.Article article) {
    }
}