package com.agenda.http

import com.agenda.domain.domain.Event
import com.agenda.domain.ports.EventGateway
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import java.time.LocalDate

class EventHttp : EventGateway {

    @PostMapping("/event")
    override fun create(
        @RequestBody event: Event
    ): Event {
        TODO("Not yet implemented")
    }

    @PutMapping("/event")
    override fun updateById(
        @RequestBody event: Event,
        @RequestParam(required = true) id: String
    ): Event {
        TODO("Not yet implemented")
    }

    @DeleteMapping("/event")
    override fun deleteById(
        @RequestParam(required = true) id: String
    ): Event {
        TODO("Not yet implemented")
    }

    @GetMapping("/event")
    override fun showByDate(
        @RequestParam(required = false) date: LocalDate
    ): List<Event> {
        TODO("Not yet implemented")
    }

    @GetMapping("/event")
    override fun showByRangeDate(
        @RequestParam(required = false) dateStart: LocalDate,
        @RequestParam(required = false) dateEnd: LocalDate
    ): List<Event> {
        TODO("Not yet implemented")
    }

    @GetMapping("/event")
    override fun showById(
        @RequestParam(required = false) id: String
    ): Event {
        TODO("Not yet implemented")
    }
}