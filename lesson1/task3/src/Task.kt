import java.lang.CharSequence

fun joinOptions(options: Collection<String>) = options.joinToString(", ",
        "[",
        "]",
        -1,
        "...",
        null)
