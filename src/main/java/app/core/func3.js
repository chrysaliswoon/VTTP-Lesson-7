var greetings = function(name) {
    console.info(`Hello ${name}`)
}

var mkGreetings = function(name) {
    return function() {
        console.info(`Hello ${name}`)
    }
}

var greetBetty = mkGreetings("Betty")
console.info(greetBetty)

greetBetty()