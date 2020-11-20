package agents.boa;

import genius.core.boaframework.*;
import genius.core.parties.NegotiationInfo;

import java.util.Collections;
import java.util.Map;

public class RandomBidderBoa extends BoaParty {

    @Override
    public void init(NegotiationInfo info) {
        OfferingStrategy os = new RandomBidderOfferingStrategy();
        AcceptanceStrategy ac = new RandomBidderAcceptanceStrategy();
        OpponentModel om = new RandomBidderOpponentModel();
        OMStrategy oms = new RandomBidderOMStrategy();

        Map<String, Double> noParams = Collections.emptyMap();
        configure(ac, noParams,
                os,	noParams,
                om, noParams,
                oms, noParams);

        super.init(info);
    }

    @Override
    public String getDescription() {
        return "Random Bidder BOA Party";
    }
}
