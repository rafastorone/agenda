package com.agenda.domain.ports

import com.agenda.domain.domain.Event
import java.time.LocalDate

interface EventGateway {

    fun create(event: Event): Event
    fun updateById(event: Event, id: String): Event
    fun deleteById(id: String): Event
    fun showByDate(date: LocalDate): List<Event>
    fun showByRangeDate(dateStart: LocalDate, dateEnd: LocalDate): List<Event>
    fun showById(id: String): Event
}