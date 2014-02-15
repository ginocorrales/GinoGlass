package com.example.ginoglass.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.example.ginoglass.dummy.DummyContent.DummyItem;
//import com.example.ginoglass.dummy.DummyContent.GinoItem;

public class GinoContent {
	
	public static List<GinoItem> ITEMSS = new ArrayList<GinoItem>();
	public static Map<String, GinoItem> ITEM_MAPP = new HashMap<String, GinoItem>();

	static {
		// Add 3 sample items.
		addItemGino(new GinoItem("11", "Item 11"));
		addItemGino(new GinoItem("22", "Item 22"));
	}
	
	private static void addItemGino(GinoItem item) {
		ITEMSS.add(item);
		ITEM_MAPP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class GinoItem {
		public String id;
		public String content;

		public GinoItem(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
