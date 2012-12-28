package org.usergrid.vx.experimental;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.cassandra.db.ConsistencyLevel;

/* class that holds properties for the request lifecycle */
public class IntraState {

	String currentKeyspace="";
	String currentColumnFamily="";
	boolean autoTimestamp= true;
	long nanotime = System.nanoTime();
	ConsistencyLevel consistency= ConsistencyLevel.ONE;
	//TODO this is cookie cutter
	Map<IntraMetaData,String> meta = new HashMap<IntraMetaData,String>();
}
