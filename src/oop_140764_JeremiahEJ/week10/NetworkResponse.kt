package oop_140764_JeremiahEJ.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)