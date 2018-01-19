package reactld.example

class RootController {

    def index() {
        return [
                message   : "test",
                navigation: [
                        new Link(url: '/about-me', title: 'About me'),
                        new Link(url: '/imprint', title: 'Imprint')
                ]
        ]
    }
}
