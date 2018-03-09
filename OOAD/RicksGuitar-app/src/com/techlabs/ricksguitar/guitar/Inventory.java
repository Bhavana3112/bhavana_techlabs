package com.techlabs.ricksguitar.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
		private List<Guitar> guitars = new LinkedList<Guitar>();
		private Iterator<Guitar> iterator = guitars.iterator();

		public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
			guitars.add(new Guitar(serialNumber, price, spec));
		}

		public Guitar getGuitar(String serialNumber) {
			while (iterator.hasNext()) {
				if (iterator.next().getSerialNumber().equals(serialNumber))
					return iterator.next();
			}
			return null;
		}

		public List<Guitar> search(GuitarSpec searchSpec) {
			List<Guitar> matchingGuitars = new LinkedList<Guitar>();

			while (iterator.hasNext()) {
				if (iterator.next().getSpec().matches(searchSpec))
					matchingGuitars.add(iterator.next());
			}

			return matchingGuitars;
		}

}
