package bits.emd.adani.SwitchYard.cbm_masterDetail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Surya on 06-07-2017.
 */

public class CbmDummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<CbmDummyItem> ITEMS = new ArrayList<CbmDummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, CbmDummyItem> ITEM_MAP = new HashMap<String, CbmDummyItem>();

    private static final int COUNT = 4;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(CbmDummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static CbmDummyItem createDummyItem(int position) {
        String x = null;
        if(position==1){
            x="cbm400kv";
        }
        else if(position==2){
            x="cbm765kv";
        }
        else if(position==3){
            x="cbm_transformer_yard";
        }else if(position==4){
            x="cbm_other";
        }
        return new CbmDummyItem(String.valueOf(position), x, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class CbmDummyItem {
        public final String id;
        public final String content;
        public final String details;

        public CbmDummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}


