package reactld.example

class ArticlesController {

    def latest() {
        return [articles: Article.findAll()]
    }

    def show(String urlTitle) {
        return [article: Article.findByUrlTitle(urlTitle)]
    }
}
