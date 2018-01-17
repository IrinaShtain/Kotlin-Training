// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double = orders.map { it ->
    { it.products.sumByDouble { it.price } } }
        .sumByDouble { it -> it.invoke()}
