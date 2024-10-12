package com.example.project_1

// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan list0f
// List Mutable menggunakan mutableList0f

fun ContohList() {
    println(" === List === ")
// List Read-Only
val readOnlyAbjad = listOf ("A", "B", "C" )
    println(readOnlyAbjad)
//List Mutable
 val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
 println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable
    shape. remove("Triangle")
    println(shape)

    // Mengubah data di dalam List Mutable
    shape [0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)

}
// Map adalah Kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan map0f
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {

    println()
    println(" === Map === ")
// Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)
}

