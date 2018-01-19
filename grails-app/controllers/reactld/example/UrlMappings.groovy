package reactld.example

class UrlMappings {

    static mappings = {

        "/articles/latest"(controller: "articles", action: "latest")
        "/articles/$urlTitle"(controller: "articles", action: "show")

        "/authors/$username"(controller: "authors", action: "show")

        "/"(controller: "root")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
