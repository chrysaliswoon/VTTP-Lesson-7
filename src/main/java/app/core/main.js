function greetings(name) {
    console.info(`Hello ${name}`)
}
console.info("Hello World");
greetings('fred');
greetings('barney');


var apply = function(f, v0, v1) {
    return f(v0, v1)
}

var o = [add, 5, 10, mul, 10, 20]
console.info('calculate', apply(o[0], o[1], o[2]))