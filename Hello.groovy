@Grapes([
    @Grab("org.gebish:geb-core:1.1.1"),
    @Grab("org.seleniumhq.selenium:selenium-chrome-driver:3.4.0"),
    @Grab("org.seleniumhq.selenium:selenium-support:3.4.0")
])

import geb.Browser

Browser.drive {
    go "https://google.com/"
    report "google home page"
}.quit()
