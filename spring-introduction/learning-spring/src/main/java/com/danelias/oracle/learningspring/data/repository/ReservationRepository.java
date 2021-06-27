package com.danelias.oracle.learningspring.data.repository;

import com.danelias.oracle.learningspring.business.domain.RoomReservation;
import com.danelias.oracle.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);

}
