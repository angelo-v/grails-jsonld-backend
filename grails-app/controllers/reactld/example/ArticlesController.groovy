package reactld.example

class ArticlesController {

    def latest() {
        render(view: 'articleList', model: [
                id      : g.createLink(controller: controllerName, action: actionName, params: params),
                title: "Latest Articles",
                articles: Article.findAll()
        ])
    }

    def byAuthor(String username) {
        render(view: 'articleList', model: [
                id: g.createLink(controller: controllerName, action: actionName, params: params),
                title: "Articles by $username".toString(),
                articles: Article.where {
                    author.username == username
                }.list()
        ])
    }

    def show(String slug) {
        def article = Article.findBySlug(slug)
        return [article: article]
    }
}
