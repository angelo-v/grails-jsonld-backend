package reactld.example

class BootStrap {

    def init = { servletContext ->
            new Article(title: "Hello World", urlTitle: 'hello-world', text: "Hello! This is my new blog.").save()
            new Article(title: "How to link data", urlTitle: 'how-to-link-data', text: "In this tutorial I will show you, how to use JSON-LD to add hyperlinks to your data.").save()
    }
    def destroy = {
    }
}
