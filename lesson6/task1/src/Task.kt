import java.util.*

fun <T,H: MutableCollection<T>> Collection<T>.partitionTo(listHead : H, listBody: H, predicate : (T) -> Boolean ) : Pair<H,H> {
    this.forEach{
        val isPredicate = predicate.invoke(it)
        if(isPredicate) listHead.add(it)
        else listBody.add(it)
    }
    return Pair(listHead,listBody)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").
            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
