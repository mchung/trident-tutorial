package tutorial.storm.trident.operations;

import storm.trident.operation.BaseFilter;
import storm.trident.tuple.TridentTuple;
import tutorial.storm.trident.testutil.Content;


/**
 * @author Enno Shioji (enno.shioji@peerindex.com)
 */
public class OnlyHashtags extends BaseFilter {
    @Override
    public boolean isKeep(TridentTuple tuple) {
        Content content = (Content)tuple.get(0);
        return "hashtag".equals(content.getContentType());
    }
}
