package reactld.example

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/articles/latest"(controller: "articles", action: "latest")

        "/articles/$urlTitle"(controller: "articles", action: "show")

        "/"(controller: "root")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
