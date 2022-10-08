package com.agenda.http

import com.agenda.domain.domain.Event
import com.agenda.domain.ports.EventGateway
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

@RestController
@Path("/event")
class EventHttp : EventGateway {

    @PostMapping("/")
    override fun create(
        @RequestBody event: Event
    ): Event {
        TODO("Not yet implemented")
    }

    @PutMapping("/{id}")
    override fun updateById(
        @RequestBody event: Event,
        @RequestParam(required = true) id: String
    ): Event {
        TODO("Not yet implemented")
    }

    @DeleteMapping("/{id}")
    override fun deleteById(
        @PathVariable(required = true) id: String
    ): Event {
        TODO("Not yet implemented")
    }

    @GetMapping("/date")
    override fun showByDate(
        @RequestParam(required = false) date: LocalDate
    ): List<Event> {
        TODO("Not yet implemented")
    }

    @GetMapping("/date")
    override fun showByRangeDate(
        @QueryParam("startDate") startDate: LocalDate,
        @QueryParam("endDate") endDate: LocalDate
    ): String {
        return "startDate = $startDate and endDate = $endDate"
    }

    @GetMapping("/{id}")
    override fun showById(@PathVariable("id") id: String): Event {
        TODO()
    }
}