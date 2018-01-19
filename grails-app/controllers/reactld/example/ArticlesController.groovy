package reactld.example

class ArticlesController {

    def latest() {
        return [articles: Article.findAll()]
    }

    def show(String urlTitle) {
        def article = Article.findByUrlTitle(urlTitle)
        return [article: article]
    }
}
