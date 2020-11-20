package agents.boa;

import genius.core.Bid;
import genius.core.bidding.BidDetails;
import genius.core.boaframework.AcceptanceStrategy;
import genius.core.boaframework.Actions;

public class RandomBidderAcceptanceStrategy extends AcceptanceStrategy {
    @Override
    public Actions determineAcceptability() {
        Bid lastBid = this.negotiationSession.getOpponentBidHistory().getLastBidDetails().getBid();
        double lastBidUtility = this.negotiationSession.getUtilitySpace().getUtility(lastBid);
        double reservationValue = this.negotiationSession.getUtilitySpace().getReservationValue();

        if (this.negotiationSession.getTime() >= 0.9 && lastBidUtility >= reservationValue) {
            return Actions.Accept;
        }

        return Actions.Reject;
    }

    @Override
    public String getName() {
        return "Random Bidder Acceptance Strategy";
    }
}
