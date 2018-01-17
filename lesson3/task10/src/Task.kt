// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    var allProducts = this.customers.flatMap { it.orders }.flatMap { it.products }.toSet()

    return customers.map { it.orders.flatMap { it.products } }.fold(allProducts,
            { all, elem -> all.intersect(elem) })


}
