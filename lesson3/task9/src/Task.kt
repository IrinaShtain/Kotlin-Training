// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
        this.customers.partition {
            it.orders.filter { it.isDelivered }.size < it.orders.filter { !it.isDelivered }.size
        }.first.toSet()

