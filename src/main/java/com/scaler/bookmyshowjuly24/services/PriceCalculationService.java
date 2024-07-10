package com.scaler.bookmyshowjuly24.services;

import com.scaler.bookmyshowjuly24.models.Show;
import com.scaler.bookmyshowjuly24.models.ShowSeat;
import com.scaler.bookmyshowjuly24.models.ShowSeatType;
import com.scaler.bookmyshowjuly24.repositories.ShowSeatTyperepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculationService {
    private ShowSeatTyperepository showSeatTyperepository;

    public PriceCalculationService(ShowSeatTyperepository showSeatTyperepository) {
        this.showSeatTyperepository = showSeatTyperepository;
    }

    public int calculateAmount(List<ShowSeat> showSeats) {
        Show show = showSeats.get(0).getShow();

        List<ShowSeatType> showSeatTypes = showSeatTyperepository.findAllByShow(show);

        int amount = 0;
        for (ShowSeat showSeat : showSeats) {
            for (ShowSeatType showSeatType : showSeatTypes) {
                if (showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }

        return amount;
    }
}
