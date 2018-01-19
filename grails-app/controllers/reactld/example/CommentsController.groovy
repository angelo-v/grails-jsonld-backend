package reactld.example

class CommentsController {

    def byArticle(String slug) {
        render(view: 'comments', model: [
                id: g.createLink(controller: controllerName, action: actionName, params: params),
                comments: Comment.where {
                    article.slug == slug
                }.list()])
    }
}
