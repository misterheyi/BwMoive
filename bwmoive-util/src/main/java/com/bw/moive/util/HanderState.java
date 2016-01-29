package com.bw.moive.util;

import java.util.HashMap;
import java.util.Map;

public class HanderState {
	
	public static final Integer SUCCESS = 0;
	public static final Integer ERROR = 1;

	private static Map<Integer,State> state = new HashMap<Integer,State>();
	
	static{
		state.put(HanderState.SUCCESS, new State(HanderState.SUCCESS,"成功"));
		state.put(HanderState.ERROR, new State(HanderState.ERROR,"异常"));
	}
	
	public static State getState(Integer key){
		return state.get(key);
	}
	
	public static void main(String[] args) {
		System.out.println(HanderState.getState(HanderState.SUCCESS));
	}
	
}
