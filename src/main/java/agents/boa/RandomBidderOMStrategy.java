package agents.boa;

import genius.core.bidding.BidDetails;
import genius.core.boaframework.OMStrategy;

import java.util.List;

public class RandomBidderOMStrategy extends OMStrategy {

    @Override
    public BidDetails getBid(List<BidDetails> list) {
        return list.get(0);
    }

    @Override
    public boolean canUpdateOM() {
        return false;
    }

    @Override
    public String getName() {
        return "Random Bidder Opponent Model Strategy";
    }
}
