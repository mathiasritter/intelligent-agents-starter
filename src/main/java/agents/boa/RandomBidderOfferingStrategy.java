package agents.boa;

import genius.core.Bid;
import genius.core.bidding.BidDetails;
import genius.core.boaframework.OfferingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBidderOfferingStrategy extends OfferingStrategy {
    private static double MINIMUM_TARGET = 0.8;

    @Override
    public BidDetails determineOpeningBid() {
        return this.generateRandomBidAboveTarget();
    }

    @Override
    public BidDetails determineNextBid() {
        List<BidDetails> possibleBids = new ArrayList<>();
        possibleBids.add(this.generateRandomBidAboveTarget());
        return this.omStrategy.getBid(possibleBids);
    }

    @Override
    public String getName() {
        return "Random Bidder Offering Strategy";
    }

    private BidDetails generateRandomBidAboveTarget() {
        Bid randomBid;
        double util;
        int i = 0;
        // try 100 times to find a bid under the target utility
        do
        {
            randomBid = this.negotiationSession.getDomain().getRandomBid(new Random());
            util = this.negotiationSession.getUtilitySpace().getUtility(randomBid);
        }
        while (util < MINIMUM_TARGET && i++ < 100);
        return new BidDetails(randomBid, util);
    }
}
