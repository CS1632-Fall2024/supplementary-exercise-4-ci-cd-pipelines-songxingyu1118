package edu.pitt.cs;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*; 

public interface RentACat {
	public static RentACat createInstance(InstanceType type) {
		switch (type) {
			case IMPL:
				return new RentACatImpl();
			case BUGGY:
				return new RentACatBuggy();
			case SOLUTION:
				return new RentACatSolution();
			case MOCK:
				RentACat mockedRentACat = Mockito.mock(RentACat.class);
				when(mockedRentACat.listCats()).thenReturn("");
				when(mockedRentACat.rentCat(anyInt())).thenReturn(true);
				when(mockedRentACat.returnCat(anyInt())).thenReturn(true);
				when(mockedRentACat.renameCat(anyInt(), anyString())).thenReturn(true);
				// TODO: Return a mock object that emulates the behavior of a real object.
				return mockedRentACat;
			default:
				assert (false);
				return null;
		}
	}

	// WARNING: You are not allowed to change any part of the interface.
	// That means you cannot add any method nor modify any of these methods.

	public boolean returnCat(int id);

	public boolean rentCat(int id);

	public boolean renameCat(int id, String name);

	public String listCats();

	public void addCat(Cat c);
}
