//? General Power Function
var power = function (x, n) {
  var result = 1;
  for (var i = 0; i < n; i++) result *= x;
  return result;
};
console.info("power is", power(2, 3));

var mkPower = function(n) { //? Free variable
    return function(x) { //? Bound variable - Because declared locally
        var result = 1;
        for (var i = 0; i < n; i++) result *= x;
        return result;
    }
}

var square = mkPower (2)
var cube = mkPower (3)
console.info("4^2", square(4));
console.info("4^3", cube(4));

