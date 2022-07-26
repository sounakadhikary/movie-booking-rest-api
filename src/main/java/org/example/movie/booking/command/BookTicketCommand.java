package org.example.movie.booking.command;

import lombok.Data;
import lombok.experimental.Accessors;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.example.movie.core.common.booking.BookingInformation;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class BookTicketCommand {

    @TargetAggregateIdentifier
    private String uniqueId;
    private BookingInformation bookingInformation;
}
