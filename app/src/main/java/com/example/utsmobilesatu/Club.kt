package com.example.utsmobilesatu

data class Club(
    val name: String,
    val epl: Int, // Liga Primer Inggris
    val fa: Int, // FA
    val efl: Int, // EFL
    val champions: Int, // Liga Champions Eropa
    val uefa: Int // Liga Eropa UEFA
) {
    val totalTrophy: Int
        get() = epl + fa + efl + champions + uefa
}

// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $totalTrophy trofi, " +
            "$epl trofi Liga Primer Inggris, " +
            "$fa trofi FA, $efl trofi EFL, $champions trofi Liga Champions Eropa, " +
            "dan $uefa trofi Liga Eropa UEFA."
}
