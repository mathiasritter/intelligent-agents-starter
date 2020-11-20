package agents.boa;

import genius.core.Bid;
import genius.core.boaframework.OpponentModel;

public class RandomBidderOpponentModel extends OpponentModel {
    @Override
    protected void updateModel(Bid bid, double v) {

    }

    @Override
    public String getName() {
        return "Random Bidder Opponent Model";
    }
}
