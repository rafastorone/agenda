package com.agenda.domain.domain

import java.time.Instant

data class Event(
    val name: String,
    val date: Instant,
    val timeStart: Instant,
    val timeEnd: Instant,
    val description: String,
    val place: String,
    val guests: List<Guest>
)

data class Guest(
    val name: String,
    val email: String,
    val phone: String?
)
