package com.ex.finalproject.Gathering;

import java.util.List;

public interface GatheringService {
	
	public void gatheringAdd(GatheringDTO gathering);

	public List<GatheringDTO> gatheringList();	

}
