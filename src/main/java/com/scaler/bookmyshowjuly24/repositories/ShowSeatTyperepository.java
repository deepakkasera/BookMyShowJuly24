package com.scaler.bookmyshowjuly24.repositories;

import com.scaler.bookmyshowjuly24.models.Show;
import com.scaler.bookmyshowjuly24.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatTyperepository extends JpaRepository<ShowSeatType, Long> {

    List<ShowSeatType> findAllByShow(Show show);
}
