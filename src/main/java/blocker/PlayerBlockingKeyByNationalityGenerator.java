package blocker;

import de.uni_mannheim.informatik.dws.winter.matching.blockers.generators.RecordBlockingKeyGenerator;
import de.uni_mannheim.informatik.dws.winter.model.Correspondence;
import de.uni_mannheim.informatik.dws.winter.model.Matchable;
import de.uni_mannheim.informatik.dws.winter.model.Pair;
import de.uni_mannheim.informatik.dws.winter.model.defaultmodel.Attribute;
import de.uni_mannheim.informatik.dws.winter.processing.DataIterator;
import de.uni_mannheim.informatik.dws.winter.processing.Processable;
import model.Player;

public class PlayerBlockingKeyByNationalityGenerator extends
        RecordBlockingKeyGenerator<Player, Attribute> {

    private static final long serialVersionUID = 1L;


    @Override
    public void generateBlockingKeys(Player record, Processable<Correspondence<Attribute, Matchable>> correspondences, DataIterator<Pair<String, Player>> resultCollector) {
        String nationality  = record.getNationality();
        String blockingKeyValue = "";
        if (nationality.length() > 5) {
            blockingKeyValue = nationality.substring(0, 5);
        } else {
            blockingKeyValue = nationality;
        }

        resultCollector.next(new Pair<>(blockingKeyValue, record));
    }
}
