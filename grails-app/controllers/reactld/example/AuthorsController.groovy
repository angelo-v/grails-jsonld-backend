package reactld.example

class AuthorsController {

    def show(String username) {
        def author = Author.findByUsername(username)
        return [author: author]
    }
}
