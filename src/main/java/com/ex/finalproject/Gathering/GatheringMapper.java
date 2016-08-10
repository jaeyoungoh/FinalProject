package com.ex.finalproject.Gathering;

import java.util.List;

public interface GatheringMapper {
	
	public void gatheringAdd(GatheringDTO gathering);
	public List<GatheringDTO> gatheringList();
	
}
