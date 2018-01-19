package reactld.example

class BootStrap {

    def init = { servletContext ->
        def pic = new Picture(url: 'https://pbs.twimg.com/profile_images/838330724004560896/RfDTeRaj_400x400.jpg').save(failOnError: true)
        def me = new Author(username: 'aveltens', displayName: "Angelo Veltens", picture: pic).save(failOnError: true)
        new Article(author: me, title: "Hello World", urlTitle: 'hello-world', text: 'Hello! This is my new blog.').save(failOnError: true)
        new Article(author: me, title: "How to link data", urlTitle: 'how-to-link-data', text: 'In this tutorial I will show you, how to use JSON-LD to add hyperlinks to your data.').save(failOnError: true)
    }
    def destroy = {
    }
}
