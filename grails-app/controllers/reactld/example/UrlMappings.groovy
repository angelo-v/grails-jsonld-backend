package reactld.example

class UrlMappings {

    static mappings = {

        "/articles/latest"(controller: "articles", action: "latest")
        "/articles/$slug"(controller: "articles", action: "show")
        "/articles/$slug/comments"(controller: "comments", action: "byArticle")

        "/authors/$username"(controller: "authors", action: "show")
        "/authors/$username/articles"(controller: "articles", action: "byAuthor")

        "/"(controller: "root")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
