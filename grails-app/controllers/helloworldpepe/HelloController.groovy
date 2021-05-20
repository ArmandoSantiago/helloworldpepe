package helloworldpepe

import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder

class HelloController {

    MessageSource messageSource

    def index() {
        def msg = messageSource.getMessage('default.created.message', ['Persona', 'Juan'] as Object[], 'No loncontro', LocaleContextHolder.locale)
        render "Hola $msg"
    }
}
