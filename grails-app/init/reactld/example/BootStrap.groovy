package reactld.example

class BootStrap {

    def init = { servletContext ->
        def pic = new Picture(url: 'https://pbs.twimg.com/profile_images/838330724004560896/RfDTeRaj_400x400.jpg').save(failOnError: true)
        def me = new Author(username: 'aveltens', displayName: "Angelo Veltens", description: 'IT-Consultant and Developer @codecentric', picture: pic).save(failOnError: true)
        new Article(author: me, title: "Hello World", slug: 'hello-world', text: 'Hello! This is my new blog.').save(failOnError: true)
        new Article(author: me, title: "How to link data", slug: 'how-to-link-data', text: 'In this tutorial I will show you, how to use JSON-LD to add hyperlinks to your data.').save(failOnError: true)
        def pic2 = new Picture(url: 'https://dummyimage.com/200x200/0218bd/ffffff.png&text=ME').save(failOnError: true)
        def someone = new Author(username: 'someone', displayName: "John Doe", description: 'Someone who writes blog articles', picture: pic2).save(failOnError: true)
        new Article(author: someone, title: "10 things to blog about", slug: '10-things', text: 'I want to show you 10 things that are worth blogging about.').save(failOnError: true)
        new Article(author: someone, title: "Stuff you should know", slug: 'stuff', text: 'You will not believe this stuff!').save(failOnError: true)
    }
    def destroy = {
    }
}
